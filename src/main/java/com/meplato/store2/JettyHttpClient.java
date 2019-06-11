/*
 * Copyright (c) 2015-2016 Meplato GmbH, Switzerland.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.meplato.store2;

import com.damnhandy.uri.template.UriTemplate;
import com.google.gson.Gson;
import com.meplato.store2.internal.GsonUtil;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.StringContentProvider;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * JettyHttpClient implements Client by means of org.eclipse.jetty.client.HttpClient.
 * <p>
 * See http://www.eclipse.org/jetty/documentation/current/http-client-other.html
 * for information about setting a HTTP proxy.
 */
public class JettyHttpClient implements Client {
    /**
     * Jetty HTTP client (capable of HTTP/2.0)
     */
    private final HttpClient httpClient;

    /**
     * Timeout for requests (in seconds)
     */
    private long timeout;

    /**
     * User Agent.
     */
    public static String USER_AGENT = "meplato-api-java-version-jetty/1.0.0";

    /**
     * Instantiates a new instance of JettyHttpClient with the given
     * HttpClient.
     * <p>
     * The caller is responsible for starting the HTTP Client.
     *
     * @param client the configured Jetty HTTP client to use
     */
    public JettyHttpClient(HttpClient client) {
        httpClient = client;
    }

    /**
     * Returns the timeout for requests (default: 15 seconds).
     *
     * @return Timeout for requests (in seconds)
     */
    public long getTimeout() {
        return this.timeout;
    }

    /**
     * Sets the timeout for requests.
     *
     * @param timeout Timeout for requests (in seconds)
     */
    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    /**
     * Execute runs a HTTP request/response with an API endpoint.
     *
     * @param method      the HTTP method, e.g. POST or GET
     * @param uriTemplate the URI template according to RFC 6570
     * @param parameters  the query string parameters
     * @param headers     the key/value pairs for the HTTP header
     * @param body        the body of the request or {@code null}
     * @return the HTTP response encapsulated by {@link Response}.
     * @throws ServiceException if e.g. the service is unavailable.
     */
    @Override
    public Response execute(String method, String uriTemplate, Map<String, Object> parameters, Map<String, String> headers, Object body) throws ServiceException {
        // URI template parameters
        String url = UriTemplate.fromTemplate(uriTemplate).expand(parameters);

        Request request = this.httpClient.newRequest(url).method(method);

        if (this.getTimeout() > 0) {
            request = request.timeout(timeout, TimeUnit.SECONDS);
        }

        // Body handling
        if (body != null) {
            Gson gson = GsonUtil.getSerializer();
            request = request.content(new StringContentProvider(gson.toJson(body), "UTF-8"), "application/json");
        }

        // Headers
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            request = request.header(entry.getKey(), entry.getValue());
        }
        request = request.header("Accept", "application/json");
        request = request.header("Accept-Charset", "utf-8");
        request = request.header("Content-Type", "application/json; charset=utf-8");

        try {
            ContentResponse httpResponse = request.send();
            Response response = new JettyHttpResponse(httpResponse);
            int statusCode = response.getStatusCode();
            if (statusCode >= 200 && statusCode < 300) {
                return response;
            }
            throw ServiceException.fromResponse(response);
        } catch (InterruptedException e) {
            throw new ServiceException("Client InterruptedException", 500, null, e);
        } catch (TimeoutException e) {
            throw new ServiceException("Client Timeout", 500, null, e);
        } catch (ExecutionException e) {
            throw new ServiceException("Client Execution Exception", 500, null, e);
        }
    }
}
