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
package com.meplato.store2.catalogs;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * CreateCatalog holds the properties of a new catalog.
 */
public class CreateCatalog {
    @SerializedName("country")
    private String country;
    @SerializedName("currency")
    private String currency;
    @SerializedName("description")
    private String description;
    @SerializedName("language")
    private String language;
    @SerializedName("merchantId")
    private long merchantId;
    @SerializedName("name")
    private String name;
    @SerializedName("projectId")
    private long projectId;
    @SerializedName("projectMpcc")
    private String projectMpcc;
    @SerializedName("sageContract")
    private String sageContract;
    @SerializedName("sageNumber")
    private String sageNumber;
    @SerializedName("target")
    private String target;
    @SerializedName("type")
    private String type;
    @SerializedName("validFrom")
    private String validFrom;
    @SerializedName("validUntil")
    private String validUntil;

    /**
     * Create new instance of CreateCatalog.
     */
    public CreateCatalog() {
    }

    /**
     * Country/Region is the ISO-3166 alpha-2 code for the country/region that the
     * catalog is destined for (e.g. DE or US).
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Country/Region is the ISO-3166 alpha-2 code for the country/region that the
     * catalog is destined for (e.g. DE or US).
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Currency is the ISO-4217 currency code that is used for all products in the
     * catalog (e.g. EUR or USD).
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Currency is the ISO-4217 currency code that is used for all products in the
     * catalog (e.g. EUR or USD).
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Description of the catalog.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Description of the catalog.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Language is the IETF language tag of the language of all products in the
     * catalog (e.g. de or pt-BR).
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Language is the IETF language tag of the language of all products in the
     * catalog (e.g. de or pt-BR).
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * ID of the merchant.
     */
    public long getMerchantId() {
        return this.merchantId;
    }

    /**
     * ID of the merchant.
     */
    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * Name of the catalog.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name of the catalog.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ID of the project.
     */
    public long getProjectId() {
        return this.projectId;
    }

    /**
     * ID of the project.
     */
    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    /**
     * MPCC of the project.
     */
    public String getProjectMpcc() {
        return this.projectMpcc;
    }

    /**
     * MPCC of the project.
     */
    public void setProjectMpcc(String projectMpcc) {
        this.projectMpcc = projectMpcc;
    }

    /**
     * SageContract represents the internal identifier at Meplato for the contract
     * of this catalog.
     */
    public String getSageContract() {
        return this.sageContract;
    }

    /**
     * SageContract represents the internal identifier at Meplato for the contract
     * of this catalog.
     */
    public void setSageContract(String sageContract) {
        this.sageContract = sageContract;
    }

    /**
     * SageNumber represents the internal identifier at Meplato for the merchant of
     * this catalog.
     */
    public String getSageNumber() {
        return this.sageNumber;
    }

    /**
     * SageNumber represents the internal identifier at Meplato for the merchant of
     * this catalog.
     */
    public void setSageNumber(String sageNumber) {
        this.sageNumber = sageNumber;
    }

    /**
     * Target represents the target system which can be either an empty string,
     * "catscout" or "mall".
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Target represents the target system which can be either an empty string,
     * "catscout" or "mall".
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Type represents a catalog type which can be either "CC" 1:1 Corporate or "MB"
     * Meplato Business 1 Creditor.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Type represents a catalog type which can be either "CC" 1:1 Corporate or "MB"
     * Meplato Business 1 Creditor.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ValidFrom is the date the catalog becomes effective (YYYY-MM-DD).
     */
    public String getValidFrom() {
        return this.validFrom;
    }

    /**
     * ValidFrom is the date the catalog becomes effective (YYYY-MM-DD).
     */
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * ValidUntil is the date the catalog expires (YYYY-MM-DD).
     */
    public String getValidUntil() {
        return this.validUntil;
    }

    /**
     * ValidUntil is the date the catalog expires (YYYY-MM-DD).
     */
    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }
}
