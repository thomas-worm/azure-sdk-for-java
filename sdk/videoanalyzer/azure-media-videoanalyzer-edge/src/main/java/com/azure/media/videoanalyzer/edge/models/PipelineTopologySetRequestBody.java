// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pipeline topology describes the processing steps to be applied when processing media for a particular outcome. The
 * topology should be defined according to the scenario to be achieved and can be reused across many pipeline instances
 * which share the same processing characteristics. For instance, a pipeline topology which acquires data from a RTSP
 * camera, process it with an specific AI model and stored the data on the cloud can be reused across many different
 * cameras, as long as the same processing should be applied across all the cameras. Individual instance properties can
 * be defined through the use of user-defined parameters, which allow for a topology to be parameterized, thus allowing
 * individual pipelines to refer to different values, such as individual cameras RTSP endpoints and credentials. Overall
 * a topology is composed of the following:
 *
 * <p>- Parameters: list of user defined parameters that can be references across the topology nodes. - Sources: list of
 * one or more data sources nodes such as an RTSP source which allows for media to be ingested from cameras. -
 * Processors: list of nodes which perform data analysis or transformations. -Sinks: list of one or more data sinks
 * which allow for data to be stored or exported to other destinations.
 */
@Fluent
public final class PipelineTopologySetRequestBody extends MethodRequest {
    /*
     * Pipeline topology unique identifier.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Read-only system metadata associated with this object.
     */
    @JsonProperty(value = "systemData")
    private SystemData systemData;

    /*
     * Pipeline topology properties.
     */
    @JsonProperty(value = "properties")
    private PipelineTopologyProperties properties;

    /**
     * Creates an instance of PipelineTopologySetRequestBody class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public PipelineTopologySetRequestBody(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: Pipeline topology unique identifier.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the systemData property: Read-only system metadata associated with this object.
     *
     * @return the systemData value.
     */
    public SystemData getSystemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: Read-only system metadata associated with this object.
     *
     * @param systemData the systemData value to set.
     * @return the PipelineTopologySetRequestBody object itself.
     */
    public PipelineTopologySetRequestBody setSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the properties property: Pipeline topology properties.
     *
     * @return the properties value.
     */
    public PipelineTopologyProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Pipeline topology properties.
     *
     * @param properties the properties value to set.
     * @return the PipelineTopologySetRequestBody object itself.
     */
    public PipelineTopologySetRequestBody setProperties(PipelineTopologyProperties properties) {
        this.properties = properties;
        return this;
    }
}
