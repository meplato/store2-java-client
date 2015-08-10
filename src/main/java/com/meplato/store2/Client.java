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

import java.util.Map;

/**
 * Client represents an interface for HTTP clients.
 *
 * The default implementation for Client is ApacheHttpClient.
 * Feel free to create your own implementation. You might also
 * need to implement your own Response; see ApacheHttpResponse
 * for an example.
 */
public interface Client {
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
    Response execute(String method, String uriTemplate, Map<String, Object> parameters, Map<String, String> headers, Object body) throws ServiceException;
}
