// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A request chat message representing requested output from a configured function.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "role")
@JsonTypeName("function")
@Immutable
public final class ChatRequestFunctionMessage extends ChatRequestMessage {

    /*
     * The name of the function that was called to produce output.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The output of the function as requested by the function call.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /**
     * Creates an instance of ChatRequestFunctionMessage class.
     *
     * @param name the name value to set.
     * @param content the content value to set.
     */
    @Generated
    @JsonCreator
    public ChatRequestFunctionMessage(@JsonProperty(value = "name") String name,
        @JsonProperty(value = "content") String content) {
        this.name = name;
        this.content = content;
    }

    /**
     * Get the name property: The name of the function that was called to produce output.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the content property: The output of the function as requested by the function call.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }
}
