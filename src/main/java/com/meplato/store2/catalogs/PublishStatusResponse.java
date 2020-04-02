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

/**
 * PublishStatusResponse returns current information about the status of a
 * publish request.
 */
public class PublishStatusResponse {
    @SerializedName("busy")
    private boolean busy;
    @SerializedName("canceled")
    private boolean canceled;
    @SerializedName("currentStep")
    private long currentStep;
    @SerializedName("done")
    private boolean done;
    @SerializedName("kind")
    private String kind;
    @SerializedName("percent")
    private int percent;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("status")
    private String status;
    @SerializedName("totalSteps")
    private long totalSteps;

    /**
     * Create new instance of PublishStatusResponse.
     */
    public PublishStatusResponse() {
    }

    /**
     * Busy indicates whether the catalog is still busy.
     */
    public boolean isBusy() {
        return this.busy;
    }

    /**
     * Busy indicates whether the catalog is still busy.
     */
    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    /**
     * Canceled indicates whether the publishing process has been canceled.
     */
    public boolean isCanceled() {
        return this.canceled;
    }

    /**
     * Canceled indicates whether the publishing process has been canceled.
     */
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    /**
     * CurrentStep is an indicator of the current step in the total list of steps.
     * Use in combination with TotalSteps to retrieve the progress in percent.
     */
    public long getCurrentStep() {
        return this.currentStep;
    }

    /**
     * CurrentStep is an indicator of the current step in the total list of steps.
     * Use in combination with TotalSteps to retrieve the progress in percent.
     */
    public void setCurrentStep(long currentStep) {
        this.currentStep = currentStep;
    }

    /**
     * Done indicates whether publishing is finished.
     */
    public boolean isDone() {
        return this.done;
    }

    /**
     * Done indicates whether publishing is finished.
     */
    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * Kind is store#catalogPublishStatus for this kind of response.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Kind is store#catalogPublishStatus for this kind of response.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Percent indicates the progress of the publish request.
     */
    public int getPercent() {
        return this.percent;
    }

    /**
     * Percent indicates the progress of the publish request.
     */
    public void setPercent(int percent) {
        this.percent = percent;
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
     * Status describes the general status of the publish request.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Status describes the general status of the publish request.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * TotalSteps is an indicator of the total number steps required to complete the
     * publish request. Use in combination with CurrentStep.
     */
    public long getTotalSteps() {
        return this.totalSteps;
    }

    /**
     * TotalSteps is an indicator of the total number steps required to complete the
     * publish request. Use in combination with CurrentStep.
     */
    public void setTotalSteps(long totalSteps) {
        this.totalSteps = totalSteps;
    }
}

