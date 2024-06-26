// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.selfhelp.models.ReplacementMaps;
import com.azure.resourcemanager.selfhelp.models.Section;
import com.azure.resourcemanager.selfhelp.models.SolutionProvisioningState;
import com.azure.resourcemanager.selfhelp.models.TriggerCriterion;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Solution result.
 */
@Fluent
public final class SolutionResourceProperties {
    /*
     * Solution request trigger criteria
     */
    @JsonProperty(value = "triggerCriteria")
    private List<TriggerCriterion> triggerCriteria;

    /*
     * Client input parameters to run Solution
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * Solution Id to identify single solution.
     */
    @JsonProperty(value = "solutionId", access = JsonProperty.Access.WRITE_ONLY)
    private String solutionId;

    /*
     * Status of solution provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private SolutionProvisioningState provisioningState;

    /*
     * The title.
     */
    @JsonProperty(value = "title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /*
     * The HTML content that needs to be rendered and shown to customer.
     */
    @JsonProperty(value = "content", access = JsonProperty.Access.WRITE_ONLY)
    private String content;

    /*
     * Solution replacement maps.
     */
    @JsonProperty(value = "replacementMaps", access = JsonProperty.Access.WRITE_ONLY)
    private ReplacementMaps replacementMaps;

    /*
     * List of section object.
     */
    @JsonProperty(value = "sections", access = JsonProperty.Access.WRITE_ONLY)
    private List<Section> sections;

    /**
     * Creates an instance of SolutionResourceProperties class.
     */
    public SolutionResourceProperties() {
    }

    /**
     * Get the triggerCriteria property: Solution request trigger criteria.
     * 
     * @return the triggerCriteria value.
     */
    public List<TriggerCriterion> triggerCriteria() {
        return this.triggerCriteria;
    }

    /**
     * Set the triggerCriteria property: Solution request trigger criteria.
     * 
     * @param triggerCriteria the triggerCriteria value to set.
     * @return the SolutionResourceProperties object itself.
     */
    public SolutionResourceProperties withTriggerCriteria(List<TriggerCriterion> triggerCriteria) {
        this.triggerCriteria = triggerCriteria;
        return this;
    }

    /**
     * Get the parameters property: Client input parameters to run Solution.
     * 
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Client input parameters to run Solution.
     * 
     * @param parameters the parameters value to set.
     * @return the SolutionResourceProperties object itself.
     */
    public SolutionResourceProperties withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the solutionId property: Solution Id to identify single solution.
     * 
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.solutionId;
    }

    /**
     * Get the provisioningState property: Status of solution provisioning.
     * 
     * @return the provisioningState value.
     */
    public SolutionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the title property: The title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Get the content property: The HTML content that needs to be rendered and shown to customer.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Get the replacementMaps property: Solution replacement maps.
     * 
     * @return the replacementMaps value.
     */
    public ReplacementMaps replacementMaps() {
        return this.replacementMaps;
    }

    /**
     * Get the sections property: List of section object.
     * 
     * @return the sections value.
     */
    public List<Section> sections() {
        return this.sections;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (triggerCriteria() != null) {
            triggerCriteria().forEach(e -> e.validate());
        }
        if (replacementMaps() != null) {
            replacementMaps().validate();
        }
        if (sections() != null) {
            sections().forEach(e -> e.validate());
        }
    }
}
