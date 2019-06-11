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

/**
 * SearchResponse is a partial listing of jobs.
 */
public class SearchResponse {
    @SerializedName("items")
    private Job[] items;
    @SerializedName("kind")
    private String kind;
    @SerializedName("nextLink")
    private String nextLink;
    @SerializedName("previousLink")
    private String previousLink;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("totalItems")
    private long totalItems;

    /**
     * Create new instance of SearchResponse.
     */
    public SearchResponse() {
    }

    /**
     * Items is the slice of jobs of this result.
     */
    public Job[] getItems() {
        return this.items;
    }

    /**
     * Items is the slice of jobs of this result.
     */
    public void setItems(Job[] items) {
        this.items = items;
    }

    /**
     * Kind is store#jobs for this kind of response.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#jobs for this kind of response.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * NextLink returns the URL to the next slice of jobs (if any).
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * NextLink returns the URL to the next slice of jobs (if any).
     */
    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }

    /**
     * PreviousLink returns the URL of the previous slice of jobs (if any).
     */
    public String getPreviousLink() {
        return this.previousLink;
    }

    /**
     * PreviousLink returns the URL of the previous slice of jobs (if any).
     */
    public void setPreviousLink(String previousLink) {
        this.previousLink = previousLink;
    }

    /**
     * SelfLink returns the URL to this page.
     */
    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * SelfLink returns the URL to this page.
     */
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    /**
     * TotalItems describes the total number of jobs found.
     */
    public long getTotalItems() {
        return this.totalItems;
    }

    /**
     * TotalItems describes the total number of jobs found.
     */
    public void setTotalItems(long totalItems) {
        this.totalItems = totalItems;
    }
}

