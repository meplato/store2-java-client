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

import com.google.gson.annotations.SerializedName;

/**
 * Blob describes external product data, e.g. an image or a datasheet.
 */
public class Blob {
    @SerializedName("kind")
    private String kind;
    @SerializedName("lang")
    private String language;
    @SerializedName("source")
    private String source;
    @SerializedName("text")
    private String text;
    @SerializedName("url")
    private String url;

    /**
     * Create new instance of Blob.
     */
    public Blob() {
    }

    /**
     * Kind describes the type of blob, e.g. image, detail, thumbnail, datasheet, or
     * safetysheet.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind describes the type of blob, e.g. image, detail, thumbnail, datasheet, or
     * safetysheet.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Language indicates the language of the blob, e.g. the language of a
     * datasheet.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Language indicates the language of the blob, e.g. the language of a
     * datasheet.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Source is either a (relative) file name or a URL.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Source is either a (relative) file name or a URL.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Text gives a textual description the blob.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Text gives a textual description the blob.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * URL is the URL to the blob.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * URL is the URL to the blob.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}

