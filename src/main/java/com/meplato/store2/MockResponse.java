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
import com.meplato.store2.internal.GsonUtil;
import org.apache.http.Consts;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.conn.DefaultHttpResponseParser;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.impl.io.SessionInputBufferImpl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * MockClient implements a Response for testing/mocking.
 */
public class MockResponse implements Response {
    private int statusCode;
    private String body;

    /**
     * Parse a Response from a filename.
     *
     * @param filename
     * @return Response
     * @throws IOException
     * @throws HttpException
     * @throws ServiceException
     */
    public static Response fromFile(String filename) throws IOException, HttpException, ServiceException {
        return fromPath(Paths.get(filename));
    }

    /**
     * Parse a response from a Path object.
     *
     * @param path
     * @return Response
     * @throws IOException
     * @throws HttpException
     * @throws ServiceException
     */
    public static Response fromPath(Path path) throws IOException, HttpException, ServiceException {
        String contents = new String(Files.readAllBytes(path));
        return fromContents(contents);
    }

    /**
     * Parse a response from String contents.
     *
     * @param contents
     * @return String contents
     * @throws IOException
     * @throws HttpException
     * @throws ServiceException
     */
    public static Response fromContents(String contents) throws IOException, HttpException, ServiceException {
        // If this code works, it was written by Georg Wall.
        SessionInputBufferImpl sib = new SessionInputBufferImpl(new HttpTransportMetricsImpl(), 65535);
        sib.bind(new ByteArrayInputStream(contents.getBytes(Consts.UTF_8)));
        DefaultHttpResponseParser parser = new DefaultHttpResponseParser(sib);
        HttpResponse httpResponse = parser.parse();
        int endOfHeader = contents.indexOf("\r\n\r\n");
        if (endOfHeader >= 0) {
            endOfHeader += 4; // for \r\n\r\n
            byte[] bytes = contents.getBytes(Consts.UTF_8);
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes, endOfHeader, bytes.length - endOfHeader);
            InputStreamEntity entity = new InputStreamEntity(bais);
            entity.setContentType(httpResponse.getFirstHeader("Content-Type"));
            entity.setContentEncoding(httpResponse.getFirstHeader("Content-Encoding"));
            httpResponse.setEntity(entity);
        }
        return new ApacheHttpResponse(httpResponse);
    }

    /**
     * Returns the HTTP status code.
     *
     * @return HTTP status code.
     */
    @Override
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the HTTP status code to return.
     *
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Returns the body of the response as a String.
     *
     * @return body as String
     */
    @Override
    public String getBody() {
        return body;
    }

    /**
     * Sets the body of the response.
     *
     * @param body String
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Parses the body of the response as JSON.
     * Notice that no exception is raised here.
     *
     * @param clazz the class.
     * @param <T>   expected response type.
     * @return parsed JSON object or null.
     */
    @Override
    public <T> T getBodyJSON(Class<T> clazz) {
        if (this.body != null) {
            Gson gson = GsonUtil.getSerializer();
            return gson.fromJson(this.body, clazz);
        } else {
            return null;
        }
    }
}
