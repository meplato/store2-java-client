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
 * KPISummary represents the outcome of analyzing the contents for key
 * performance indicators.
 */
public class KPISummary {
	@SerializedName("coefficients")
	private Map<String, Double> coefficients;
	@SerializedName("createdAt")
	private Date createdAt;
	@SerializedName("degreesOfFulfillment")
	private Map<String, Integer> degreesOfFulfillment;
	@SerializedName("finalResult")
	private double finalResult;
	@SerializedName("overallResult")
	private int overallResult;
	@SerializedName("testResults")
	private Map<String, Double> testResults;
	@SerializedName("weightedCoefficients")
	private Map<String, Double> weightedCoefficients;

	/**
	 * Create new instance of KPISummary.
	 */
	public KPISummary() {
	}

	/**
	 * Coefficients represents the weight that is used to calculate the weighted
	 * coefficients for a criteria. It relies on the medal stored in
	 * DegreesOfFulfillment.
	 */
	public Map<String, Double> getCoefficients() {
		return this.coefficients;
	}

	/**
	 * Coefficients represents the weight that is used to calculate the weighted
	 * coefficients for a criteria. It relies on the medal stored in
	 * DegreesOfFulfillment.
	 */
	public void setCoefficients(Map<String, Double> coefficients) {
		this.coefficients = coefficients;
	}

	/**
	 * CreatedAt is the date/time when the KPI summary has been created.
	 */
	public Date getCreatedAt() {
		return this.createdAt;
	}

	/**
	 * CreatedAt is the date/time when the KPI summary has been created.
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * DegreesOfFulfillment represents the medal for all KPI criteria: 3 for gold, 2
	 * for silver, 1 for bronze, 0 for no medal.
	 */
	public Map<String, Integer> getDegreesOfFulfillment() {
		return this.degreesOfFulfillment;
	}

	/**
	 * DegreesOfFulfillment represents the medal for all KPI criteria: 3 for gold, 2
	 * for silver, 1 for bronze, 0 for no medal.
	 */
	public void setDegreesOfFulfillment(Map<String, Integer> degreesOfFulfillment) {
		this.degreesOfFulfillment = degreesOfFulfillment;
	}

	/**
	 * FinalResult returns a value between 0.0 and 1.0 that describes the weighted
	 * sum of all content-related test criteria.
	 */
	public double getFinalResult() {
		return this.finalResult;
	}

	/**
	 * FinalResult returns a value between 0.0 and 1.0 that describes the weighted
	 * sum of all content-related test criteria.
	 */
	public void setFinalResult(double finalResult) {
		this.finalResult = finalResult;
	}

	/**
	 * OverallResult returns 3 for a gold medal, 2 for a silver medal, 1 for a
	 * bronze medal, and 0 for no medal.
	 */
	public int getOverallResult() {
		return this.overallResult;
	}

	/**
	 * OverallResult returns 3 for a gold medal, 2 for a silver medal, 1 for a
	 * bronze medal, and 0 for no medal.
	 */
	public void setOverallResult(int overallResult) {
		this.overallResult = overallResult;
	}

	/**
	 * TestResults represents the unweighted outcome for a specific KPI criteria,
	 * i.e. the percentage of products that fulfill the criteria.
	 */
	public Map<String, Double> getTestResults() {
		return this.testResults;
	}

	/**
	 * TestResults represents the unweighted outcome for a specific KPI criteria,
	 * i.e. the percentage of products that fulfill the criteria.
	 */
	public void setTestResults(Map<String, Double> testResults) {
		this.testResults = testResults;
	}

	/**
	 * WeightedCoefficients is a value between 0.0 and 1.0 that represents the
	 * weighted outcome of a KPI criteria, as calculated by the coefficient and the
	 * test result.
	 */
	public Map<String, Double> getWeightedCoefficients() {
		return this.weightedCoefficients;
	}

	/**
	 * WeightedCoefficients is a value between 0.0 and 1.0 that represents the
	 * weighted outcome of a KPI criteria, as calculated by the coefficient and the
	 * test result.
	 */
	public void setWeightedCoefficients(Map<String, Double> weightedCoefficients) {
		this.weightedCoefficients = weightedCoefficients;
	}
}

