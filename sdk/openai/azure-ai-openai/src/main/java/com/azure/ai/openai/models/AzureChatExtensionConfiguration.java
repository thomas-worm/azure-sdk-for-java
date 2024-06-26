// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A representation of configuration data for a single Azure OpenAI chat extension. This will be used by a chat
 * completions request that should use Azure OpenAI chat extensions to augment the response behavior.
 * The use of this configuration is compatible only with Azure OpenAI.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = AzureChatExtensionConfiguration.class)
@JsonTypeName("AzureChatExtensionConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "azure_search", value = AzureSearchChatExtensionConfiguration.class),
    @JsonSubTypes.Type(name = "azure_ml_index", value = AzureMachineLearningIndexChatExtensionConfiguration.class),
    @JsonSubTypes.Type(name = "azure_cosmos_db", value = AzureCosmosDBChatExtensionConfiguration.class),
    @JsonSubTypes.Type(name = "elasticsearch", value = ElasticsearchChatExtensionConfiguration.class),
    @JsonSubTypes.Type(name = "pinecone", value = PineconeChatExtensionConfiguration.class) })
@Immutable
public class AzureChatExtensionConfiguration {

    /**
     * Creates an instance of AzureChatExtensionConfiguration class.
     */
    @Generated
    public AzureChatExtensionConfiguration() {
    }
}
