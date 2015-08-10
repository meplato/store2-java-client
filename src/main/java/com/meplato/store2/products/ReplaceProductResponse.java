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
package com.meplato.store2.products;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * ReplaceProductResponse is the outcome of a successful replacement of a
 * product.
 */
public class ReplaceProductResponse {
	@SerializedName("id")
	private String id;
	@SerializedName("kind")
	private String kind;
	@SerializedName("link")
	private String link;

	/**
	 * Create new instance of ReplaceProductResponse.
	 */
	public ReplaceProductResponse() {
	}

	/**
	 * ID is the identifier of the replaced product.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * ID is the identifier of the replaced product.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Kind describes this entity.
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * Kind describes this entity.
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * Link returns a URL to the representation of the replaced product.
	 */
	public String getLink() {
		return this.link;
	}

	/**
	 * Link returns a URL to the representation of the replaced product.
	 */
	public void setLink(String link) {
		this.link = link;
	}
}

