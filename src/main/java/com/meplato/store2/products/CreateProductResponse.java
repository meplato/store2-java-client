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
 * CreateProductResponse is the outcome of a successful request to create a
 * product.
 */
public class CreateProductResponse {
    @SerializedName("kind")
    private String kind;
    @SerializedName("link")
    private String link;

    /**
     * Create new instance of CreateProductResponse.
     */
    public CreateProductResponse() {
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
     * Link returns a URL to the representation of the newly created product.
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Link returns a URL to the representation of the newly created product.
     */
    public void setLink(String link) {
        this.link = link;
    }
}

