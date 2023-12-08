// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An abstract representation of a tool call that must be resolved in a subsequent request to perform the requested
 * chat completion.
 */
@JsonTypeName("ChatCompletionsToolCall")
@JsonSubTypes({ @JsonSubTypes.Type(name = "function", value = ChatCompletionsFunctionToolCall.class) })
@Immutable
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = ChatCompletionsToolCall.class)
public class ChatCompletionsToolCall {

    /*
     * The ID of the tool call.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    @JsonProperty("type")
    private String type;

    /**
     * Get the id property: The ID of the tool call.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: The type pf the tool call.
     *
     * @return the type value.
     */
    @JsonGetter
    public String getType() {
        return this.type;
    }

    /**
     * Creates an instance of ChatCompletionsToolCall class.
     * 
     * @param id the id value to set.
     * @param type the type value to set.
     */
    @Generated
    @JsonCreator
    public ChatCompletionsToolCall(@JsonProperty(value = "id") String id, @JsonProperty(value = "type") String type) {
        this.id = id;
        this.type = type;
    }
}
