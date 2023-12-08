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
 * The authentication options for Azure OpenAI On Your Data when using an API key.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("APIKey")
@Immutable
public final class OnYourDataApiKeyAuthenticationOptions extends OnYourDataAuthenticationOptions {

    /*
     * The API key to use for authentication.
     */
    @Generated
    @JsonProperty(value = "key")
    private String key;

    /**
     * Creates an instance of OnYourDataApiKeyAuthenticationOptions class.
     *
     * @param key the key value to set.
     */
    @Generated
    @JsonCreator
    public OnYourDataApiKeyAuthenticationOptions(@JsonProperty(value = "key") String key) {
        this.key = key;
    }

    /**
     * Get the key property: The API key to use for authentication.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }
}
