/*
 * Copyright (c) 2013-present Meplato GmbH.
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
// THIS FILE IS AUTO-GENERATED. DO NOT MODIFY!
/**
 * Package jobs implements the Meplato Store API.
 * 
 * @copyright 2013-2021 Meplato GmbH.
 * @author Meplato API Team <support@meplato.com>
 * @version 2.1.9
 * @license Copyright (c) 2015-2020 Meplato GmbH. All rights reserved.
 * @see <a href="https://developer.meplato.com/store2/#terms">Terms of Service</a>
 * @see <a href="https://developer.meplato.com/store2/">External documentation</a>
 */
package com.meplato.store2.jobs;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.codec.binary.Base64;

import com.meplato.store2.*;

/**
 * Service is the entry point of the Meplato Store API.
 */

public class Service {
    /** API title. */
    public static String TITLE = "Meplato Store API";
    /** API version. */
    public static String VERSION = "2.1.9";
    /** User Agent. */
    public static String USER_AGENT = "meplato-java-client/2.0";
    /** Default base URL of the API endpoints. */
    public static String BASE_URL = "https://store.meplato.com/api/v2";
    /** RFC3339 pattern for deserializing date/time from the API. */
    public static String RFC3339 = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSSXXX";

    /** Client to use for requests. */
    private final Client client;
    /** Base URL for the API endpoints. */
    private String baseURL;
    /** User name for authentication. */
    private String user;
    /** Password for authentication. */
    private String password;

    /**
     * Instantiate a new Service.
     *
     * @param client the {@link Client} to use for requests.
     */
    public Service(Client client) {
        this.client = client;
        this.baseURL = BASE_URL;
    }

    /**
     * Returns the JSON serializer for this service.
     *
     * @return the JSON serializer.
     */
    public static Gson getSerializer() {
        return new GsonBuilder().setDateFormat(RFC3339).create();
    }

    /**
     * Returns the {@link Client} for this service.
     *
     * @return the Client for requests.
     */
    public Client getClient() {
        return this.client;
    }

    /**
     * Returns the base URL for this API.
     *
     * @return the base URL.
     */
    public String getBaseURL() {
        return this.baseURL;
    }

    /**
     * Sets the base URL for this API.
     *
     * @param baseURL the base URL for this API.
     */
    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    /**
     * Returns the username for authentication.
     *
     * @return the username.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Sets the username for authentication.
     *
     * @param user the username for authentication.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Returns the password for authentication.
     *
     * @return the password.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets the password for authentication.
     *
     * @param password the password for authentication.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the header for HTTP Basic authentication or {@code null}.
     *
     * @return the HTTP Basic authentication header or {@code null}.
     */
    public String getAuthorizationHeader() {
        String user = getUser();
        String password = getPassword();
        if ((user != null && !user.isEmpty()) || (password != null && !password.isEmpty())) {
            String userPass = "";
            if (user != null) {
                userPass = user;
            }
            userPass = userPass + ":";
            if (password != null) {
                userPass = userPass + password;
            }
            String credentials = Base64.encodeBase64String(userPass.getBytes());
            return "Basic " + credentials;
        }
        return null;
    }

    /**
     * Returns the {@link GetService}.
     *
     * @return the {@link GetService}.
     */
    public GetService get() {
        return new GetService(this);
    }

    /**
     * Returns the {@link SearchService}.
     *
     * @return the {@link SearchService}.
     */
    public SearchService search() {
        return new SearchService(this);
    }

    /**
     * Get a single job.
     */
    public static class GetService {
        private final Service service;
        private final Map<String, Object> params = new HashMap<String, Object>();
        private final Map<String, String> headers = new HashMap<String, String>();
        private String id;

        /**
         * Creates a new instance of GetService.
         */
        public GetService(Service service) {
            this.service = service;
        }

        /**
         * ID of the job.
         */
        public GetService id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Execute the operation.
         */
        public Job execute() throws ServiceException {
            // Make a copy of the parameters and add the path parameters to it
            Map<String, Object> params = new HashMap<String, Object>();
            params.putAll(this.params);
            params.put("id", this.id);

            // Make a copy of the header parameters and set common headers, like the UA
            Map<String, String> headers = new HashMap<String, String>();
            headers.putAll(this.headers);

            String authorization = service.getAuthorizationHeader();
            if (authorization != null && !authorization.isEmpty()) {
                headers.put("Authorization", authorization);
            }

            String uriTemplate = service.getBaseURL() + "/jobs/{id}";
            Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
            if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
                return response.getBodyJSON(Job.class);
            }

            throw ServiceException.fromResponse(response);
        }
    }

    /**
     * Search for jobs.
     */
    public static class SearchService {
        private final Service service;
        private final Map<String, Object> params = new HashMap<String, Object>();
        private final Map<String, String> headers = new HashMap<String, String>();

        /**
         * Creates a new instance of SearchService.
         */
        public SearchService(Service service) {
            this.service = service;
        }

        /**
         * Skip specifies how many catalogs to skip (default 0).
         */
        public SearchService skip(long skip) {
            this.params.put("skip", skip);
            return this;
        }

        /**
         * State filter, e.g. waiting,working,succeeded,failed.
         */
        public SearchService state(String state) {
            this.params.put("state", state);
            return this;
        }

        /**
         * Take defines how many catalogs to return (max 100, default 20).
         */
        public SearchService take(long take) {
            this.params.put("take", take);
            return this;
        }

        /**
         * Execute the operation.
         */
        public SearchResponse execute() throws ServiceException {
            // Make a copy of the parameters and add the path parameters to it
            Map<String, Object> params = new HashMap<String, Object>();
            params.putAll(this.params);

            // Make a copy of the header parameters and set common headers, like the UA
            Map<String, String> headers = new HashMap<String, String>();
            headers.putAll(this.headers);

            String authorization = service.getAuthorizationHeader();
            if (authorization != null && !authorization.isEmpty()) {
                headers.put("Authorization", authorization);
            }

            String uriTemplate = service.getBaseURL() + "/jobs{?merchantId,skip,take,state}";
            Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
            if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
                return response.getBodyJSON(SearchResponse.class);
            }

            throw ServiceException.fromResponse(response);
        }
    }
}

