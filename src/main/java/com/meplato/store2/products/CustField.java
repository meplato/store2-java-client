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
package com.meplato.store2.products;

import com.google.gson.annotations.SerializedName;

/**
 * CustField describes a generic name/value pair. Its purpose is to provide a
 * mechanism for customer-specific fields.
 */
public class CustField {
    @SerializedName("name")
    private String name;
    @SerializedName("value")
    private String value;

    /**
     * Create new instance of CustField.
     */
    public CustField() {
    }

    /**
     * Name is the name of the customer-specific field, e.g. TaxRate.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name is the name of the customer-specific field, e.g. TaxRate.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Value is the value of the customer-specific field, e.g. 19%.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Value is the value of the customer-specific field, e.g. 19%.
     */
    public void setValue(String value) {
        this.value = value;
    }
}

