// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;

/** An Azure Storage container. */
@JacksonXmlRootElement(localName = "Container")
@Fluent
public final class BlobContainerItem {
    /*
     * The Name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The Deleted property.
     */
    @JsonProperty(value = "Deleted")
    private Boolean deleted;

    /*
     * The Version property.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Properties of a container
     */
    @JsonProperty(value = "Properties", required = true)
    private BlobContainerItemProperties properties;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /** Creates an instance of BlobContainerItem class. */
    public BlobContainerItem() {}

    /**
     * Get the name property: The Name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     *
     * @param name the name value to set.
     * @return the BlobContainerItem object itself.
     */
    public BlobContainerItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the deleted property: The Deleted property.
     *
     * @return the deleted value.
     */
    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: The Deleted property.
     *
     * @param deleted the deleted value to set.
     * @return the BlobContainerItem object itself.
     */
    public BlobContainerItem setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the version property: The Version property.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The Version property.
     *
     * @param version the version value to set.
     * @return the BlobContainerItem object itself.
     */
    public BlobContainerItem setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the properties property: Properties of a container.
     *
     * @return the properties value.
     */
    public BlobContainerItemProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a container.
     *
     * @param properties the properties value to set.
     * @return the BlobContainerItem object itself.
     */
    public BlobContainerItem setProperties(BlobContainerItemProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: Dictionary of &lt;string&gt;.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Dictionary of &lt;string&gt;.
     *
     * @param metadata the metadata value to set.
     * @return the BlobContainerItem object itself.
     */
    public BlobContainerItem setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
