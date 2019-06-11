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
package com.meplato.store2.jobs;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Job that processes a task in the background, e.g. publishing a catalog.
 */
public class Job {
    @SerializedName("catalogId")
    private long catalogId;
    @SerializedName("catalogName")
    private String catalogName;
    @SerializedName("completed")
    private Date completed;
    @SerializedName("created")
    private Date created;
    @SerializedName("email")
    private String email;
    @SerializedName("id")
    private String id;
    @SerializedName("kind")
    private String kind;
    @SerializedName("merchantId")
    private long merchantId;
    @SerializedName("merchantMpcc")
    private String merchantMpcc;
    @SerializedName("merchantName")
    private String merchantName;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("started")
    private Date started;
    @SerializedName("state")
    private String state;
    @SerializedName("topic")
    private String topic;

    /**
     * Create new instance of Job.
     */
    public Job() {
    }

    /**
     * ID of the catalog.
     */
    public long getCatalogId() {
        return this.catalogId;
    }

    /**
     * ID of the catalog.
     */
    public void setCatalogId(long catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * Name of the catalog.
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * Name of the catalog.
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * Completed is the date and time when the job has been completed, either
     * successfully or failed.
     */
    public Date getCompleted() {
        return this.completed;
    }

    /**
     * Completed is the date and time when the job has been completed, either
     * successfully or failed.
     */
    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    /**
     * Created is the creation date and time of the job.
     */
    public Date getCreated() {
        return this.created;
    }

    /**
     * Created is the creation date and time of the job.
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Email of the user that initiated the job.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Email of the user that initiated the job.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ID is a unique (internal) identifier of the job.
     */
    public String getId() {
        return this.id;
    }

    /**
     * ID is a unique (internal) identifier of the job.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Kind is store#job for a job entity.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#job for a job entity.
     */
    public void setKind(String kind) {
        this.kind = kind;
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
     * Started is the date and time when the job has been started.
     */
    public Date getStarted() {
        return this.started;
    }

    /**
     * Started is the date and time when the job has been started.
     */
    public void setStarted(Date started) {
        this.started = started;
    }

    /**
     * State describes the current state of the job, i.e. one of
     * waiting,working,succeeded, or failed.
     */
    public String getState() {
        return this.state;
    }

    /**
     * State describes the current state of the job, i.e. one of
     * waiting,working,succeeded, or failed.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Topic of the job, e.g. if it was an import or a validation task.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Topic of the job, e.g. if it was an import or a validation task.
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
}

