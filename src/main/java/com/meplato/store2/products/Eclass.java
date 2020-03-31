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
 * Eclass is used to tie a product to an eCl@ss schema.
 */
public class Eclass {
    @SerializedName("code")
    private String code;
    @SerializedName("version")
    private String version;

    /**
     * Create new instance of Eclass.
     */
    public Eclass() {
    }

    /**
     * Code is the eCl@ss code. Only use digits for encoding, e.g. 19010203.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Code is the eCl@ss code. Only use digits for encoding, e.g. 19010203.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Version is the eCl@ss version in the major.minor format, e.g. 5.1 or 7.0.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Version is the eCl@ss version in the major.minor format, e.g. 5.1 or 7.0.
     */
    public void setVersion(String version) {
        this.version = version;
    }
}

