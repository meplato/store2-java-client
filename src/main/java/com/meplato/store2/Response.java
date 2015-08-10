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

/**
 * Response from a Client.
 *
 * The default ApacheHttpClient uses the accompanying ApacheHttpResponse.
 * Feel free to implement your own Response class.
 */
public interface Response {
    /**
     * Returns the HTTP status code of the response.
     *
     * @return the HTTP status code.
     */
    int getStatusCode();

    /**
     * Returns the body of the response as a String.
     *
     * @return the HTTP body as a String.
     */
    String getBody();

    /**
     * Deserializes the HTTP response body as an object of the given type.
     *
     * @param clazz the class.
     * @param <T>   the class type.
     * @return the deserialized object of type T or {@code null}.
     */
    <T> T getBodyJSON(Class<T> clazz);
}
