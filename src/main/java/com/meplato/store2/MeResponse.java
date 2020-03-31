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
package com.meplato.store2;

import com.google.gson.annotations.SerializedName;

/**
 * MeResponse returns various information about the user and endpoints.
 */
public class MeResponse {
    @SerializedName("catalogsLink")
    private String catalogsLink;
    @SerializedName("kind")
    private String kind;
    @SerializedName("merchant")
    private Merchant merchant;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("user")
    private User user;

    /**
     * Create new instance of MeResponse.
     */
    public MeResponse() {
    }

    /**
     * CatalogsLink is the URL for retrieving the list of catalogs.
     */
    public String getCatalogsLink() {
        return this.catalogsLink;
    }

    /**
     * CatalogsLink is the URL for retrieving the list of catalogs.
     */
    public void setCatalogsLink(String catalogsLink) {
        this.catalogsLink = catalogsLink;
    }

    /**
     * Kind is store#me for this entity.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#me for this entity.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Merchant returns information about your merchant account.
     */
    public Merchant getMerchant() {
        return this.merchant;
    }

    /**
     * Merchant returns information about your merchant account.
     */
    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    /**
     * SelfLink is the URL of this request.
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * SelfLink is the URL of this request.
     */
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * User returns information about your user account.
     */
    public User getUser() {
        return this.user;
    }

    /**
     * User returns information about your user account.
     */
    public void setUser(User user) {
        this.user = user;
    }
}

