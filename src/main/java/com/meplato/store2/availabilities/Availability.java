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
package com.meplato.store2.availabilities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

/**
 * Availability information of a product in a location
 */
public class Availability {
    @SerializedName("message")
    private String message;
    @SerializedName("mpcc")
    private String mpcc;
    @SerializedName("quantity")
    private Double quantity;
    @SerializedName("region")
    private String region;
    @SerializedName("spn")
    private String spn;
    @SerializedName("updated")
    private String updated;
    @SerializedName("zipCode")
    private String zipCode;

    /**
     * Create new instance of Availability.
     */
    public Availability() {
    }

    /**
     * Contains the stock state description; i.e. in stock; out of stock; limited
     * availability; on display to order
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Contains the stock state description; i.e. in stock; out of stock; limited
     * availability; on display to order
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Unique internal identifier of the merchant
     */
    public String getMpcc() {
        return this.mpcc;
    }

    /**
     * Unique internal identifier of the merchant
     */
    public void setMpcc(String mpcc) {
        this.mpcc = mpcc;
    }

    /**
     * Reflects the amount of items available
     */
    public Double getQuantity() {
        return this.quantity;
    }

    /**
     * Reflects the amount of items available
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * 2-letter ISO code of the country/region where the product is stored
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * 2-letter ISO code of the country/region where the product is stored
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Merchant's unique identifier of a product
     */
    public String getSpn() {
        return this.spn;
    }

    /**
     * Merchant's unique identifier of a product
     */
    public void setSpn(String spn) {
        this.spn = spn;
    }

    /**
     * Update date given by the merchant i.e. Q4/2022, 2022/10/12
     */
    public String getUpdated() {
        return this.updated;
    }

    /**
     * Update date given by the merchant i.e. Q4/2022, 2022/10/12
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * Zip code where the product is stored
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Zip code where the product is stored
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
