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
// THIS FILE IS AUTO-GENERATED. DO NOT MODIFY!
/**
 * Package products implements the Meplato Store 2 API.
 * 
 * @copyright 2014-2015 Meplato GmbH, Switzerland.
 * @author Meplato API Team <support@meplato.com>
 * @version 2.0.0.beta3
 * @license Copyright (c) 2015 Meplato GmbH, Switzerland. All rights reserved.
 * @see <a href="https://developer.meplato.com/store2/#terms">Terms of Service</a>
 * @see <a href="https://developer.meplato.com/store2/">External documentation</a>
 */
package com.meplato.store2.products;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.codec.binary.Base64;

import com.meplato.store2.*;

/**
 * Service is the entry point of the Meplato Store 2 API.
 */

public class Service {
	/** API title. */
	public static String TITLE = "Meplato Store 2 API";
	/** API version. */
	public static String VERSION = "2.0.0.beta3";
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
	 * Returns the {@link CreateService}.
	 *
	 * @return the {@link CreateService}.
	 */
	public CreateService create() {
		return new CreateService(this);
	}

	/**
	 * Returns the {@link DeleteService}.
	 *
	 * @return the {@link DeleteService}.
	 */
	public DeleteService delete() {
		return new DeleteService(this);
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
	 * Returns the {@link ReplaceService}.
	 *
	 * @return the {@link ReplaceService}.
	 */
	public ReplaceService replace() {
		return new ReplaceService(this);
	}

	/**
	 * Returns the {@link ScrollService}.
	 *
	 * @return the {@link ScrollService}.
	 */
	public ScrollService scroll() {
		return new ScrollService(this);
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
	 * Returns the {@link UpdateService}.
	 *
	 * @return the {@link UpdateService}.
	 */
	public UpdateService update() {
		return new UpdateService(this);
	}

	/**
	 * Returns the {@link UpsertService}.
	 *
	 * @return the {@link UpsertService}.
	 */
	public UpsertService upsert() {
		return new UpsertService(this);
	}

	/**
	 * Create a new product in the given catalog and area.
	 */
	public static class CreateService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;
		private CreateProduct product;

		/**
		 * Creates a new instance of CreateService.
		 */
		public CreateService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public CreateService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public CreateService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Product properties of the new product.
		 */
		public CreateService product(CreateProduct product) {
			this.product = product;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public CreateProductResponse execute() throws ServiceException {
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

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products";
			Response response = service.getClient().execute("POST", uriTemplate, params, headers, this.product);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(CreateProductResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Delete a product.
	 */
	public static class DeleteService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;
		private String spn;

		/**
		 * Creates a new instance of DeleteService.
		 */
		public DeleteService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public DeleteService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public DeleteService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * SPN is the supplier part number of the product to delete.
		 */
		public DeleteService spn(String spn) {
			this.spn = spn;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public void execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("area", this.area);
			params.put("pin", this.pin);
			params.put("spn", this.spn);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products/{spn}";
			Response response = service.getClient().execute("DELETE", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return;
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Get returns a single product by its Supplier Part Number (SPN).
	 */
	public static class GetService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;
		private String spn;

		/**
		 * Creates a new instance of GetService.
		 */
		public GetService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public GetService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public GetService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * SPN is the supplier part number of the product to get.
		 */
		public GetService spn(String spn) {
			this.spn = spn;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public Product execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("area", this.area);
			params.put("pin", this.pin);
			params.put("spn", this.spn);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products/{spn}";
			Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(Product.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Replace all fields of a product. Use Update to update only certain fields of
	 * a product.
	 */
	public static class ReplaceService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;
		private String spn;
		private ReplaceProduct product;

		/**
		 * Creates a new instance of ReplaceService.
		 */
		public ReplaceService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public ReplaceService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public ReplaceService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * New properties of the product.
		 */
		public ReplaceService product(ReplaceProduct product) {
			this.product = product;
			return this;
		}

		/**
		 * SPN is the supplier part number of the product to replace.
		 */
		public ReplaceService spn(String spn) {
			this.spn = spn;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public ReplaceProductResponse execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("area", this.area);
			params.put("pin", this.pin);
			params.put("spn", this.spn);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products/{spn}";
			Response response = service.getClient().execute("PUT", uriTemplate, params, headers, this.product);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(ReplaceProductResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Scroll through products of a catalog (area). If you need to iterate through
	 * all products in a catalog, this is the most effective way to do so. If you
	 * want to search for products, use the Search endpoint. 
	 */
	public static class ScrollService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;

		/**
		 * Creates a new instance of ScrollService.
		 */
		public ScrollService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public ScrollService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PageToken must be passed in the 2nd and all consective requests to get the
		 * next page of results. You do not need to pass the page token manually. You
		 * should just follow the nextUrl link in the metadata to get the next slice of
		 * data. If there is no nextUrl returned, you have reached the last page of
		 * products for the given catalog. A scroll request is kept alive for 2 minutes.
		 * If you fail to ask for the next slice of products within this period, a new
		 * scroll request will be created and you start over at the first page of
		 * results. 
		 */
		public ScrollService pageToken(String pageToken) {
			this.params.put("pageToken", pageToken);
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public ScrollService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public ScrollResponse execute() throws ServiceException {
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

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products/scroll{?pageToken}";
			Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(ScrollResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Search for products. Do not use this method for iterating through all of the
	 * products in a catalog; use the Scroll endpoint instead. It is much more
	 * efficient. 
	 */
	public static class SearchService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;

		/**
		 * Creates a new instance of SearchService.
		 */
		public SearchService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public SearchService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public SearchService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Q defines are full text query.
		 */
		public SearchService q(String q) {
			this.params.put("q", q);
			return this;
		}

		/**
		 * Skip specifies how many products to skip (default 0).
		 */
		public SearchService skip(long skip) {
			this.params.put("skip", skip);
			return this;
		}

		/**
		 * Take defines how many products to return (max 100, default 20).
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
			params.put("area", this.area);
			params.put("pin", this.pin);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products{?q,skip,take}";
			Response response = service.getClient().execute("GET", uriTemplate, params, headers, null);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(SearchResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Update the fields of a product selectively. Use Replace to replace the
	 * product as a whole.
	 */
	public static class UpdateService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;
		private String spn;
		private UpdateProduct product;

		/**
		 * Creates a new instance of UpdateService.
		 */
		public UpdateService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public UpdateService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public UpdateService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Products properties of the updated product.
		 */
		public UpdateService product(UpdateProduct product) {
			this.product = product;
			return this;
		}

		/**
		 * SPN is the supplier part number of the product to update.
		 */
		public UpdateService spn(String spn) {
			this.spn = spn;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public UpdateProductResponse execute() throws ServiceException {
			// Make a copy of the parameters and add the path parameters to it
			Map<String, Object> params = new HashMap<String, Object>();
			params.putAll(this.params);
			params.put("area", this.area);
			params.put("pin", this.pin);
			params.put("spn", this.spn);

			// Make a copy of the header parameters and set common headers, like the UA
			Map<String, String> headers = new HashMap<String, String>();
			headers.putAll(this.headers);

			String authorization = service.getAuthorizationHeader();
			if (authorization != null && !authorization.isEmpty()) {
				headers.put("Authorization", authorization);
			}

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products/{spn}";
			Response response = service.getClient().execute("POST", uriTemplate, params, headers, this.product);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(UpdateProductResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}

	/**
	 * Upsert a product in the given catalog and area. Upsert will create if the
	 * product does not exist yet, otherwise it will update.
	 */
	public static class UpsertService {
		private final Service service;
		private final Map<String, Object> params = new HashMap<String, Object>();
		private final Map<String, String> headers = new HashMap<String, String>();
		private String pin;
		private String area;
		private UpsertProduct product;

		/**
		 * Creates a new instance of UpsertService.
		 */
		public UpsertService(Service service) {
			this.service = service;
		}

		/**
		 * Area of the catalog, e.g. work or live.
		 */
		public UpsertService area(String area) {
			this.area = area;
			return this;
		}

		/**
		 * PIN of the catalog.
		 */
		public UpsertService pin(String pin) {
			this.pin = pin;
			return this;
		}

		/**
		 * Product properties of the new product.
		 */
		public UpsertService product(UpsertProduct product) {
			this.product = product;
			return this;
		}

		/**
		 * Execute the operation.
		 */
		public UpsertProductResponse execute() throws ServiceException {
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

			String uriTemplate = service.getBaseURL() + "/catalogs/{pin}/{area}/products/upsert";
			Response response = service.getClient().execute("POST", uriTemplate, params, headers, this.product);
			if (response != null && response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return response.getBodyJSON(UpsertProductResponse.class);
			}

			throw ServiceException.fromResponse(response);
		}
	}
}

