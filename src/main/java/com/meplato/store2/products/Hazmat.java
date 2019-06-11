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
 * Hazmat describes a hazardous/dangerous good.
 */
public class Hazmat {
    @SerializedName("kind")
    private String kind;
    @SerializedName("text")
    private String text;

    /**
     * Create new instance of Hazmat.
     */
    public Hazmat() {
    }

    /**
     * Kind describes the classification system, e.g. GGVS.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind describes the classification system, e.g. GGVS.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Text gives a textual description or a code of the harm that the product can
     * do to people, property, or the environment.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Text gives a textual description or a code of the harm that the product can
     * do to people, property, or the environment.
     */
    public void setText(String text) {
        this.text = text;
    }
}

