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
 * Package catalogs implements the Meplato Store API.
 * 
 * @copyright 2014-2017 Meplato GmbH, Switzerland.
 * @author Meplato API Team <support@meplato.com>
 * @version 2.0.4
 * @license Copyright (c) 2015-2017 Meplato GmbH, Switzerland. All rights reserved.
 * @see <a href="https://developer.meplato.com/store2/#terms">Terms of Service</a>
 * @see <a href="https://developer.meplato.com/store2/">External documentation</a>
 */
package com.meplato.store2.catalogs;

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
	public static String VERSION = "2.0.4";
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
	 * Returns the {@link PublishService}.
	 *
	 * @return the {@link PublishService}.
	 */
	public PublishService publish() {
		return new PublishService(this);
	}

	/**
	 * Returns the {@link PublishStatusService}.
	 *
	 * @return the {@link PublishStatusService}.
	 */
	public PublishStatusService publishStatus() {
		return new PublishStatusService(this);
	}

	/**
	 * Returns the {@link PurgeService}.
	 *
	 * @return the {@link PurgeService}.
	 */
	public PurgeService purge() {
		return new PurgeService(this);
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
	 * Get a single catalog.
	 */
	public static class GetService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;

		/**
		 * Creates a new instance of GetService.
		 */
		public GetService(Service service) {
			this.service = service;
		}

		/**
		 * PIN of the catalog.
		 */
		public GetService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public Catalog execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("pin", this.pin);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}";
			Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(Catalog.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Publishes a catalog.
	 */
	public static class PublishService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;

		/**
		 * Creates a new instance of PublishService.
		 */
		public PublishService(Service service) {
			this.service = service;
		}

		/**
		 * PIN of the catalog to publish.
		 */
		public PublishService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public PublishResponse execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("pin", this.pin);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/publish";
			Response response = service.getClient().execute("POST", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(PublishResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Status of a publish process.
	 */
	public static class PublishStatusService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;

		/**
		 * Creates a new instance of PublishStatusService.
		 */
		public PublishStatusService(Service service) {
			this.service = service;
		}

		/**
		 * PIN of the catalog to get the publish status from.
		 */
		public PublishStatusService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public PublishStatusResponse execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("pin", this.pin);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/publish/status";
			Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(PublishStatusResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Purge the work or live area of a catalog, i.e. remove all products in the
	 * given area, but do not delete the catalog itself.
	 */
	public static class PurgeService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;

		/**
		 * Creates a new instance of PurgeService.
		 */
		public PurgeService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog to purge, i.e. work or live.
		 */
		public PurgeService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog to purge.
		 */
		public PurgeService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public PurgeResponse execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("area", this.area);
			params.put("pin", this.pin);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}";
			Response response = service.getClient().execute("DELETE", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(PurgeResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Search for catalogs.
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
		 * Q defines are full text query.
		 */
		public SearchService q(String q) {
			this.params.put("q", q);
			return this;
		}

		/**
		 * Skip specifies how many catalogs to skip (default 0).
		 */
		public SearchService skip(long skip) {
			this.params.put("skip", skip);
			return this;
		}

		/**
		 * Sort order, e.g. name or id or -created (default: score).
		 */
		public SearchService sort(String sort) {
			this.params.put("sort", sort);
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

			String uriTemplate = service.getBaseURL() + "/catalogs{?q,skip,take,sort}";
			Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(SearchResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}
}

