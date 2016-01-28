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

import com.google.gson.Gson;
import org.eclipse.jetty.client.api.ContentResponse;

/**
 * JettyHttpResponse implements Response by means of org.eclipse.jetty.client.
 */
public class JettyHttpResponse implements Response {
    /**
     * Status code of the HTTP response.
     */
    private final int statusCode;
    /**
     * Body of the HTTP response as a String.
     */
    private final String body;

    /**
     * Instantiates a new instance of ApacheHttpResponse,
     * then close the response.
     *
     * @param response the HTTP response from the ApacheHttpClient.
     * @throws ServiceException if e.g. serialization of the response fails.
     */
    public JettyHttpResponse(ContentResponse response) throws ServiceException {
        this.statusCode = response.getStatus();
        this.body = response.getContentAsString();
    }

    /**
     * Returns the HTTP status code of the response.
     *
     * @return the HTTP status code.
     */
    @Override
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * Returns the HTTP body of the response as a String.
     *
     * @return the body as a String.
     */
    @Override
    public String getBody() {
        return this.body;
    }

    /**
     * Unmarshals the HTTP body as an instance of T.
     *
     * @param clazz the class.
     * @param <T>   the type of the class to deserialize.
     * @return the deserialized object or {@code null}.
     */
    @Override
    public <T> T getBodyJSON(Class<T> clazz) {
        if (this.body != null) {
            Gson gson = JettyHttpClient.getSerializer();
            return gson.fromJson(this.body, clazz);
        } else {
            return null;
        }
    }
}
