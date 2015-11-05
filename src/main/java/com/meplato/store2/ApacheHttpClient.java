/*
 * Copyright (c) 2015 Meplato GmbH, Switzerland.
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
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * ApacheHttpClient implements Client for org.apache.http.
 */
public class ApacheHttpClient implements Client {
    /**
     * Apache HTTP client
     */
    private final CloseableHttpClient httpClient;

    /**
     * Instantiates a new instance of ApacheHttpClient.
     */
    public ApacheHttpClient() {
        httpClient = HttpClients.createDefault();
    }

    /**
     * Instantiates a new instance of ApacheHttpClient with the given
     * CloseableHttpClient.
     *
     * @param client the closable HTTP client to use
     */
    public ApacheHttpClient(CloseableHttpClient client) {
        httpClient = client;
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

        // Body
        HttpEntity requestEntity = null;
        if (body != null) {
            Gson gson = Service.getSerializer();
            try {
                requestEntity = new StringEntity(gson.toJson(body));
            } catch (UnsupportedEncodingException e) {
                throw new ServiceException("Error serializing body", null, e);
            }
        }

        // Do HTTP request
        HttpRequestBase httpRequest = null;
        if (method.equalsIgnoreCase("GET")) {
            httpRequest = new HttpGet(url);
        } else if (method.equalsIgnoreCase("POST")) {
            HttpPost httpPost = new HttpPost(url);
            if (requestEntity != null) {
                httpPost.setEntity(requestEntity);
            }
            httpRequest = httpPost;
        } else if (method.equalsIgnoreCase("PUT")) {
            HttpPut httpPut = new HttpPut(url);
            if (requestEntity != null) {
                httpPut.setEntity(requestEntity);
            }
            httpRequest = httpPut;
        } else if (method.equalsIgnoreCase("DELETE")) {
            httpRequest = new HttpDelete(url);
        } else if (method.equalsIgnoreCase("PATCH")) {
            HttpPatch httpPatch = new HttpPatch(url);
            if (requestEntity != null) {
                httpPatch.setEntity(requestEntity);
            }
            httpRequest = httpPatch;
        } else if (method.equalsIgnoreCase("HEAD")) {
            httpRequest = new HttpHead(url);
        } else if (method.equalsIgnoreCase("OPTIONS")) {
            httpRequest = new HttpOptions(url);
        } else {
            throw new ServiceException("Invalid HTTP method: " + method, null, null);
        }

        // Headers
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpRequest.addHeader(entry.getKey(), entry.getValue());
        }
        httpRequest.setHeader("Accept", "application/json");
        httpRequest.setHeader("Accept-Charset", "utf-8");
        httpRequest.setHeader("Content-Type", "application/json");
        httpRequest.setHeader("User-Agent", Service.USER_AGENT);

        try (CloseableHttpResponse httpResponse = httpClient.execute(httpRequest)) {
            Response response = new ApacheHttpResponse(httpResponse);
            int statusCode = response.getStatusCode();
            if (statusCode >= 200 && statusCode < 300) {
                return response;
            }
            throw ServiceException.fromResponse(response);
        } catch (ClientProtocolException e) {
            throw new ServiceException("Client Protocol Exception", null, e);
        } catch (IOException e) {
            throw new ServiceException("IO Exception", null, e);
        }
    }
}
