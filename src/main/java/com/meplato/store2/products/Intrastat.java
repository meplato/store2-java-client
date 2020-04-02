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
 * Intrastat represents data required for Intrastat messages.
 */
public class Intrastat {
    @SerializedName("code")
    private String code;
    @SerializedName("grossWeight")
    private double grossWeight;
    @SerializedName("meansOfTransport")
    private String meansOfTransport;
    @SerializedName("netWeight")
    private double netWeight;
    @SerializedName("originCountry")
    private String originCountry;
    @SerializedName("transactionType")
    private String transactionType;
    @SerializedName("weightUnit")
    private String weightUnit;

    /**
     * Create new instance of Intrastat.
     */
    public Intrastat() {
    }

    /**
     * Code represents an identifier for a product group, e.g. the tariff code of
     * "85167100" for "Electro-thermic coffee or tea makers, for domestic use". See
     * https://www.zolltarifnummern.de/2018 for details. This is a required field.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Code represents an identifier for a product group, e.g. the tariff code of
     * "85167100" for "Electro-thermic coffee or tea makers, for domestic use". See
     * https://www.zolltarifnummern.de/2018 for details. This is a required field.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * GrossWeight represents the gross weight of the product.
     */
    public double getGrossWeight() {
        return this.grossWeight;
    }

    /**
     * GrossWeight represents the gross weight of the product.
     */
    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * MeansOfTransport indicates how the product was delivered to its destination,
     * e.g. by air or by train. According to the INTRASTAT documentation, the
     * following values are permitted (see
     * https://www-idev.destatis.de/idev/doc/intra/doc/Intrahandel_Leitfaden.pdf for
     * a complete list): 1 - Maritime traffic 2 - Rail transport 3 - Road traffic 4
     * - Air traffic 5 - Mailings / postal service 7 - Pipings 8 - Inland waterways
     * 9 - Own drive The value of "6" is missing in that list, and it's not a typo.
     */
    public String getMeansOfTransport() {
        return this.meansOfTransport;
    }

    /**
     * MeansOfTransport indicates how the product was delivered to its destination,
     * e.g. by air or by train. According to the INTRASTAT documentation, the
     * following values are permitted (see
     * https://www-idev.destatis.de/idev/doc/intra/doc/Intrahandel_Leitfaden.pdf for
     * a complete list): 1 - Maritime traffic 2 - Rail transport 3 - Road traffic 4
     * - Air traffic 5 - Mailings / postal service 7 - Pipings 8 - Inland waterways
     * 9 - Own drive The value of "6" is missing in that list, and it's not a typo.
     */
    public void setMeansOfTransport(String meansOfTransport) {
        this.meansOfTransport = meansOfTransport;
    }

    /**
     * NetWeight represents the net weight of the product.
     */
    public double getNetWeight() {
        return this.netWeight;
    }

    /**
     * NetWeight represents the net weight of the product.
     */
    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * OriginCountry represents the ISO code of the country where the product has
     * been created/produced, e.g. DE. This is a required field.
     */
    public String getOriginCountry() {
        return this.originCountry;
    }

    /**
     * OriginCountry represents the ISO code of the country where the product has
     * been created/produced, e.g. DE. This is a required field.
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * TransactionType indicates the type of transaction, e.g. if it represents a
     * purchase or a leasing contract. In the INTRASTAT documentation, this is
     * represented by two digits, e.g. "11" for a purchase and "14" for leasing. See
     * https://www-idev.destatis.de/idev/doc/intra/doc/Intrahandel_Leitfaden.pdf for
     * details.
     */
    public String getTransactionType() {
        return this.transactionType;
    }

    /**
     * TransactionType indicates the type of transaction, e.g. if it represents a
     * purchase or a leasing contract. In the INTRASTAT documentation, this is
     * represented by two digits, e.g. "11" for a purchase and "14" for leasing. See
     * https://www-idev.destatis.de/idev/doc/intra/doc/Intrahandel_Leitfaden.pdf for
     * details.
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * WeightUnit is the ISO code of for NetWeight and/or GrossWeight, e.g. KGM.
     */
    public String getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * WeightUnit is the ISO code of for NetWeight and/or GrossWeight, e.g. KGM.
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
}

