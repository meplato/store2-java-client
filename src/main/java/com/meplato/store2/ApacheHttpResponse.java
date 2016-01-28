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
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * ApacheHttpResponse implements Response for org.apache.http.
 */
public class ApacheHttpResponse implements Response {
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
    public ApacheHttpResponse(CloseableHttpResponse response) throws ServiceException {
        this.statusCode = response.getStatusLine().getStatusCode();

        HttpEntity entity = response.getEntity();
        if (entity != null) {
            try {
                ContentType contentType = ContentType.getOrDefault(entity);
                Charset charset = contentType.getCharset();
                this.body = EntityUtils.toString(entity, charset);
            } catch (IOException e) {
                EntityUtils.consumeQuietly(entity);
                throw new ServiceException("Error deserializing data", null, e);
            } finally {
                try {
                    response.close();
                } catch (IOException e) {
                }
            }
        } else {
            this.body = null;
        }
    }

    /**
     * Instantiates a new instance of ApacheHttpResponse.
     *
     * @param response the HTTP response from the ApacheHttpClient.
     * @throws ServiceException if e.g. serialization of the response fails.
     */
    public ApacheHttpResponse(HttpResponse response) throws ServiceException {
        this.statusCode = response.getStatusLine().getStatusCode();

        HttpEntity entity = response.getEntity();
        if (entity != null) {
            try {
                ContentType contentType = ContentType.getOrDefault(entity);
                Charset charset = contentType.getCharset();
                this.body = EntityUtils.toString(entity, charset);
            } catch (IOException e) {
                throw new ServiceException("Error deserializing data", null, e);
            } finally {
            }
        } else {
            this.body = null;
        }
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
            Gson gson = Service.getSerializer();
            return gson.fromJson(this.body, clazz);
        } else {
            return null;
        }
    }
}
