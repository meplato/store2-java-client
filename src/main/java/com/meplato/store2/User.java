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
 * User holds account data for the user in Meplato Store.
 */
public class User {
    @SerializedName("country")
    private String country;
    @SerializedName("created")
    private Date created;
    @SerializedName("currency")
    private String currency;
    @SerializedName("email")
    private String email;
    @SerializedName("id")
    private long id;
    @SerializedName("kind")
    private String kind;
    @SerializedName("language")
    private String language;
    @SerializedName("locale")
    private String locale;
    @SerializedName("name")
    private String name;
    @SerializedName("provider")
    private String provider;
    @SerializedName("timeZone")
    private String timeZone;
    @SerializedName("uid")
    private String uid;
    @SerializedName("updated")
    private Date updated;

    /**
     * Create new instance of User.
     */
    public User() {
    }

    /**
     * Country/Region is the ISO code for the country/region, e.g. DE or CH.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Country/Region is the ISO code for the country/region, e.g. DE or CH.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Created is the date/time when the user was created, e.g. 2015-03-19T12:09:45Z
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Created is the date/time when the user was created, e.g. 2015-03-19T12:09:45Z
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Currency is the default ISO code for currencies, e.g. EUR or GBP.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Currency is the default ISO code for currencies, e.g. EUR or GBP.
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Email is the email address.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Email is the email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ID is a unique (internal) identifier of the user.
     */
    public long getId() {
        return this.id;
    }

    /**
     * ID is a unique (internal) identifier of the user.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Kind is store#user for this entity.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#user for this entity.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Language is the code for the language, e.g. de or en.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Language is the code for the language, e.g. de or en.
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
     * Name is the user, including first and last name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name is the user, including first and last name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Provider is used internally.
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Provider is used internally.
     */
    public void setProvider(String provider) {
        this.provider = provider;
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
     * UID is used internally.
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * UID is used internally.
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Updated is the date/time when the user was last modified, e.g.
     * 2015-03-19T12:09:45Z
     */
    public Date getUpdated() {
        return this.updated;
    }

    /**
     * Updated is the date/time when the user was last modified, e.g.
     * 2015-03-19T12:09:45Z
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
