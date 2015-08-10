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

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Error is a valid response from a service call
 * that returns error information from the server.
 */
public class Error {
    /**
     * Error object.
     */
    @SerializedName("error")
    private final ErrorInner error;

    /**
     * Initialize a new Error instance.
     *
     * @param error the error details.
     */
    public Error(ErrorInner error) {
        this.error = error;
    }

    /**
     * Returns the error details.
     *
     * @return the error details as {@link ErrorInner}.
     */
    public ErrorInner getError() {
        return error;
    }

    /**
     * Encapsulates error details.
     */
    public static class ErrorInner {
        /**
         * Error code, a numeric value (optional).
         */
        @SerializedName("code")
        private final int code;
        /**
         * Error message.
         */
        @SerializedName("message")
        private final String message;
        /**
         * A list of information that has error details (optional).
         */
        @SerializedName("details")
        private final List<String> details;

        /**
         * Initialize the new error details.
         *
         * @param code    the (optional) error code.
         * @param message the error message.
         * @param details the (optional) error details.
         */
        public ErrorInner(int code, String message, List<String> details) {
            this.code = code;
            this.message = message;
            this.details = details;
        }

        /**
         * Returns the error code.
         *
         * @return the error code or 0 if unset.
         */
        public int getCode() {
            return code;
        }

        /**
         * Returns the error message.
         *
         * @return the error message.
         */
        public String getMessage() {
            return message;
        }

        /**
         * Returns error details.
         *
         * @return the list of details (can be empty).
         */
        public List<String> getDetails() {
            return details;
        }
    }
}
