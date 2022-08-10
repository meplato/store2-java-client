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

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Product is a good or service in a catalog.
 */
public class Product {
    @SerializedName("asin")
    private String asin;
    @SerializedName("autoConfigure")
    private Boolean autoConfigure;
    @SerializedName("availability")
    private Availability availability;
    @SerializedName("blobs")
    private Blob[] blobs;
    @SerializedName("boostFactor")
    private Double boostFactor;
    @SerializedName("bpn")
    private String bpn;
    @SerializedName("brand")
    private String brand;
    @SerializedName("catalogId")
    private long catalogId;
    @SerializedName("catalogManaged")
    private boolean catalogManaged;
    @SerializedName("categories")
    private String[] categories;
    @SerializedName("conditions")
    private Condition[] conditions;
    @SerializedName("contract")
    private String contract;
    @SerializedName("contractItem")
    private String contractItem;
    @SerializedName("conversionDenumerator")
    private Double conversionDenumerator;
    @SerializedName("conversionNumerator")
    private Double conversionNumerator;
    @SerializedName("country")
    private String country;
    @SerializedName("created")
    private Date created;
    @SerializedName("cu")
    private String contentUnit;
    @SerializedName("cuPerOu")
    private double cuPerOu;
    @SerializedName("currency")
    private String currency;
    @SerializedName("custField1")
    private String custField1;
    @SerializedName("custField2")
    private String custField2;
    @SerializedName("custField3")
    private String custField3;
    @SerializedName("custField4")
    private String custField4;
    @SerializedName("custField5")
    private String custField5;
    @SerializedName("custFields")
    private CustField[] custFields;
    @SerializedName("customField10")
    private String customField10;
    @SerializedName("customField11")
    private String customField11;
    @SerializedName("customField12")
    private String customField12;
    @SerializedName("customField13")
    private String customField13;
    @SerializedName("customField14")
    private String customField14;
    @SerializedName("customField15")
    private String customField15;
    @SerializedName("customField16")
    private String customField16;
    @SerializedName("customField17")
    private String customField17;
    @SerializedName("customField18")
    private String customField18;
    @SerializedName("customField19")
    private String customField19;
    @SerializedName("customField20")
    private String customField20;
    @SerializedName("customField21")
    private String customField21;
    @SerializedName("customField22")
    private String customField22;
    @SerializedName("customField23")
    private String customField23;
    @SerializedName("customField24")
    private String customField24;
    @SerializedName("customField25")
    private String customField25;
    @SerializedName("customField26")
    private String customField26;
    @SerializedName("customField27")
    private String customField27;
    @SerializedName("customField28")
    private String customField28;
    @SerializedName("customField29")
    private String customField29;
    @SerializedName("customField30")
    private String customField30;
    @SerializedName("customField31")
    private String customField31;
    @SerializedName("customField32")
    private String customField32;
    @SerializedName("customField33")
    private String customField33;
    @SerializedName("customField34")
    private String customField34;
    @SerializedName("customField35")
    private String customField35;
    @SerializedName("customField36")
    private String customField36;
    @SerializedName("customField37")
    private String customField37;
    @SerializedName("customField38")
    private String customField38;
    @SerializedName("customField39")
    private String customField39;
    @SerializedName("customField40")
    private String customField40;
    @SerializedName("customField41")
    private String customField41;
    @SerializedName("customField42")
    private String customField42;
    @SerializedName("customField43")
    private String customField43;
    @SerializedName("customField44")
    private String customField44;
    @SerializedName("customField45")
    private String customField45;
    @SerializedName("customField46")
    private String customField46;
    @SerializedName("customField47")
    private String customField47;
    @SerializedName("customField48")
    private String customField48;
    @SerializedName("customField49")
    private String customField49;
    @SerializedName("customField50")
    private String customField50;
    @SerializedName("customField6")
    private String customField6;
    @SerializedName("customField7")
    private String customField7;
    @SerializedName("customField8")
    private String customField8;
    @SerializedName("customField9")
    private String customField9;
    @SerializedName("datasheet")
    private String datasheet;
    @SerializedName("datasheetURL")
    private String datasheetURL;
    @SerializedName("description")
    private String description;
    @SerializedName("eclasses")
    private Eclass[] eclasses;
    @SerializedName("erpGroupSupplier")
    private String erpGroupSupplier;
    @SerializedName("excluded")
    private boolean excluded;
    @SerializedName("extCategory")
    private String extCategory;
    @SerializedName("extCategoryId")
    private String extCategoryId;
    @SerializedName("extConfigForm")
    private String extConfigForm;
    @SerializedName("extConfigService")
    private String extConfigService;
    @SerializedName("extProductId")
    private String extProductId;
    @SerializedName("extSchemaType")
    private String extSchemaType;
    @SerializedName("features")
    private Feature[] features;
    @SerializedName("glAccount")
    private String glAccount;
    @SerializedName("gtin")
    private String gtin;
    @SerializedName("hazmats")
    private Hazmat[] hazmats;
    @SerializedName("id")
    private String id;
    @SerializedName("image")
    private String image;
    @SerializedName("imageURL")
    private String imageURL;
    @SerializedName("incomplete")
    private Boolean incomplete;
    @SerializedName("intrastat")
    private Intrastat intrastat;
    @SerializedName("isPassword")
    private Boolean isPassword;
    @SerializedName("keepPrice")
    private Boolean keepPrice;
    @SerializedName("keywords")
    private String[] keywords;
    @SerializedName("kind")
    private String kind;
    @SerializedName("leadtime")
    private Double leadtime;
    @SerializedName("listPrice")
    private double listPrice;
    @SerializedName("manufactcode")
    private String manufactcode;
    @SerializedName("manufacturer")
    private String manufacturer;
    @SerializedName("matgroup")
    private String matgroup;
    @SerializedName("meplatoPrice")
    private double meplatoPrice;
    @SerializedName("merchantId")
    private long merchantId;
    @SerializedName("mode")
    private String mode;
    @SerializedName("mpn")
    private String mpn;
    @SerializedName("multiSupplierId")
    private String multiSupplierId;
    @SerializedName("multiSupplierName")
    private String multiSupplierName;
    @SerializedName("name")
    private String name;
    @SerializedName("needsGoodsReceipt")
    private Boolean needsGoodsReceipt;
    @SerializedName("nfBasePrice")
    private Double nfBasePrice;
    @SerializedName("nfBasePriceQuantity")
    private Double nfBasePriceQuantity;
    @SerializedName("nfCndId")
    private String nfCndId;
    @SerializedName("nfScale")
    private Double nfScale;
    @SerializedName("nfScaleQuantity")
    private Double nfScaleQuantity;
    @SerializedName("orderable")
    private Boolean orderable;
    @SerializedName("ou")
    private String orderUnit;
    @SerializedName("price")
    private double price;
    @SerializedName("priceFormula")
    private String priceFormula;
    @SerializedName("priceQty")
    private double priceQty;
    @SerializedName("projectId")
    private long projectId;
    @SerializedName("quantityInterval")
    private Double quantityInterval;
    @SerializedName("quantityMax")
    private Double quantityMax;
    @SerializedName("quantityMin")
    private Double quantityMin;
    @SerializedName("rateable")
    private Boolean rateable;
    @SerializedName("rateableOnlyIfOrdered")
    private Boolean rateableOnlyIfOrdered;
    @SerializedName("references")
    private Reference[] references;
    @SerializedName("safetysheet")
    private String safetysheet;
    @SerializedName("safetysheetURL")
    private String safetysheetURL;
    @SerializedName("scalePrices")
    private ScalePrice[] scalePrices;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("service")
    private boolean service;
    @SerializedName("spn")
    private String spn;
    @SerializedName("taxCode")
    private String taxCode;
    @SerializedName("taxRate")
    private double taxRate;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("thumbnailURL")
    private String thumbnailURL;
    @SerializedName("unspscs")
    private Unspsc[] unspscs;
    @SerializedName("updated")
    private Date updated;
    @SerializedName("visible")
    private Boolean visible;

    /**
     * Create new instance of Product.
     */
    public Product() {
    }

    /**
     * ASIN is the unique Amazon article number of the product.
     */
    public String getAsin() {
        return this.asin;
    }

    /**
     * ASIN is the unique Amazon article number of the product.
     */
    public void setAsin(String asin) {
        this.asin = asin;
    }

    /**
     * AutoConfigure is a flag that indicates whether this product can be configured
     * automatically.
     */
    public Boolean getAutoConfigure() {
        return this.autoConfigure;
    }

    /**
     * AutoConfigure is a flag that indicates whether this product can be configured
     * automatically.
     */
    public void setAutoConfigure(Boolean autoConfigure) {
        this.autoConfigure = autoConfigure;
    }

    /**
     * Availability allows the update of product availability data, e.g. the number
     * of items in stock or the date when the product will be available again.
     */
    public Availability getAvailability() {
        return this.availability;
    }

    /**
     * Availability allows the update of product availability data, e.g. the number
     * of items in stock or the date when the product will be available again.
     */
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    /**
     * Blobs specifies external data, e.g. images or datasheets.
     */
    public Blob[] getBlobs() {
        return this.blobs;
    }

    /**
     * Blobs specifies external data, e.g. images or datasheets.
     */
    public void setBlobs(Blob[] blobs) {
        this.blobs = blobs;
    }

    /**
     * BoostFactor represents a positive or negative boost for the product.
     */
    public Double getBoostFactor() {
        return this.boostFactor;
    }

    /**
     * BoostFactor represents a positive or negative boost for the product.
     */
    public void setBoostFactor(Double boostFactor) {
        this.boostFactor = boostFactor;
    }

    /**
     * BPN is the buyer part number of the product.
     */
    public String getBpn() {
        return this.bpn;
    }

    /**
     * BPN is the buyer part number of the product.
     */
    public void setBpn(String bpn) {
        this.bpn = bpn;
    }

    /**
     * Brand is the commercial brand name of the product (i.e. end-consumer
     * recognizable brand name)
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Brand is the commercial brand name of the product (i.e. end-consumer
     * recognizable brand name)
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * ID of the catalog this products belongs to.
     */
    public long getCatalogId() {
        return this.catalogId;
    }

    /**
     * ID of the catalog this products belongs to.
     */
    public void setCatalogId(long catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * CatalogManaged is a flag that indicates whether this product is configurable
     * (or catalog managed in OCI parlance).
     */
    public boolean isCatalogManaged() {
        return this.catalogManaged;
    }

    /**
     * CatalogManaged is a flag that indicates whether this product is configurable
     * (or catalog managed in OCI parlance).
     */
    public void setCatalogManaged(boolean catalogManaged) {
        this.catalogManaged = catalogManaged;
    }

    /**
     * Categories is a list of (supplier-specific) category names the product
     * belongs to.
     */
    public String[] getCategories() {
        return this.categories;
    }

    /**
     * Categories is a list of (supplier-specific) category names the product
     * belongs to.
     */
    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    /**
     * Conditions describes the product conditions, e.g. refurbished or used.
     */
    public Condition[] getConditions() {
        return this.conditions;
    }

    /**
     * Conditions describes the product conditions, e.g. refurbished or used.
     */
    public void setConditions(Condition[] conditions) {
        this.conditions = conditions;
    }

    /**
     * Contract represents the contract number to be used when purchasing this
     * product.
     */
    public String getContract() {
        return this.contract;
    }

    /**
     * Contract represents the contract number to be used when purchasing this
     * product.
     */
    public void setContract(String contract) {
        this.contract = contract;
    }

    /**
     * ContractItem represents line number in the contract to be used when
     * purchasing this product. See also Contract.
     */
    public String getContractItem() {
        return this.contractItem;
    }

    /**
     * ContractItem represents line number in the contract to be used when
     * purchasing this product. See also Contract.
     */
    public void setContractItem(String contractItem) {
        this.contractItem = contractItem;
    }

    /**
     * ConversionDenumerator is the denumerator for calculating price quantities.
     */
    public Double getConversionDenumerator() {
        return this.conversionDenumerator;
    }

    /**
     * ConversionDenumerator is the denumerator for calculating price quantities.
     */
    public void setConversionDenumerator(Double conversionDenumerator) {
        this.conversionDenumerator = conversionDenumerator;
    }

    /**
     * ConversionNumerator is the numerator for calculating price quantities.
     */
    public Double getConversionNumerator() {
        return this.conversionNumerator;
    }

    /**
     * ConversionNumerator is the numerator for calculating price quantities.
     */
    public void setConversionNumerator(Double conversionNumerator) {
        this.conversionNumerator = conversionNumerator;
    }

    /**
     * Country/Region represents the ISO code of the country/region of origin, i.e.
     * the country/region where the product has been created/produced, e.g. DE. If
     * unspecified, the field is initialized with the catalog's country/region
     * field.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Country/Region represents the ISO code of the country/region of origin, i.e.
     * the country/region where the product has been created/produced, e.g. DE. If
     * unspecified, the field is initialized with the catalog's country/region
     * field.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Created is the creation date and time of the product.
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Created is the creation date and time of the product.
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * ContentUnit is the content unit of the product, a 3-character ISO code
     * (usually project-specific).
     */
    public String getContentUnit() {
        return this.contentUnit;
    }

    /**
     * ContentUnit is the content unit of the product, a 3-character ISO code
     * (usually project-specific).
     */
    public void setContentUnit(String contentUnit) {
        this.contentUnit = contentUnit;
    }

    /**
     * CuPerOu describes the number of content units per order unit, e.g. the 12 in
     * '1 case contains 12 bottles'.
     */
    public double getCuPerOu() {
        return this.cuPerOu;
    }

    /**
     * CuPerOu describes the number of content units per order unit, e.g. the 12 in
     * '1 case contains 12 bottles'.
     */
    public void setCuPerOu(double cuPerOu) {
        this.cuPerOu = cuPerOu;
    }

    /**
     * Currency is the ISO currency code for the prices, e.g. EUR or GBP. If you
     * pass an empty currency code, it will be initialized with the catalog's
     * currency.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Currency is the ISO currency code for the prices, e.g. EUR or GBP. If you
     * pass an empty currency code, it will be initialized with the catalog's
     * currency.
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * CustField1 is the CUST_FIELD1 of the SAP OCI specification. It has a maximum
     * length of 10 characters.
     */
    public String getCustField1() {
        return this.custField1;
    }

    /**
     * CustField1 is the CUST_FIELD1 of the SAP OCI specification. It has a maximum
     * length of 10 characters.
     */
    public void setCustField1(String custField1) {
        this.custField1 = custField1;
    }

    /**
     * CustField2 is the CUST_FIELD2 of the SAP OCI specification. It has a maximum
     * length of 10 characters.
     */
    public String getCustField2() {
        return this.custField2;
    }

    /**
     * CustField2 is the CUST_FIELD2 of the SAP OCI specification. It has a maximum
     * length of 10 characters.
     */
    public void setCustField2(String custField2) {
        this.custField2 = custField2;
    }

    /**
     * CustField3 is the CUST_FIELD3 of the SAP OCI specification. It has a maximum
     * length of 10 characters.
     */
    public String getCustField3() {
        return this.custField3;
    }

    /**
     * CustField3 is the CUST_FIELD3 of the SAP OCI specification. It has a maximum
     * length of 10 characters.
     */
    public void setCustField3(String custField3) {
        this.custField3 = custField3;
    }

    /**
     * CustField4 is the CUST_FIELD4 of the SAP OCI specification. It has a maximum
     * length of 20 characters.
     */
    public String getCustField4() {
        return this.custField4;
    }

    /**
     * CustField4 is the CUST_FIELD4 of the SAP OCI specification. It has a maximum
     * length of 20 characters.
     */
    public void setCustField4(String custField4) {
        this.custField4 = custField4;
    }

    /**
     * CustField5 is the CUST_FIELD5 of the SAP OCI specification. It has a maximum
     * length of 50 characters.
     */
    public String getCustField5() {
        return this.custField5;
    }

    /**
     * CustField5 is the CUST_FIELD5 of the SAP OCI specification. It has a maximum
     * length of 50 characters.
     */
    public void setCustField5(String custField5) {
        this.custField5 = custField5;
    }

    /**
     * CustFields is an array of generic name/value pairs for customer-specific
     * attributes.
     */
    public CustField[] getCustFields() {
        return this.custFields;
    }

    /**
     * CustFields is an array of generic name/value pairs for customer-specific
     * attributes.
     */
    public void setCustFields(CustField[] custFields) {
        this.custFields = custFields;
    }

    /**
     * CustomField10 represents the 10th customer-specific field.
     */
    public String getCustomField10() {
        return this.customField10;
    }

    /**
     * CustomField10 represents the 10th customer-specific field.
     */
    public void setCustomField10(String customField10) {
        this.customField10 = customField10;
    }

    /**
     * CustomField11 represents the 11th customer-specific field.
     */
    public String getCustomField11() {
        return this.customField11;
    }

    /**
     * CustomField11 represents the 11th customer-specific field.
     */
    public void setCustomField11(String customField11) {
        this.customField11 = customField11;
    }

    /**
     * CustomField12 represents the 12th customer-specific field.
     */
    public String getCustomField12() {
        return this.customField12;
    }

    /**
     * CustomField12 represents the 12th customer-specific field.
     */
    public void setCustomField12(String customField12) {
        this.customField12 = customField12;
    }

    /**
     * CustomField13 represents the 13th customer-specific field.
     */
    public String getCustomField13() {
        return this.customField13;
    }

    /**
     * CustomField13 represents the 13th customer-specific field.
     */
    public void setCustomField13(String customField13) {
        this.customField13 = customField13;
    }

    /**
     * CustomField14 represents the 14th customer-specific field.
     */
    public String getCustomField14() {
        return this.customField14;
    }

    /**
     * CustomField14 represents the 14th customer-specific field.
     */
    public void setCustomField14(String customField14) {
        this.customField14 = customField14;
    }

    /**
     * CustomField15 represents the 15th customer-specific field.
     */
    public String getCustomField15() {
        return this.customField15;
    }

    /**
     * CustomField15 represents the 15th customer-specific field.
     */
    public void setCustomField15(String customField15) {
        this.customField15 = customField15;
    }

    /**
     * CustomField16 represents the 16th customer-specific field.
     */
    public String getCustomField16() {
        return this.customField16;
    }

    /**
     * CustomField16 represents the 16th customer-specific field.
     */
    public void setCustomField16(String customField16) {
        this.customField16 = customField16;
    }

    /**
     * CustomField17 represents the 17th customer-specific field.
     */
    public String getCustomField17() {
        return this.customField17;
    }

    /**
     * CustomField17 represents the 17th customer-specific field.
     */
    public void setCustomField17(String customField17) {
        this.customField17 = customField17;
    }

    /**
     * CustomField18 represents the 18th customer-specific field.
     */
    public String getCustomField18() {
        return this.customField18;
    }

    /**
     * CustomField18 represents the 18th customer-specific field.
     */
    public void setCustomField18(String customField18) {
        this.customField18 = customField18;
    }

    /**
     * CustomField19 represents the 19th customer-specific field.
     */
    public String getCustomField19() {
        return this.customField19;
    }

    /**
     * CustomField19 represents the 19th customer-specific field.
     */
    public void setCustomField19(String customField19) {
        this.customField19 = customField19;
    }

    /**
     * CustomField20 represents the 20th customer-specific field.
     */
    public String getCustomField20() {
        return this.customField20;
    }

    /**
     * CustomField20 represents the 20th customer-specific field.
     */
    public void setCustomField20(String customField20) {
        this.customField20 = customField20;
    }

    /**
     * CustomField21 represents the 21st customer-specific field.
     */
    public String getCustomField21() {
        return this.customField21;
    }

    /**
     * CustomField21 represents the 21st customer-specific field.
     */
    public void setCustomField21(String customField21) {
        this.customField21 = customField21;
    }

    /**
     * CustomField22 represents the 22nd customer-specific field.
     */
    public String getCustomField22() {
        return this.customField22;
    }

    /**
     * CustomField22 represents the 22nd customer-specific field.
     */
    public void setCustomField22(String customField22) {
        this.customField22 = customField22;
    }

    /**
     * CustomField23 represents the 23rd customer-specific field.
     */
    public String getCustomField23() {
        return this.customField23;
    }

    /**
     * CustomField23 represents the 23rd customer-specific field.
     */
    public void setCustomField23(String customField23) {
        this.customField23 = customField23;
    }

    /**
     * CustomField24 represents the 24th customer-specific field.
     */
    public String getCustomField24() {
        return this.customField24;
    }

    /**
     * CustomField24 represents the 24th customer-specific field.
     */
    public void setCustomField24(String customField24) {
        this.customField24 = customField24;
    }

    /**
     * CustomField25 represents the 25th customer-specific field.
     */
    public String getCustomField25() {
        return this.customField25;
    }

    /**
     * CustomField25 represents the 25th customer-specific field.
     */
    public void setCustomField25(String customField25) {
        this.customField25 = customField25;
    }

    /**
     * CustomField26 represents the 26th customer-specific field.
     */
    public String getCustomField26() {
        return this.customField26;
    }

    /**
     * CustomField26 represents the 26th customer-specific field.
     */
    public void setCustomField26(String customField26) {
        this.customField26 = customField26;
    }

    /**
     * CustomField27 represents the 27th customer-specific field.
     */
    public String getCustomField27() {
        return this.customField27;
    }

    /**
     * CustomField27 represents the 27th customer-specific field.
     */
    public void setCustomField27(String customField27) {
        this.customField27 = customField27;
    }

    /**
     * CustomField28 represents the 28th customer-specific field.
     */
    public String getCustomField28() {
        return this.customField28;
    }

    /**
     * CustomField28 represents the 28th customer-specific field.
     */
    public void setCustomField28(String customField28) {
        this.customField28 = customField28;
    }

    /**
     * CustomField29 represents the 29th customer-specific field.
     */
    public String getCustomField29() {
        return this.customField29;
    }

    /**
     * CustomField29 represents the 29th customer-specific field.
     */
    public void setCustomField29(String customField29) {
        this.customField29 = customField29;
    }

    /**
     * CustomField30 represents the 30th customer-specific field.
     */
    public String getCustomField30() {
        return this.customField30;
    }

    /**
     * CustomField30 represents the 30th customer-specific field.
     */
    public void setCustomField30(String customField30) {
        this.customField30 = customField30;
    }

    /**
     * CustomField31 represents the 31st customer-specific field.
     */
    public String getCustomField31() {
        return this.customField31;
    }

    /**
     * CustomField31 represents the 31st customer-specific field.
     */
    public void setCustomField31(String customField31) {
        this.customField31 = customField31;
    }

    /**
     * CustomField32 represents the 32nd customer-specific field.
     */
    public String getCustomField32() {
        return this.customField32;
    }

    /**
     * CustomField32 represents the 32nd customer-specific field.
     */
    public void setCustomField32(String customField32) {
        this.customField32 = customField32;
    }

    /**
     * CustomField33 represents the 33rd customer-specific field.
     */
    public String getCustomField33() {
        return this.customField33;
    }

    /**
     * CustomField33 represents the 33rd customer-specific field.
     */
    public void setCustomField33(String customField33) {
        this.customField33 = customField33;
    }

    /**
     * CustomField34 represents the 34th customer-specific field.
     */
    public String getCustomField34() {
        return this.customField34;
    }

    /**
     * CustomField34 represents the 34th customer-specific field.
     */
    public void setCustomField34(String customField34) {
        this.customField34 = customField34;
    }

    /**
     * CustomField35 represents the 35th customer-specific field.
     */
    public String getCustomField35() {
        return this.customField35;
    }

    /**
     * CustomField35 represents the 35th customer-specific field.
     */
    public void setCustomField35(String customField35) {
        this.customField35 = customField35;
    }

    /**
     * CustomField36 represents the 36th customer-specific field.
     */
    public String getCustomField36() {
        return this.customField36;
    }

    /**
     * CustomField36 represents the 36th customer-specific field.
     */
    public void setCustomField36(String customField36) {
        this.customField36 = customField36;
    }

    /**
     * CustomField37 represents the 37th customer-specific field.
     */
    public String getCustomField37() {
        return this.customField37;
    }

    /**
     * CustomField37 represents the 37th customer-specific field.
     */
    public void setCustomField37(String customField37) {
        this.customField37 = customField37;
    }

    /**
     * CustomField38 represents the 38th customer-specific field.
     */
    public String getCustomField38() {
        return this.customField38;
    }

    /**
     * CustomField38 represents the 38th customer-specific field.
     */
    public void setCustomField38(String customField38) {
        this.customField38 = customField38;
    }

    /**
     * CustomField39 represents the 39th customer-specific field.
     */
    public String getCustomField39() {
        return this.customField39;
    }

    /**
     * CustomField39 represents the 39th customer-specific field.
     */
    public void setCustomField39(String customField39) {
        this.customField39 = customField39;
    }

    /**
     * CustomField40 represents the 40th customer-specific field.
     */
    public String getCustomField40() {
        return this.customField40;
    }

    /**
     * CustomField40 represents the 40th customer-specific field.
     */
    public void setCustomField40(String customField40) {
        this.customField40 = customField40;
    }

    /**
     * CustomField41 represents the 41st customer-specific field.
     */
    public String getCustomField41() {
        return this.customField41;
    }

    /**
     * CustomField41 represents the 41st customer-specific field.
     */
    public void setCustomField41(String customField41) {
        this.customField41 = customField41;
    }

    /**
     * CustomField42 represents the 42nd customer-specific field.
     */
    public String getCustomField42() {
        return this.customField42;
    }

    /**
     * CustomField42 represents the 42nd customer-specific field.
     */
    public void setCustomField42(String customField42) {
        this.customField42 = customField42;
    }

    /**
     * CustomField43 represents the 43rd customer-specific field.
     */
    public String getCustomField43() {
        return this.customField43;
    }

    /**
     * CustomField43 represents the 43rd customer-specific field.
     */
    public void setCustomField43(String customField43) {
        this.customField43 = customField43;
    }

    /**
     * CustomField44 represents the 44th customer-specific field.
     */
    public String getCustomField44() {
        return this.customField44;
    }

    /**
     * CustomField44 represents the 44th customer-specific field.
     */
    public void setCustomField44(String customField44) {
        this.customField44 = customField44;
    }

    /**
     * CustomField45 represents the 45th customer-specific field.
     */
    public String getCustomField45() {
        return this.customField45;
    }

    /**
     * CustomField45 represents the 45th customer-specific field.
     */
    public void setCustomField45(String customField45) {
        this.customField45 = customField45;
    }

    /**
     * CustomField46 represents the 46th customer-specific field.
     */
    public String getCustomField46() {
        return this.customField46;
    }

    /**
     * CustomField46 represents the 46th customer-specific field.
     */
    public void setCustomField46(String customField46) {
        this.customField46 = customField46;
    }

    /**
     * CustomField47 represents the 47th customer-specific field.
     */
    public String getCustomField47() {
        return this.customField47;
    }

    /**
     * CustomField47 represents the 47th customer-specific field.
     */
    public void setCustomField47(String customField47) {
        this.customField47 = customField47;
    }

    /**
     * CustomField48 represents the 48th customer-specific field.
     */
    public String getCustomField48() {
        return this.customField48;
    }

    /**
     * CustomField48 represents the 48th customer-specific field.
     */
    public void setCustomField48(String customField48) {
        this.customField48 = customField48;
    }

    /**
     * CustomField49 represents the 49th customer-specific field.
     */
    public String getCustomField49() {
        return this.customField49;
    }

    /**
     * CustomField49 represents the 49th customer-specific field.
     */
    public void setCustomField49(String customField49) {
        this.customField49 = customField49;
    }

    /**
     * CustomField50 represents the 50th customer-specific field.
     */
    public String getCustomField50() {
        return this.customField50;
    }

    /**
     * CustomField50 represents the 50th customer-specific field.
     */
    public void setCustomField50(String customField50) {
        this.customField50 = customField50;
    }

    /**
     * CustomField6 represents the 6th customer-specific field.
     */
    public String getCustomField6() {
        return this.customField6;
    }

    /**
     * CustomField6 represents the 6th customer-specific field.
     */
    public void setCustomField6(String customField6) {
        this.customField6 = customField6;
    }

    /**
     * CustomField7 represents the 7th customer-specific field.
     */
    public String getCustomField7() {
        return this.customField7;
    }

    /**
     * CustomField7 represents the 7th customer-specific field.
     */
    public void setCustomField7(String customField7) {
        this.customField7 = customField7;
    }

    /**
     * CustomField8 represents the 8th customer-specific field.
     */
    public String getCustomField8() {
        return this.customField8;
    }

    /**
     * CustomField8 represents the 8th customer-specific field.
     */
    public void setCustomField8(String customField8) {
        this.customField8 = customField8;
    }

    /**
     * CustomField9 represents the 9th customer-specific field.
     */
    public String getCustomField9() {
        return this.customField9;
    }

    /**
     * CustomField9 represents the 9th customer-specific field.
     */
    public void setCustomField9(String customField9) {
        this.customField9 = customField9;
    }

    /**
     * Datasheet is the name of an datasheet file (in the media files) or a URL to
     * the datasheet on the internet.
     */
    public String getDatasheet() {
        return this.datasheet;
    }

    /**
     * Datasheet is the name of an datasheet file (in the media files) or a URL to
     * the datasheet on the internet.
     */
    public void setDatasheet(String datasheet) {
        this.datasheet = datasheet;
    }

    /**
     * DatasheetURL is the URL to the data sheet (if available).
     */
    public String getDatasheetURL() {
        return this.datasheetURL;
    }

    /**
     * DatasheetURL is the URL to the data sheet (if available).
     */
    public void setDatasheetURL(String datasheetURL) {
        this.datasheetURL = datasheetURL;
    }

    /**
     * Description of the product.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Description of the product.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Eclasses is a list of eCl@ss categories the product belongs to.
     */
    public Eclass[] getEclasses() {
        return this.eclasses;
    }

    /**
     * Eclasses is a list of eCl@ss categories the product belongs to.
     */
    public void setEclasses(Eclass[] eclasses) {
        this.eclasses = eclasses;
    }

    /**
     * erpGroupSupplier is the material group of the product on the
     * merchant-/supplier-side.
     */
    public String getErpGroupSupplier() {
        return this.erpGroupSupplier;
    }

    /**
     * erpGroupSupplier is the material group of the product on the
     * merchant-/supplier-side.
     */
    public void setErpGroupSupplier(String erpGroupSupplier) {
        this.erpGroupSupplier = erpGroupSupplier;
    }

    /**
     * Excluded is a flag that indicates whether to exclude this product from the
     * catalog. If true, this product will not be published into the live area.
     */
    public boolean isExcluded() {
        return this.excluded;
    }

    /**
     * Excluded is a flag that indicates whether to exclude this product from the
     * catalog. If true, this product will not be published into the live area.
     */
    public void setExcluded(boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * ExtCategory is the EXT_CATEGORY field of the SAP OCI specification.
     */
    public String getExtCategory() {
        return this.extCategory;
    }

    /**
     * ExtCategory is the EXT_CATEGORY field of the SAP OCI specification.
     */
    public void setExtCategory(String extCategory) {
        this.extCategory = extCategory;
    }

    /**
     * ExtCategoryID is the EXT_CATEGORY_ID field of the SAP OCI specification.
     */
    public String getExtCategoryId() {
        return this.extCategoryId;
    }

    /**
     * ExtCategoryID is the EXT_CATEGORY_ID field of the SAP OCI specification.
     */
    public void setExtCategoryId(String extCategoryId) {
        this.extCategoryId = extCategoryId;
    }

    /**
     * ExtConfigForm represents information required to make the product
     * configurable.
     */
    public String getExtConfigForm() {
        return this.extConfigForm;
    }

    /**
     * ExtConfigForm represents information required to make the product
     * configurable.
     */
    public void setExtConfigForm(String extConfigForm) {
        this.extConfigForm = extConfigForm;
    }

    /**
     * ExtConfigService represents additional information required to make the
     * product configurable. See also ExtConfigForm.
     */
    public String getExtConfigService() {
        return this.extConfigService;
    }

    /**
     * ExtConfigService represents additional information required to make the
     * product configurable. See also ExtConfigForm.
     */
    public void setExtConfigService(String extConfigService) {
        this.extConfigService = extConfigService;
    }

    /**
     * ExtProductID is the EXT_PRODUCT_ID field of the SAP OCI specification. It is
     * e.g. required for configurable/catalog managed products.
     */
    public String getExtProductId() {
        return this.extProductId;
    }

    /**
     * ExtProductID is the EXT_PRODUCT_ID field of the SAP OCI specification. It is
     * e.g. required for configurable/catalog managed products.
     */
    public void setExtProductId(String extProductId) {
        this.extProductId = extProductId;
    }

    /**
     * ExtSchemaType is the EXT_SCHEMA_TYPE field of the SAP OCI specification.
     */
    public String getExtSchemaType() {
        return this.extSchemaType;
    }

    /**
     * ExtSchemaType is the EXT_SCHEMA_TYPE field of the SAP OCI specification.
     */
    public void setExtSchemaType(String extSchemaType) {
        this.extSchemaType = extSchemaType;
    }

    /**
     * Features defines product features, i.e. additional properties of the product.
     */
    public Feature[] getFeatures() {
        return this.features;
    }

    /**
     * Features defines product features, i.e. additional properties of the product.
     */
    public void setFeatures(Feature[] features) {
        this.features = features;
    }

    /**
     * GLAccount represents the GL account number to use for this product.
     */
    public String getGlAccount() {
        return this.glAccount;
    }

    /**
     * GLAccount represents the GL account number to use for this product.
     */
    public void setGlAccount(String glAccount) {
        this.glAccount = glAccount;
    }

    /**
     * GTIN is the global trade item number of the product (used to be EAN).
     */
    public String getGtin() {
        return this.gtin;
    }

    /**
     * GTIN is the global trade item number of the product (used to be EAN).
     */
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    /**
     * Hazmats classifies hazardous/dangerous goods.
     */
    public Hazmat[] getHazmats() {
        return this.hazmats;
    }

    /**
     * Hazmats classifies hazardous/dangerous goods.
     */
    public void setHazmats(Hazmat[] hazmats) {
        this.hazmats = hazmats;
    }

    /**
     * ID is a unique (internal) identifier of the product.
     */
    public String getId() {
        return this.id;
    }

    /**
     * ID is a unique (internal) identifier of the product.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Image is the name of an image file (in the media files) or a URL to the image
     * on the internet.
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Image is the name of an image file (in the media files) or a URL to the image
     * on the internet.
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ImageURL is the URL to the image.
     */
    public String getImageURL() {
        return this.imageURL;
    }

    /**
     * ImageURL is the URL to the image.
     */
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    /**
     * Incomplete is a flag that indicates whether this product is incomplete.
     */
    public Boolean getIncomplete() {
        return this.incomplete;
    }

    /**
     * Incomplete is a flag that indicates whether this product is incomplete.
     */
    public void setIncomplete(Boolean incomplete) {
        this.incomplete = incomplete;
    }

    /**
     * Intrastat specifies required data for Intrastat messages.
     */
    public Intrastat getIntrastat() {
        return this.intrastat;
    }

    /**
     * Intrastat specifies required data for Intrastat messages.
     */
    public void setIntrastat(Intrastat intrastat) {
        this.intrastat = intrastat;
    }

    /**
     * IsPassword is a flag that indicates whether this product will be used to
     * purchase a password, e.g. for a software product.
     */
    public Boolean getIsPassword() {
        return this.isPassword;
    }

    /**
     * IsPassword is a flag that indicates whether this product will be used to
     * purchase a password, e.g. for a software product.
     */
    public void setIsPassword(Boolean isPassword) {
        this.isPassword = isPassword;
    }

    /**
     * KeepPrice is a flag that indicates whether the price of the product will or
     * will not be calculated by the catalog.
     */
    public Boolean getKeepPrice() {
        return this.keepPrice;
    }

    /**
     * KeepPrice is a flag that indicates whether the price of the product will or
     * will not be calculated by the catalog.
     */
    public void setKeepPrice(Boolean keepPrice) {
        this.keepPrice = keepPrice;
    }

    /**
     * Keywords is a list of aliases for the product.
     */
    public String[] getKeywords() {
        return this.keywords;
    }

    /**
     * Keywords is a list of aliases for the product.
     */
    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    /**
     * Kind is store#product for a product entity.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#product for a product entity.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Leadtime is the number of days for delivery.
     */
    public Double getLeadtime() {
        return this.leadtime;
    }

    /**
     * Leadtime is the number of days for delivery.
     */
    public void setLeadtime(Double leadtime) {
        this.leadtime = leadtime;
    }

    /**
     * ListPrice is the net list price of the product.
     */
    public double getListPrice() {
        return this.listPrice;
    }

    /**
     * ListPrice is the net list price of the product.
     */
    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    /**
     * Manufactcode is the manufacturer code as used in the SAP OCI specification.
     */
    public String getManufactcode() {
        return this.manufactcode;
    }

    /**
     * Manufactcode is the manufacturer code as used in the SAP OCI specification.
     */
    public void setManufactcode(String manufactcode) {
        this.manufactcode = manufactcode;
    }

    /**
     * Manufacturer is the name of the manufacturer.
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * Manufacturer is the name of the manufacturer.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Matgroup is the material group of the product on the buy-side.
     */
    public String getMatgroup() {
        return this.matgroup;
    }

    /**
     * Matgroup is the material group of the product on the buy-side.
     */
    public void setMatgroup(String matgroup) {
        this.matgroup = matgroup;
    }

    /**
     * MeplatoPrice is the Meplato price of the product.
     */
    public double getMeplatoPrice() {
        return this.meplatoPrice;
    }

    /**
     * MeplatoPrice is the Meplato price of the product.
     */
    public void setMeplatoPrice(double meplatoPrice) {
        this.meplatoPrice = meplatoPrice;
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
     * Mode is only used for differential downloads and is the type of change of a
     * product (CREATED, UPDATED, DELETED).
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * Mode is only used for differential downloads and is the type of change of a
     * product (CREATED, UPDATED, DELETED).
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * MPN is the manufacturer part number.
     */
    public String getMpn() {
        return this.mpn;
    }

    /**
     * MPN is the manufacturer part number.
     */
    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    /**
     * MultiSupplierID represents an optional field for the unique identifier of a
     * supplier in a multi-supplier catalog.
     */
    public String getMultiSupplierId() {
        return this.multiSupplierId;
    }

    /**
     * MultiSupplierID represents an optional field for the unique identifier of a
     * supplier in a multi-supplier catalog.
     */
    public void setMultiSupplierId(String multiSupplierId) {
        this.multiSupplierId = multiSupplierId;
    }

    /**
     * MultiSupplierName represents an optional field for the name of the supplier
     * in a multi-supplier catalog.
     */
    public String getMultiSupplierName() {
        return this.multiSupplierName;
    }

    /**
     * MultiSupplierName represents an optional field for the name of the supplier
     * in a multi-supplier catalog.
     */
    public void setMultiSupplierName(String multiSupplierName) {
        this.multiSupplierName = multiSupplierName;
    }

    /**
     * Name of the product.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * NeedsGoodsReceipt is a flag that indicates whether this product requires a
     * goods receipt process.
     */
    public Boolean getNeedsGoodsReceipt() {
        return this.needsGoodsReceipt;
    }

    /**
     * NeedsGoodsReceipt is a flag that indicates whether this product requires a
     * goods receipt process.
     */
    public void setNeedsGoodsReceipt(Boolean needsGoodsReceipt) {
        this.needsGoodsReceipt = needsGoodsReceipt;
    }

    /**
     * NFBasePrice represents a part for calculating metal surcharges.
     */
    public Double getNfBasePrice() {
        return this.nfBasePrice;
    }

    /**
     * NFBasePrice represents a part for calculating metal surcharges.
     */
    public void setNfBasePrice(Double nfBasePrice) {
        this.nfBasePrice = nfBasePrice;
    }

    /**
     * NFBasePriceQuantity represents a part for calculating metal surcharges.
     */
    public Double getNfBasePriceQuantity() {
        return this.nfBasePriceQuantity;
    }

    /**
     * NFBasePriceQuantity represents a part for calculating metal surcharges.
     */
    public void setNfBasePriceQuantity(Double nfBasePriceQuantity) {
        this.nfBasePriceQuantity = nfBasePriceQuantity;
    }

    /**
     * NFCndID represents the key to calculate metal surcharges.
     */
    public String getNfCndId() {
        return this.nfCndId;
    }

    /**
     * NFCndID represents the key to calculate metal surcharges.
     */
    public void setNfCndId(String nfCndId) {
        this.nfCndId = nfCndId;
    }

    /**
     * NFScale represents a part for calculating metal surcharges.
     */
    public Double getNfScale() {
        return this.nfScale;
    }

    /**
     * NFScale represents a part for calculating metal surcharges.
     */
    public void setNfScale(Double nfScale) {
        this.nfScale = nfScale;
    }

    /**
     * NFScaleQuantity represents a part for calculating metal surcharges.
     */
    public Double getNfScaleQuantity() {
        return this.nfScaleQuantity;
    }

    /**
     * NFScaleQuantity represents a part for calculating metal surcharges.
     */
    public void setNfScaleQuantity(Double nfScaleQuantity) {
        this.nfScaleQuantity = nfScaleQuantity;
    }

    /**
     * Orderable is a flag that indicates whether this product will be orderable to
     * the end-user when shopping.
     */
    public Boolean getOrderable() {
        return this.orderable;
    }

    /**
     * Orderable is a flag that indicates whether this product will be orderable to
     * the end-user when shopping.
     */
    public void setOrderable(Boolean orderable) {
        this.orderable = orderable;
    }

    /**
     * OrderUnit is the order unit of the product, a 3-character ISO code (usually
     * project-specific).
     */
    public String getOrderUnit() {
        return this.orderUnit;
    }

    /**
     * OrderUnit is the order unit of the product, a 3-character ISO code (usually
     * project-specific).
     */
    public void setOrderUnit(String orderUnit) {
        this.orderUnit = orderUnit;
    }

    /**
     * Price is the net price (per order unit) of the product for the end-user.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Price is the net price (per order unit) of the product for the end-user.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * PriceFormula represents the formula to calculate the price of the product.
     */
    public String getPriceFormula() {
        return this.priceFormula;
    }

    /**
     * PriceFormula represents the formula to calculate the price of the product.
     */
    public void setPriceFormula(String priceFormula) {
        this.priceFormula = priceFormula;
    }

    /**
     * PriceQty is the quantity for which the price is specified (default: 1.0).
     */
    public double getPriceQty() {
        return this.priceQty;
    }

    /**
     * PriceQty is the quantity for which the price is specified (default: 1.0).
     */
    public void setPriceQty(double priceQty) {
        this.priceQty = priceQty;
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
     * QuantityInterval is the interval in which this product can be ordered. E.g.
     * if the quantity interval is 5, the end-user can only order in quantities of
     * 5,10,15 etc.
     */
    public Double getQuantityInterval() {
        return this.quantityInterval;
    }

    /**
     * QuantityInterval is the interval in which this product can be ordered. E.g.
     * if the quantity interval is 5, the end-user can only order in quantities of
     * 5,10,15 etc.
     */
    public void setQuantityInterval(Double quantityInterval) {
        this.quantityInterval = quantityInterval;
    }

    /**
     * QuantityMax is the maximum order quantity for this product.
     */
    public Double getQuantityMax() {
        return this.quantityMax;
    }

    /**
     * QuantityMax is the maximum order quantity for this product.
     */
    public void setQuantityMax(Double quantityMax) {
        this.quantityMax = quantityMax;
    }

    /**
     * QuantityMin is the minimum order quantity for this product.
     */
    public Double getQuantityMin() {
        return this.quantityMin;
    }

    /**
     * QuantityMin is the minimum order quantity for this product.
     */
    public void setQuantityMin(Double quantityMin) {
        this.quantityMin = quantityMin;
    }

    /**
     * Rateable is a flag that indicates whether the product can be rated by
     * end-users.
     */
    public Boolean getRateable() {
        return this.rateable;
    }

    /**
     * Rateable is a flag that indicates whether the product can be rated by
     * end-users.
     */
    public void setRateable(Boolean rateable) {
        this.rateable = rateable;
    }

    /**
     * RateableOnlyIfOrdered is a flag that indicates whether the product can be
     * rated only after being ordered.
     */
    public Boolean getRateableOnlyIfOrdered() {
        return this.rateableOnlyIfOrdered;
    }

    /**
     * RateableOnlyIfOrdered is a flag that indicates whether the product can be
     * rated only after being ordered.
     */
    public void setRateableOnlyIfOrdered(Boolean rateableOnlyIfOrdered) {
        this.rateableOnlyIfOrdered = rateableOnlyIfOrdered;
    }

    /**
     * References defines cross-product references, e.g. alternatives or follow-up
     * products.
     */
    public Reference[] getReferences() {
        return this.references;
    }

    /**
     * References defines cross-product references, e.g. alternatives or follow-up
     * products.
     */
    public void setReferences(Reference[] references) {
        this.references = references;
    }

    /**
     * Safetysheet is the name of an safetysheet file (in the media files) or a URL
     * to the safetysheet on the internet.
     */
    public String getSafetysheet() {
        return this.safetysheet;
    }

    /**
     * Safetysheet is the name of an safetysheet file (in the media files) or a URL
     * to the safetysheet on the internet.
     */
    public void setSafetysheet(String safetysheet) {
        this.safetysheet = safetysheet;
    }

    /**
     * SafetysheetURL is the URL to the safety data sheet (if available).
     */
    public String getSafetysheetURL() {
        return this.safetysheetURL;
    }

    /**
     * SafetysheetURL is the URL to the safety data sheet (if available).
     */
    public void setSafetysheetURL(String safetysheetURL) {
        this.safetysheetURL = safetysheetURL;
    }

    /**
     * ScalePrices can be used when the price of the product is dependent on the
     * ordered quantity.
     */
    public ScalePrice[] getScalePrices() {
        return this.scalePrices;
    }

    /**
     * ScalePrices can be used when the price of the product is dependent on the
     * ordered quantity.
     */
    public void setScalePrices(ScalePrice[] scalePrices) {
        this.scalePrices = scalePrices;
    }

    /**
     * URL to this page.
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * URL to this page.
     */
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * Service indicates if the is a good (false) or a service (true). The default
     * value is false.
     */
    public boolean isService() {
        return this.service;
    }

    /**
     * Service indicates if the is a good (false) or a service (true). The default
     * value is false.
     */
    public void setService(boolean service) {
        this.service = service;
    }

    /**
     * SPN is the supplier part number.
     */
    public String getSpn() {
        return this.spn;
    }

    /**
     * SPN is the supplier part number.
     */
    public void setSpn(String spn) {
        this.spn = spn;
    }

    /**
     * TaxCode to use for this product.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * TaxCode to use for this product.
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    /**
     * TaxRate for this product, a numeric value between 0.0 and 1.0.
     */
    public double getTaxRate() {
        return this.taxRate;
    }

    /**
     * TaxRate for this product, a numeric value between 0.0 and 1.0.
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * Thumbnail is the name of an thumbnail image file (in the media files) or a
     * URL to the image on the internet.
     */
    public String getThumbnail() {
        return this.thumbnail;
    }

    /**
     * Thumbnail is the name of an thumbnail image file (in the media files) or a
     * URL to the image on the internet.
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * ThubmnailURL is the URL to the thumbnail image.
     */
    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    /**
     * ThubmnailURL is the URL to the thumbnail image.
     */
    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }

    /**
     * Unspscs is a list of UNSPSC categories the product belongs to.
     */
    public Unspsc[] getUnspscs() {
        return this.unspscs;
    }

    /**
     * Unspscs is a list of UNSPSC categories the product belongs to.
     */
    public void setUnspscs(Unspsc[] unspscs) {
        this.unspscs = unspscs;
    }

    /**
     * Updated is the last modification date and time of the product.
     */
    public Date getUpdated() {
        return this.updated;
    }

    /**
     * Updated is the last modification date and time of the product.
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * Visible is a flag that indicates whether this product will be visible to the
     * end-user when shopping.
     */
    public Boolean getVisible() {
        return this.visible;
    }

    /**
     * Visible is a flag that indicates whether this product will be visible to the
     * end-user when shopping.
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
