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

import com.google.gson.annotations.SerializedName;

/**
 * PublishResponse is the response of the request to publish a catalog.
 */
public class PublishResponse {
    @SerializedName("kind")
    private String kind;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("statusLink")
    private String statusLink;

    /**
     * Create new instance of PublishResponse.
     */
    public PublishResponse() {
    }

    /**
     * Kind is store#catalogPublish for this kind of response.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#catalogPublish for this kind of response.
     */
    public void setKind(String kind) {
        this.kind = kind;
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
     * StatusLink returns the URL that returns the current status of the request.
     */
    public String getStatusLink() {
        return this.statusLink;
    }

    /**
     * StatusLink returns the URL that returns the current status of the request.
     */
    public void setStatusLink(String statusLink) {
        this.statusLink = statusLink;
    }
}

