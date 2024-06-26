// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.resourcehealth.models.StatusActiveEvent;
import com.azure.resourcemanager.resourcehealth.models.StatusBanner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The Get EmergingIssues operation response. */
@Fluent
public final class EmergingIssuesGetResultInner extends ProxyResource {
    /*
     * The emerging issue entity properties.
     */
    @JsonProperty(value = "properties")
    private EmergingIssue innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of EmergingIssuesGetResultInner class. */
    public EmergingIssuesGetResultInner() {
    }

    /**
     * Get the innerProperties property: The emerging issue entity properties.
     *
     * @return the innerProperties value.
     */
    private EmergingIssue innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the refreshTimestamp property: Timestamp for when last time refreshed for ongoing emerging issue.
     *
     * @return the refreshTimestamp value.
     */
    public OffsetDateTime refreshTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().refreshTimestamp();
    }

    /**
     * Set the refreshTimestamp property: Timestamp for when last time refreshed for ongoing emerging issue.
     *
     * @param refreshTimestamp the refreshTimestamp value to set.
     * @return the EmergingIssuesGetResultInner object itself.
     */
    public EmergingIssuesGetResultInner withRefreshTimestamp(OffsetDateTime refreshTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmergingIssue();
        }
        this.innerProperties().withRefreshTimestamp(refreshTimestamp);
        return this;
    }

    /**
     * Get the statusBanners property: The list of emerging issues of banner type.
     *
     * @return the statusBanners value.
     */
    public List<StatusBanner> statusBanners() {
        return this.innerProperties() == null ? null : this.innerProperties().statusBanners();
    }

    /**
     * Set the statusBanners property: The list of emerging issues of banner type.
     *
     * @param statusBanners the statusBanners value to set.
     * @return the EmergingIssuesGetResultInner object itself.
     */
    public EmergingIssuesGetResultInner withStatusBanners(List<StatusBanner> statusBanners) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmergingIssue();
        }
        this.innerProperties().withStatusBanners(statusBanners);
        return this;
    }

    /**
     * Get the statusActiveEvents property: The list of emerging issues of active event type.
     *
     * @return the statusActiveEvents value.
     */
    public List<StatusActiveEvent> statusActiveEvents() {
        return this.innerProperties() == null ? null : this.innerProperties().statusActiveEvents();
    }

    /**
     * Set the statusActiveEvents property: The list of emerging issues of active event type.
     *
     * @param statusActiveEvents the statusActiveEvents value to set.
     * @return the EmergingIssuesGetResultInner object itself.
     */
    public EmergingIssuesGetResultInner withStatusActiveEvents(List<StatusActiveEvent> statusActiveEvents) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EmergingIssue();
        }
        this.innerProperties().withStatusActiveEvents(statusActiveEvents);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
