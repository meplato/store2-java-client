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

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Catalog is a container for products, to be used in a certain project.
 */
public class Catalog {
    @SerializedName("country")
    private String country;
    @SerializedName("created")
    private Date created;
    @SerializedName("currency")
    private String currency;
    @SerializedName("custFields")
    private CustField[] custFields;
    @SerializedName("description")
    private String description;
    @SerializedName("downloadChecksum")
    private String downloadChecksum;
    @SerializedName("downloadInterval")
    private String downloadInterval;
    @SerializedName("downloadUrl")
    private String downloadUrl;
    @SerializedName("erpNumberBuyer")
    private String erpNumberBuyer;
    @SerializedName("expired")
    private boolean expired;
    @SerializedName("hubUrl")
    private String hubUrl;
    @SerializedName("id")
    private long id;
    @SerializedName("keepOriginalBlobs")
    private boolean keepOriginalBlobs;
    @SerializedName("kind")
    private String kind;
    @SerializedName("kpiSummary")
    private KPISummary kpiSummary;
    @SerializedName("language")
    private String language;
    @SerializedName("lastImported")
    private Date lastImported;
    @SerializedName("lastPublished")
    private Date lastPublished;
    @SerializedName("lockedForDownload")
    private boolean lockedForDownload;
    @SerializedName("merchantId")
    private long merchantId;
    @SerializedName("merchantMpcc")
    private String merchantMpcc;
    @SerializedName("merchantMpsc")
    private String merchantMpsc;
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
    @SerializedName("project")
    private Project project;
    @SerializedName("projectId")
    private long projectId;
    @SerializedName("projectMpbc")
    private String projectMpbc;
    @SerializedName("projectMpcc")
    private String projectMpcc;
    @SerializedName("projectName")
    private String projectName;
    @SerializedName("publishedVersion")
    private Long publishedVersion;
    @SerializedName("sageContract")
    private String sageContract;
    @SerializedName("sageNumber")
    private String sageNumber;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("state")
    private String state;
    @SerializedName("supportsOciBackgroundsearch")
    private boolean supportsOciBackgroundsearch;
    @SerializedName("supportsOciDetail")
    private boolean supportsOciDetail;
    @SerializedName("supportsOciDetailadd")
    private boolean supportsOciDetailadd;
    @SerializedName("supportsOciDownloadjson")
    private boolean supportsOciDownloadjson;
    @SerializedName("supportsOciQuantitycheck")
    private boolean supportsOciQuantitycheck;
    @SerializedName("supportsOciSourcing")
    private boolean supportsOciSourcing;
    @SerializedName("supportsOciValidate")
    private boolean supportsOciValidate;
    @SerializedName("target")
    private String target;
    @SerializedName("type")
    private String type;
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
     * DownloadChecksum represents the checksum of the catalog last downloaded.
     */
    public String getDownloadChecksum() {
        return this.downloadChecksum;
    }

    /**
     * DownloadChecksum represents the checksum of the catalog last downloaded.
     */
    public void setDownloadChecksum(String downloadChecksum) {
        this.downloadChecksum = downloadChecksum;
    }

    /**
     * DownloadInterval represents the interval to use for checking new versions of
     * a catalog at the DownloadURL.
     */
    public String getDownloadInterval() {
        return this.downloadInterval;
    }

    /**
     * DownloadInterval represents the interval to use for checking new versions of
     * a catalog at the DownloadURL.
     */
    public void setDownloadInterval(String downloadInterval) {
        this.downloadInterval = downloadInterval;
    }

    /**
     * DownloadURL represents a URL which is periodically downloaded and imported as
     * a new catalog.
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * DownloadURL represents a URL which is periodically downloaded and imported as
     * a new catalog.
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
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
     * Expired indicates whether the catalog is expired as of now.
     */
    public boolean isExpired() {
        return this.expired;
    }

    /**
     * Expired indicates whether the catalog is expired as of now.
     */
    public void setExpired(boolean expired) {
        this.expired = expired;
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
     * KeepOriginalBlobs indicates whether the URLs in a blob will be passed through
     * and not cached by Store.
     */
    public boolean isKeepOriginalBlobs() {
        return this.keepOriginalBlobs;
    }

    /**
     * KeepOriginalBlobs indicates whether the URLs in a blob will be passed through
     * and not cached by Store.
     */
    public void setKeepOriginalBlobs(boolean keepOriginalBlobs) {
        this.keepOriginalBlobs = keepOriginalBlobs;
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
     * KPISummary returns the outcome of analyzing the contents for key performance
     * indicators.
     */
    public KPISummary getKpiSummary() {
        return this.kpiSummary;
    }

    /**
     * KPISummary returns the outcome of analyzing the contents for key performance
     * indicators.
     */
    public void setKpiSummary(KPISummary kpiSummary) {
        this.kpiSummary = kpiSummary;
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
     * LockedForDownload indicates whether a catalog is locked and cannot be
     * downloaded.
     */
    public boolean isLockedForDownload() {
        return this.lockedForDownload;
    }

    /**
     * LockedForDownload indicates whether a catalog is locked and cannot be
     * downloaded.
     */
    public void setLockedForDownload(boolean lockedForDownload) {
        this.lockedForDownload = lockedForDownload;
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
     * MPCC of the merchant.
     */
    public String getMerchantMpcc() {
        return this.merchantMpcc;
    }

    /**
     * MPCC of the merchant.
     */
    public void setMerchantMpcc(String merchantMpcc) {
        this.merchantMpcc = merchantMpcc;
    }

    /**
     * MPSC of the merchant.
     */
    public String getMerchantMpsc() {
        return this.merchantMpsc;
    }

    /**
     * MPSC of the merchant.
     */
    public void setMerchantMpsc(String merchantMpsc) {
        this.merchantMpsc = merchantMpsc;
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
     * Project references the project that this catalog belongs to.
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * Project references the project that this catalog belongs to.
     */
    public void setProject(Project project) {
        this.project = project;
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
     * MPBC of the project.
     */
    public String getProjectMpbc() {
        return this.projectMpbc;
    }

    /**
     * MPBC of the project.
     */
    public void setProjectMpbc(String projectMpbc) {
        this.projectMpbc = projectMpbc;
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
     * Name of the project.
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Name of the project.
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
     * SupportsOciBackgroundsearch indicates whether a catalog supports the OCI
     * BACKGROUNDSEARCH transaction.
     */
    public boolean isSupportsOciBackgroundsearch() {
        return this.supportsOciBackgroundsearch;
    }

    /**
     * SupportsOciBackgroundsearch indicates whether a catalog supports the OCI
     * BACKGROUNDSEARCH transaction.
     */
    public void setSupportsOciBackgroundsearch(boolean supportsOciBackgroundsearch) {
        this.supportsOciBackgroundsearch = supportsOciBackgroundsearch;
    }

    /**
     * SupportsOciDetail indicates whether a catalog supports the OCI DETAIL
     * transaction.
     */
    public boolean isSupportsOciDetail() {
        return this.supportsOciDetail;
    }

    /**
     * SupportsOciDetail indicates whether a catalog supports the OCI DETAIL
     * transaction.
     */
    public void setSupportsOciDetail(boolean supportsOciDetail) {
        this.supportsOciDetail = supportsOciDetail;
    }

    /**
     * SupportsOciDetailadd indicates whether a catalog supports the OCI DETAILADD
     * transaction.
     */
    public boolean isSupportsOciDetailadd() {
        return this.supportsOciDetailadd;
    }

    /**
     * SupportsOciDetailadd indicates whether a catalog supports the OCI DETAILADD
     * transaction.
     */
    public void setSupportsOciDetailadd(boolean supportsOciDetailadd) {
        this.supportsOciDetailadd = supportsOciDetailadd;
    }

    /**
     * SupportsOciDownloadjson indicates whether a catalog supports the OCI
     * DOWNLOADJSON transaction.
     */
    public boolean isSupportsOciDownloadjson() {
        return this.supportsOciDownloadjson;
    }

    /**
     * SupportsOciDownloadjson indicates whether a catalog supports the OCI
     * DOWNLOADJSON transaction.
     */
    public void setSupportsOciDownloadjson(boolean supportsOciDownloadjson) {
        this.supportsOciDownloadjson = supportsOciDownloadjson;
    }

    /**
     * SupportsOciQuantitycheck indicates whether a catalog supports the OCI
     * QUANTITYCHECK transaction.
     */
    public boolean isSupportsOciQuantitycheck() {
        return this.supportsOciQuantitycheck;
    }

    /**
     * SupportsOciQuantitycheck indicates whether a catalog supports the OCI
     * QUANTITYCHECK transaction.
     */
    public void setSupportsOciQuantitycheck(boolean supportsOciQuantitycheck) {
        this.supportsOciQuantitycheck = supportsOciQuantitycheck;
    }

    /**
     * SupportsOciSourcing indicates whether a catalog supports the OCI SOURCING
     * transaction.
     */
    public boolean isSupportsOciSourcing() {
        return this.supportsOciSourcing;
    }

    /**
     * SupportsOciSourcing indicates whether a catalog supports the OCI SOURCING
     * transaction.
     */
    public void setSupportsOciSourcing(boolean supportsOciSourcing) {
        this.supportsOciSourcing = supportsOciSourcing;
    }

    /**
     * SupportsOciValidate indicates whether a catalog supports the OCI VALIDATE
     * transaction.
     */
    public boolean isSupportsOciValidate() {
        return this.supportsOciValidate;
    }

    /**
     * SupportsOciValidate indicates whether a catalog supports the OCI VALIDATE
     * transaction.
     */
    public void setSupportsOciValidate(boolean supportsOciValidate) {
        this.supportsOciValidate = supportsOciValidate;
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
