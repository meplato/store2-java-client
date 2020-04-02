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
 * Condition describes a product status, e.g. refurbished or used.
 */
public class Condition {
    @SerializedName("kind")
    private String kind;
    @SerializedName("text")
    private String text;

    /**
     * Create new instance of Condition.
     */
    public Condition() {
    }

    /**
     * Kind describes the condition, e.g. bargain, new_product, old_product, new,
     * used, refurbished, or core_product.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind describes the condition, e.g. bargain, new_product, old_product, new,
     * used, refurbished, or core_product.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Text gives a textual description of the condition.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Text gives a textual description of the condition.
     */
    public void setText(String text) {
        this.text = text;
    }
}

