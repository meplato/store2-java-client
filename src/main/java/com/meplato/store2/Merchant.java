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

import java.util.Date;

/**
 * Merchant holds account data for the merchant/supplier in Meplato Store.
 */
public class Merchant {
    @SerializedName("country")
    private String country;
    @SerializedName("created")
    private Date created;
    @SerializedName("currency")
    private String currency;
    @SerializedName("id")
    private long id;
    @SerializedName("kind")
    private String kind;
    @SerializedName("language")
    private String language;
    @SerializedName("locale")
    private String locale;
    @SerializedName("mpcc")
    private String mpcc;
    @SerializedName("mpsc")
    private String mpsc;
    @SerializedName("name")
    private String name;
    @SerializedName("ou")
    private String ou;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("selfService")
    private boolean selfService;
    @SerializedName("timeZone")
    private String timeZone;
    @SerializedName("token")
    private String token;
    @SerializedName("updated")
    private Date updated;

    /**
     * Create new instance of Merchant.
     */
    public Merchant() {
    }

    /**
     * Country/Region is the ISO code for the country/region of the merchant, e.g.
     * DE or CH.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Country/Region is the ISO code for the country/region of the merchant, e.g.
     * DE or CH.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Created is the date/time when the merchant was created, e.g.
     * 2015-03-19T12:09:45Z
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Created is the date/time when the merchant was created, e.g.
     * 2015-03-19T12:09:45Z
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Currency is the default ISO code for new catalogs, e.g. EUR or GBP.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Currency is the default ISO code for new catalogs, e.g. EUR or GBP.
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * ID is a unique (internal) identifier of the merchant.
     */
    public long getId() {
        return this.id;
    }

    /**
     * ID is a unique (internal) identifier of the merchant.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Kind is store#merchant for this entity.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#merchant for this entity.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Language is the code for the language of the merchant, e.g. de or en.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Language is the code for the language of the merchant, e.g. de or en.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Locale is the regional code in the format de_AT.
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * Locale is the regional code in the format de_AT.
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * MPCC is the Meplato Company Code, a unique identifier.
     */
    public String getMpcc() {
        return this.mpcc;
    }

    /**
     * MPCC is the Meplato Company Code, a unique identifier.
     */
    public void setMpcc(String mpcc) {
        this.mpcc = mpcc;
    }

    /**
     * MPSC is the Meplato Supplier Code.
     */
    public String getMpsc() {
        return this.mpsc;
    }

    /**
     * MPSC is the Meplato Supplier Code.
     */
    public void setMpsc(String mpsc) {
        this.mpsc = mpsc;
    }

    /**
     * Name is the name of the merchant.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name is the name of the merchant.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * OU is the default ISO code of the order unit, e.g. PCE or EA.
     */
    public String getOu() {
        return this.ou;
    }

    /**
     * OU is the default ISO code of the order unit, e.g. PCE or EA.
     */
    public void setOu(String ou) {
        this.ou = ou;
    }

    /**
     * SelfLink is the URL for this merchant.
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * SelfLink is the URL for this merchant.
     */
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * SelfService indicates whether this merchant is on self-service or managed by
     * Meplato.
     */
    public boolean isSelfService() {
        return this.selfService;
    }

    /**
     * SelfService indicates whether this merchant is on self-service or managed by
     * Meplato.
     */
    public void setSelfService(boolean selfService) {
        this.selfService = selfService;
    }

    /**
     * TimeZone is the time zone in the format Europe/Berlin.
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * TimeZone is the time zone in the format Europe/Berlin.
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Token is a shared token for this merchant.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Token is a shared token for this merchant.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Updated is the date/time when the merchant was last modified, e.g.
     * 2015-03-19T12:09:45Z
     */
    public Date getUpdated() {
        return this.updated;
    }

    /**
     * Updated is the date/time when the merchant was last modified, e.g.
     * 2015-03-19T12:09:45Z
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
