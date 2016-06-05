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
package com.meplato.store2.catalogs;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * Catalog is a container for products, to be used in a certain project.
 */
public class Catalog {
	@SerializedName("created")
	private Date created;
	@SerializedName("currency")
	private String currency;
	@SerializedName("description")
	private String description;
	@SerializedName("erpNumberBuyer")
	private String erpNumberBuyer;
	@SerializedName("hubUrl")
	private String hubUrl;
	@SerializedName("id")
	private long id;
	@SerializedName("kind")
	private String kind;
	@SerializedName("language")
	private String language;
	@SerializedName("lastImported")
	private Date lastImported;
	@SerializedName("lastPublished")
	private Date lastPublished;
	@SerializedName("merchantId")
	private long merchantId;
	@SerializedName("merchantName")
	private String merchantName;
	@SerializedName("name")
	private String name;
	@SerializedName("numProductsLive")
	private Long numProductsLive;
	@SerializedName("numProductsWork")
	private Long numProductsWork;
	@SerializedName("ociUrl")
	private String ociUrl;
	@SerializedName("pin")
	private String pin;
	@SerializedName("projectId")
	private long projectId;
	@SerializedName("publishedVersion")
	private Long publishedVersion;
	@SerializedName("selfLink")
	private String selfLink;
	@SerializedName("slug")
	private String slug;
	@SerializedName("state")
	private String state;
	@SerializedName("updated")
	private Date updated;
	@SerializedName("validFrom")
	private String validFrom;
	@SerializedName("validUntil")
	private String validUntil;

	/**
	 * Create new instance of Catalog.
	 */
	public Catalog() {
	}

	/**
	 * Created is the creation date and time of the catalog.
	 */
	public Date getCreated() {
		return this.created;
	}

	/**
	 * Created is the creation date and time of the catalog.
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * Currency is the ISO-4217 currency code that is used for all products in the
	 * catalog.
	 */
	public String getCurrency() {
		return this.currency;
	}

	/**
	 * Currency is the ISO-4217 currency code that is used for all products in the
	 * catalog.
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
	 * ERPNumberBuyer is the number of the merchant of this catalog in the SAP/ERP
	 * system of the buyer.
	 */
	public String getErpNumberBuyer() {
		return this.erpNumberBuyer;
	}

	/**
	 * ERPNumberBuyer is the number of the merchant of this catalog in the SAP/ERP
	 * system of the buyer.
	 */
	public void setErpNumberBuyer(String erpNumberBuyer) {
		this.erpNumberBuyer = erpNumberBuyer;
	}

	/**
	 * HubURL represents the Meplato Hub URL for this catalog, e.g.
	 * https://hub.meplato.de/forward/12345/shop
	 */
	public String getHubUrl() {
		return this.hubUrl;
	}

	/**
	 * HubURL represents the Meplato Hub URL for this catalog, e.g.
	 * https://hub.meplato.de/forward/12345/shop
	 */
	public void setHubUrl(String hubUrl) {
		this.hubUrl = hubUrl;
	}

	/**
	 * ID is a unique (internal) identifier of the catalog.
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * ID is a unique (internal) identifier of the catalog.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Kind is store#catalog for a catalog entity.
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * Kind is store#catalog for a catalog entity.
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * Language is the IETF language tag of the language of all products in the
	 * catalog.
	 */
	public String getLanguage() {
		return this.language;
	}

	/**
	 * Language is the IETF language tag of the language of all products in the
	 * catalog.
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * LastImported is the date and time the catalog was last imported.
	 */
	public Date getLastImported() {
		return this.lastImported;
	}

	/**
	 * LastImported is the date and time the catalog was last imported.
	 */
	public void setLastImported(Date lastImported) {
		this.lastImported = lastImported;
	}

	/**
	 * LastPublished is the date and time the catalog was last published.
	 */
	public Date getLastPublished() {
		return this.lastPublished;
	}

	/**
	 * LastPublished is the date and time the catalog was last published.
	 */
	public void setLastPublished(Date lastPublished) {
		this.lastPublished = lastPublished;
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
	 * Name of the merchant.
	 */
	public String getMerchantName() {
		return this.merchantName;
	}

	/**
	 * Name of the merchant.
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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
	 * Number of products currently in the live area (only returned when getting the
	 * details of a catalog).
	 */
	public Long getNumProductsLive() {
		return this.numProductsLive;
	}

	/**
	 * Number of products currently in the live area (only returned when getting the
	 * details of a catalog).
	 */
	public void setNumProductsLive(Long numProductsLive) {
		this.numProductsLive = numProductsLive;
	}

	/**
	 * Number of products currently in the work area (only returned when getting the
	 * details of a catalog).
	 */
	public Long getNumProductsWork() {
		return this.numProductsWork;
	}

	/**
	 * Number of products currently in the work area (only returned when getting the
	 * details of a catalog).
	 */
	public void setNumProductsWork(Long numProductsWork) {
		this.numProductsWork = numProductsWork;
	}

	/**
	 * OciURL represents the OCI punchout URL that the supplier specified for this
	 * catalog, e.g. https://my-shop.com/oci?param1=a
	 */
	public String getOciUrl() {
		return this.ociUrl;
	}

	/**
	 * OciURL represents the OCI punchout URL that the supplier specified for this
	 * catalog, e.g. https://my-shop.com/oci?param1=a
	 */
	public void setOciUrl(String ociUrl) {
		this.ociUrl = ociUrl;
	}

	/**
	 * PIN of the catalog.
	 */
	public String getPin() {
		return this.pin;
	}

	/**
	 * PIN of the catalog.
	 */
	public void setPin(String pin) {
		this.pin = pin;
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
	 * PublishedVersion is the version number of the published catalog. It is
	 * incremented when the publish task publishes the catalog.
	 */
	public Long getPublishedVersion() {
		return this.publishedVersion;
	}

	/**
	 * PublishedVersion is the version number of the published catalog. It is
	 * incremented when the publish task publishes the catalog.
	 */
	public void setPublishedVersion(Long publishedVersion) {
		this.publishedVersion = publishedVersion;
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
	 * Slug of the catalog.
	 */
	public String getSlug() {
		return this.slug;
	}

	/**
	 * Slug of the catalog.
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * State describes the current state of the catalog, e.g. idle.
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * State describes the current state of the catalog, e.g. idle.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Updated is the last modification date and time of the catalog.
	 */
	public Date getUpdated() {
		return this.updated;
	}

	/**
	 * Updated is the last modification date and time of the catalog.
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	/**
	 * ValidFrom is the date the catalog becomes effective.
	 */
	public String getValidFrom() {
		return this.validFrom;
	}

	/**
	 * ValidFrom is the date the catalog becomes effective.
	 */
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * ValidUntil is the date the catalog expires.
	 */
	public String getValidUntil() {
		return this.validUntil;
	}

	/**
	 * ValidUntil is the date the catalog expires.
	 */
	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}
}

