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

import java.util.Map;

/**
 * MockClient implements a Client for testing/mocking.
 */
public class MockClient implements Client {
    private Response response;
    private ServiceException exception;

    /**
     * Sets the response to return from execute.
     * <p/>
     * Notice that if you set the exception, the exception has precedence.
     * In other words: An exception is raised and the response is swallowed.
     *
     * @param response to return
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * Sets the exception to return from execute.
     *
     * @param exception to return when calling execute
     */
    public void setServiceException(ServiceException exception) {
        this.exception = exception;
    }

    /**
     * Executes the request and returns an execption (if set) or the response.
     *
     * @param method      the HTTP method, e.g. POST or GET
     * @param uriTemplate the URI template according to RFC 6570
     * @param parameters  the query string parameters
     * @param headers     the key/value pairs for the HTTP header
     * @param body        the body of the request or {@code null}
     * @return Response
     * @throws ServiceException
     */
    @Override
    public Response execute(String method, String uriTemplate, Map<String, Object> parameters, Map<String, String> headers, Object body) throws ServiceException {
        if (this.exception != null) {
            throw this.exception;
        }
        return response;
    }
}
