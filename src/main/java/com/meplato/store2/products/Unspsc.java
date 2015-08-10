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
 * Unspsc is used to tie a product to a UNSPSC schema.
 */
public class Unspsc {
	@SerializedName("code")
	private String code;
	@SerializedName("version")
	private String version;

	/**
	 * Create new instance of Unspsc.
	 */
	public Unspsc() {
	}

	/**
	 * Code is the UNSPSC code. Only use digits for encoding, e.g. 43211503.
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * Code is the UNSPSC code. Only use digits for encoding, e.g. 43211503.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Version is the UNSPSC version in the major.minor format, e.g. 16.0901.
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * Version is the UNSPSC version in the major.minor format, e.g. 16.0901.
	 */
	public void setVersion(String version) {
		this.version = version;
	}
}

