// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Maintenance window starting hour and day of week. */
@Fluent
public final class MaintenanceWindowPatchProperties {
    /*
     * The update start hour of the day. (0 - 23)
     */
    @JsonProperty(value = "hour")
    private Integer hour;

    /*
     * Day of the week.
     */
    @JsonProperty(value = "dayOfWeek")
    private DayOfWeek dayOfWeek;

    /** Creates an instance of MaintenanceWindowPatchProperties class. */
    public MaintenanceWindowPatchProperties() {
    }

    /**
     * Get the hour property: The update start hour of the day. (0 - 23).
     *
     * @return the hour value.
     */
    public Integer hour() {
        return this.hour;
    }

    /**
     * Set the hour property: The update start hour of the day. (0 - 23).
     *
     * @param hour the hour value to set.
     * @return the MaintenanceWindowPatchProperties object itself.
     */
    public MaintenanceWindowPatchProperties withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Get the dayOfWeek property: Day of the week.
     *
     * @return the dayOfWeek value.
     */
    public DayOfWeek dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Day of the week.
     *
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the MaintenanceWindowPatchProperties object itself.
     */
    public MaintenanceWindowPatchProperties withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
