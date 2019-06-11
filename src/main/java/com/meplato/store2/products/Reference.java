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
 * Reference describes a reference from one product to another product.
 */
public class Reference {
    @SerializedName("kind")
    private String kind;
    @SerializedName("qty")
    private Double qty;
    @SerializedName("spn")
    private String spn;

    /**
     * Create new instance of Reference.
     */
    public Reference() {
    }

    /**
     * Kind describes the type of reference.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind describes the type of reference.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Qty describes the quantity for certain kinds of references. E.g. the
     * consists_of kind must use the quantity field to be useful for the end-user.
     */
    public Double getQty() {
        return this.qty;
    }

    /**
     * Qty describes the quantity for certain kinds of references. E.g. the
     * consists_of kind must use the quantity field to be useful for the end-user.
     */
    public void setQty(Double qty) {
        this.qty = qty;
    }

    /**
     * SPN specifies the supplier product number of the other product.
     */
    public String getSpn() {
        return this.spn;
    }

    /**
     * SPN specifies the supplier product number of the other product.
     */
    public void setSpn(String spn) {
        this.spn = spn;
    }
}

