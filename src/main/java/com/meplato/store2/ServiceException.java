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

/**
 * ServiceException thrown while communicating with a service.
 */
public class ServiceException extends Exception {
    /**
     * Encapsulated error object.
     */
    private final Error error;

    /**
     * Initializes the exception.
     *
     * @param message the error message.
     * @param error   the error object.
     * @param ex      the Throwable or {@code null}.
     */
    public ServiceException(String message, Error error, Throwable ex) {
        super(message, ex);
        this.error = error;
    }

    /**
     * Returns the encapsulated error object ({@link Error}).
     *
     * @return the {@link Error}.
     */
    public Error getError() {
        return error;
    }

    /**
     * Takes a {@link Response} and tries to deserialize the error object
     * in it, then wraps it in a {@link ServiceException}.
     *
     * @param response the {@link Response}.
     * @return the {@link ServiceException}.
     */
    public static ServiceException fromResponse(Response response) {
        if (response == null) {
            return new ServiceException("Request failed", null, null);
        }

        Error error = response.getBodyJSON(Error.class);
        if (error == null) {
            return new ServiceException("Request failed", null, null);
        }
        if (error.getError() == null) {
            return new ServiceException("Request failed", error, null);
        }
        return new ServiceException(error.getError().getMessage(), error, null);
    }
}
