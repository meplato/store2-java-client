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

import com.google.gson.annotations.SerializedName;

/**
 * Availability details product availability.
 */
public class Availability {
    @SerializedName("message")
    private String message;
    @SerializedName("qty")
    private Double qty;
    @SerializedName("updated")
    private String updated;

    /**
     * Create new instance of Availability.
     */
    public Availability() {
    }

    /**
     * Message gives a textual description of the availability message, e.g. "in
     * stock", "out of stock", "limited availability", or "on display to order".
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Message gives a textual description of the availability message, e.g. "in
     * stock", "out of stock", "limited availability", or "on display to order".
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Qty describes the quantity for certain kinds of availability messages. E.g.
     * you can indicate the number of items in stock.
     */
    public Double getQty() {
        return this.qty;
    }

    /**
     * Qty describes the quantity for certain kinds of availability messages. E.g.
     * you can indicate the number of items in stock.
     */
    public void setQty(Double qty) {
        this.qty = qty;
    }

    /**
     * Updated indicates when the availability message has been last updated.
     */
    public String getUpdated() {
        return this.updated;
    }

    /**
     * Updated indicates when the availability message has been last updated.
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }
}

