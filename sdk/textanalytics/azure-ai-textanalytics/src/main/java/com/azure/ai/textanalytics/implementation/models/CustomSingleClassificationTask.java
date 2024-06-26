// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomSingleClassificationTask model. */
@Fluent
public final class CustomSingleClassificationTask {
    /*
     * The parameters property.
     */
    @JsonProperty(value = "parameters")
    private CustomSingleLabelClassificationTaskParameters parameters;

    /*
     * The taskName property.
     */
    @JsonProperty(value = "taskName")
    private String taskName;

    /**
     * Get the parameters property: The parameters property.
     *
     * @return the parameters value.
     */
    public CustomSingleLabelClassificationTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     *
     * @param parameters the parameters value to set.
     * @return the CustomSingleClassificationTask object itself.
     */
    public CustomSingleClassificationTask setParameters(CustomSingleLabelClassificationTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the taskName property: The taskName property.
     *
     * @return the taskName value.
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * Set the taskName property: The taskName property.
     *
     * @param taskName the taskName value to set.
     * @return the CustomSingleClassificationTask object itself.
     */
    public CustomSingleClassificationTask setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
}
