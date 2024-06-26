// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.models.PredictionModelLifeCycle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** The prediction model status. */
@Fluent
public final class PredictionModelStatusInner {
    /*
     * The hub name.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The prediction name.
     */
    @JsonProperty(value = "predictionName", access = JsonProperty.Access.WRITE_ONLY)
    private String predictionName;

    /*
     * The prediction GUID ID.
     */
    @JsonProperty(value = "predictionGuidId", access = JsonProperty.Access.WRITE_ONLY)
    private String predictionGuidId;

    /*
     * Prediction model life cycle.  When prediction is in PendingModelConfirmation status, it is allowed to update the
     * status to PendingFeaturing or Active through API.
     */
    @JsonProperty(value = "status", required = true)
    private PredictionModelLifeCycle status;

    /*
     * The model status message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Count of the training set.
     */
    @JsonProperty(value = "trainingSetCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer trainingSetCount;

    /*
     * Count of the test set.
     */
    @JsonProperty(value = "testSetCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer testSetCount;

    /*
     * Count of the validation set.
     */
    @JsonProperty(value = "validationSetCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer validationSetCount;

    /*
     * The training accuracy.
     */
    @JsonProperty(value = "trainingAccuracy", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal trainingAccuracy;

    /*
     * The signals used.
     */
    @JsonProperty(value = "signalsUsed", access = JsonProperty.Access.WRITE_ONLY)
    private Integer signalsUsed;

    /*
     * Version of the model.
     */
    @JsonProperty(value = "modelVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String modelVersion;

    /** Creates an instance of PredictionModelStatusInner class. */
    public PredictionModelStatusInner() {
    }

    /**
     * Get the tenantId property: The hub name.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the predictionName property: The prediction name.
     *
     * @return the predictionName value.
     */
    public String predictionName() {
        return this.predictionName;
    }

    /**
     * Get the predictionGuidId property: The prediction GUID ID.
     *
     * @return the predictionGuidId value.
     */
    public String predictionGuidId() {
        return this.predictionGuidId;
    }

    /**
     * Get the status property: Prediction model life cycle. When prediction is in PendingModelConfirmation status, it
     * is allowed to update the status to PendingFeaturing or Active through API.
     *
     * @return the status value.
     */
    public PredictionModelLifeCycle status() {
        return this.status;
    }

    /**
     * Set the status property: Prediction model life cycle. When prediction is in PendingModelConfirmation status, it
     * is allowed to update the status to PendingFeaturing or Active through API.
     *
     * @param status the status value to set.
     * @return the PredictionModelStatusInner object itself.
     */
    public PredictionModelStatusInner withStatus(PredictionModelLifeCycle status) {
        this.status = status;
        return this;
    }

    /**
     * Get the message property: The model status message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the trainingSetCount property: Count of the training set.
     *
     * @return the trainingSetCount value.
     */
    public Integer trainingSetCount() {
        return this.trainingSetCount;
    }

    /**
     * Get the testSetCount property: Count of the test set.
     *
     * @return the testSetCount value.
     */
    public Integer testSetCount() {
        return this.testSetCount;
    }

    /**
     * Get the validationSetCount property: Count of the validation set.
     *
     * @return the validationSetCount value.
     */
    public Integer validationSetCount() {
        return this.validationSetCount;
    }

    /**
     * Get the trainingAccuracy property: The training accuracy.
     *
     * @return the trainingAccuracy value.
     */
    public BigDecimal trainingAccuracy() {
        return this.trainingAccuracy;
    }

    /**
     * Get the signalsUsed property: The signals used.
     *
     * @return the signalsUsed value.
     */
    public Integer signalsUsed() {
        return this.signalsUsed;
    }

    /**
     * Get the modelVersion property: Version of the model.
     *
     * @return the modelVersion value.
     */
    public String modelVersion() {
        return this.modelVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property status in model PredictionModelStatusInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PredictionModelStatusInner.class);
}
