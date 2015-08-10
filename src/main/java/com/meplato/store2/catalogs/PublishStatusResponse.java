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
package com.meplato.store2.catalogs;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * PublishStatusResponse returns current information about the status of a
 * publish request.
 */
public class PublishStatusResponse {
	@SerializedName("currentStep")
	private int currentStep;
	@SerializedName("kind")
	private String kind;
	@SerializedName("selfLink")
	private String selfLink;
	@SerializedName("status")
	private String status;
	@SerializedName("totalSteps")
	private int totalSteps;

	/**
	 * Create new instance of PublishStatusResponse.
	 */
	public PublishStatusResponse() {
	}

	/**
	 * CurrentStep is an indicator of the current step in the total list of steps.
	 * Use in combination with TotalSteps to retrieve the progress in percent.
	 */
	public int getCurrentStep() {
		return this.currentStep;
	}

	/**
	 * CurrentStep is an indicator of the current step in the total list of steps.
	 * Use in combination with TotalSteps to retrieve the progress in percent.
	 */
	public void setCurrentStep(int currentStep) {
		this.currentStep = currentStep;
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
	public int getTotalSteps() {
		return this.totalSteps;
	}

	/**
	 * TotalSteps is an indicator of the total number steps required to complete the
	 * publish request. Use in combination with CurrentStep.
	 */
	public void setTotalSteps(int totalSteps) {
		this.totalSteps = totalSteps;
	}
}

