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
package com.meplato.store2.products;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * Feature describes additional features of a product.
 */
public class Feature {
	@SerializedName("kind")
	private String kind;
	@SerializedName("name")
	private String name;
	@SerializedName("unit")
	private String unit;
	@SerializedName("values")
	private String[] values;

	/**
	 * Create new instance of Feature.
	 */
	public Feature() {
	}

	/**
	 * Kind describes the type of feature, e.g. ECLASS-5.1 to describe a feature of
	 * eCl@ss 5.1.
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * Kind describes the type of feature, e.g. ECLASS-5.1 to describe a feature of
	 * eCl@ss 5.1.
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * Name specifies the name/code of the feature. If you are refering to a
	 * standard classification like eCl@ss, you should use the code of the feature.
	 * Otherwise, you are free to use a textual description like "Weight" or
	 * "Diameter" or "Voltage". 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Name specifies the name/code of the feature. If you are refering to a
	 * standard classification like eCl@ss, you should use the code of the feature.
	 * Otherwise, you are free to use a textual description like "Weight" or
	 * "Diameter" or "Voltage". 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Unit is a unit of measurement to describe the feature value. E.g. if you
	 * specify the weight, you should probably use KGM as unit to describe that the
	 * weight is given in kilograms. 
	 */
	public String getUnit() {
		return this.unit;
	}

	/**
	 * Unit is a unit of measurement to describe the feature value. E.g. if you
	 * specify the weight, you should probably use KGM as unit to describe that the
	 * weight is given in kilograms. 
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Values describes the feature value(s).
	 */
	public String[] getValues() {
		return this.values;
	}

	/**
	 * Values describes the feature value(s).
	 */
	public void setValues(String[] values) {
		this.values = values;
	}
}

