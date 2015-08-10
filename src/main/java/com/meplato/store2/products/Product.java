/*
 * Copyright (c) 2015 Meplato GmbH, Switzerland.
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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * Product is a good or service in a catalog.
 */
public class Product {
	@SerializedName("availability")
	private Availability availability;
	@SerializedName("blobs")
	private Blob[] blobs;
	@SerializedName("bpn")
	private String bpn;
	@SerializedName("catalogId")
	private long catalogId;
	@SerializedName("categories")
	private String[] categories;
	@SerializedName("conditions")
	private Condition[] conditions;
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
	@SerializedName("extCategory")
	private String extCategory;
	@SerializedName("extCategoryId")
	private String extCategoryId;
	@SerializedName("extProductId")
	private String extProductId;
	@SerializedName("extSchemaType")
	private String extSchemaType;
	@SerializedName("features")
	private Feature[] features;
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
	@SerializedName("mpn")
	private String mpn;
	@SerializedName("name")
	private String name;
	@SerializedName("ou")
	private String orderUnit;
	@SerializedName("price")
	private double price;
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
	@SerializedName("thumbnail")
	private String thumbnail;
	@SerializedName("thumbnailURL")
	private String thumbnailURL;
	@SerializedName("unspscs")
	private Unspsc[] unspscs;
	@SerializedName("updated")
	private Date updated;

	/**
	 * Create new instance of Product.
	 */
	public Product() {
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
	 * Currency is the ISO currency code for the prices, e.g. EUR or GBP.
	 */
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * Currency is the ISO currency code for the prices, e.g. EUR or GBP.
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
	 * ExtProductID is the EXT_PRODUCT_ID field of the SAP OCI specification.
	 */
	public String getExtProductId() {
		return this.extProductId;
	}

	/**
	 * ExtProductID is the EXT_PRODUCT_ID field of the SAP OCI specification.
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
	 * TaxCode to use for this product. This is typically project-specific.
	 */
	public String getTaxCode() {
		return this.taxCode;
	}

	/**
	 * TaxCode to use for this product. This is typically project-specific.
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
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
}

