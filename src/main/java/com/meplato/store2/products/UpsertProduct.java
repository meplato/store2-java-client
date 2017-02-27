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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * UpsertProduct holds the properties of the product to create or update.
 */
public class UpsertProduct {
	@SerializedName("asin")
	private String asin;
	@SerializedName("availability")
	private Availability availability;
	@SerializedName("blobs")
	private Blob[] blobs;
	@SerializedName("bpn")
	private String bpn;
	@SerializedName("catalogManaged")
	private boolean catalogManaged;
	@SerializedName("categories")
	private String[] categories;
	@SerializedName("conditions")
	private Condition[] conditions;
	@SerializedName("cu")
	private String contentUnit;
	@SerializedName("cuPerOu")
	private Double cuPerOu;
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
	@SerializedName("image")
	private String image;
	@SerializedName("keywords")
	private String[] keywords;
	@SerializedName("leadtime")
	private Double leadtime;
	@SerializedName("listPrice")
	private Double listPrice;
	@SerializedName("manufactcode")
	private String manufactcode;
	@SerializedName("manufacturer")
	private String manufacturer;
	@SerializedName("matgroup")
	private String matgroup;
	@SerializedName("mpn")
	private String mpn;
	@SerializedName("multiSupplierId")
	private String multiSupplierId;
	@SerializedName("multiSupplierName")
	private String multiSupplierName;
	@SerializedName("name")
	private String name;
	@SerializedName("ou")
	private String orderUnit;
	@SerializedName("price")
	private double price;
	@SerializedName("priceQty")
	private Double priceQty;
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
	@SerializedName("scalePrices")
	private ScalePrice[] scalePrices;
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
	@SerializedName("unspscs")
	private Unspsc[] unspscs;

	/**
	 * Create new instance of UpsertProduct.
	 */
	public UpsertProduct() {
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
	public Double getCuPerOu() {
		return this.cuPerOu;
	}

	/**
	 * CuPerOu describes the number of content units per order unit, e.g. the 12 in
	 * '1 case contains 12 bottles'.
	 */
	public void setCuPerOu(Double cuPerOu) {
		this.cuPerOu = cuPerOu;
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
	public Double getListPrice() {
		return this.listPrice;
	}

	/**
	 * ListPrice is the net list price of the product.
	 */
	public void setListPrice(Double listPrice) {
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
	 * Name of the product. The product name is a required field
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Name of the product. The product name is a required field
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * OrderUnit is the order unit of the product, a 3-character ISO code (usually
	 * project-specific). OrderUnit is a required field.
	 */
	public String getOrderUnit() {
		return this.orderUnit;
	}

	/**
	 * OrderUnit is the order unit of the product, a 3-character ISO code (usually
	 * project-specific). OrderUnit is a required field.
	 */
	public void setOrderUnit(String orderUnit) {
		this.orderUnit = orderUnit;
	}

	/**
	 * Price is the net price (per order unit) of the product for the end-user.
	 * Price is a required field.
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Price is the net price (per order unit) of the product for the end-user.
	 * Price is a required field.
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * PriceQty is the quantity for which the price is specified (default: 1.0).
	 */
	public Double getPriceQty() {
		return this.priceQty;
	}

	/**
	 * PriceQty is the quantity for which the price is specified (default: 1.0).
	 */
	public void setPriceQty(Double priceQty) {
		this.priceQty = priceQty;
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
	 * SPN is the supplier part number. SPN is a required field.
	 */
	public String getSpn() {
		return this.spn;
	}

	/**
	 * SPN is the supplier part number. SPN is a required field.
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
}

