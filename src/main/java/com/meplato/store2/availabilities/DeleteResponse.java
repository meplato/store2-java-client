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

import com.google.gson.annotations.SerializedName;

/**
 * DeleteResponse is the outcome of a successful request to delete an
 * availability.
 */
public class DeleteResponse {
    @SerializedName("kind")
    private String kind;

    /**
     * Create new instance of DeleteResponse.
     */
    public DeleteResponse() {
    }

    /**
     * Kind describes this entity, it will be store#availability/deleteResponse.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind describes this entity, it will be store#availability/deleteResponse.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }
}
