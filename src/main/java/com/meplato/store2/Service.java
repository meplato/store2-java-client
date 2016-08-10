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
// THIS FILE IS AUTO-GENERATED. DO NOT MODIFY!
/**
 * Package store2 implements the Meplato Store 2 API.
 * 
 * @copyright 2014-2016 Meplato GmbH, Switzerland.
 * @author Meplato API Team <support@meplato.com>
 * @version 2.0.0.beta8
 * @license Copyright (c) 2015-2016 Meplato GmbH, Switzerland. All rights reserved.
 * @see <a href="https://developer.meplato.com/store2/#terms">Terms of Service</a>
 * @see <a href="https://developer.meplato.com/store2/">External documentation</a>
 */
package com.meplato.store2;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.codec.binary.Base64;

/**
 * Service is the entry point of the Meplato Store 2 API.
 */

public class Service {
	/** API title. */
	public static String TITLE = "Meplato Store 2 API";
	/** API version. */
	public static String VERSION = "2.0.0.beta8";
	/** User Agent. */
	public static String USER_AGENT = "meplato-java-client/2.0";
	/** Default base URL of the API endpoints. */
	public static String BASE_URL = "https://store2.meplato.com/api/v2";
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
	 * Returns the {@link MeService}.
	 *
	 * @return the {@link MeService}.
	 */
	public MeService me() {
		return new MeService(this);
	}

	/**
	 * Returns the {@link PingService}.
	 *
	 * @return the {@link PingService}.
	 */
	public PingService ping() {
		return new PingService(this);
	}

	/**
	 * Me returns information about your user profile and the API endpoints of the
	 * Meplato Store 2.0 API.
	 */
	public static class MeService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();

		/**
		 * Creates a new instance of MeService.
		 */
		public MeService(Service service) {
			this.service = service;
		}

		/**
		 * Execute the operation.
		 */
		public MeResponse execute() throws ServiceException {
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

			String uriTemplate = service.getBaseURL() + "/";
			Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(MeResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Ping allows you to test if the Meplato Store 2.0 API is currently
	 * operational.
	 */
	public static class PingService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();

		/**
		 * Creates a new instance of PingService.
		 */
		public PingService(Service service) {
			this.service = service;
		}

		/**
		 * Execute the operation.
		 */
		public void execute() throws ServiceException {
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

			String uriTemplate = service.getBaseURL() + "/";
			Response response = service.getClient().execute("HEAD", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return;
			}

			throw ServiceException.fromResponse(response);
		}
	}
}

