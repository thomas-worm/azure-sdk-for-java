// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A representation of a single generated image, provided as either base64-encoded data or as a URL from which the
 * image
 * may be retrieved.
 */
@Fluent
public final class ImageGenerationData {

    /*
     * The URL that provides temporary access to download the generated image.
     */
    @Generated
    @JsonProperty(value = "url")
    private String url;

    /*
     * The complete data for an image, represented as a base64-encoded string.
     */
    @Generated
    @JsonProperty(value = "b64_json")
    private String base64Data;

    /*
     * The final prompt used by the model to generate the image.
     * Only provided with dall-3-models and only when revisions were made to the prompt.
     */
    @Generated
    @JsonProperty(value = "revised_prompt")
    private String revisedPrompt;

    /**
     * Creates an instance of ImageGenerationData class.
     */
    @Generated
    public ImageGenerationData() {
    }

    /**
     * Get the url property: The URL that provides temporary access to download the generated image.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The URL that provides temporary access to download the generated image.
     *
     * @param url the url value to set.
     * @return the ImageGenerationData object itself.
     */
    @Generated
    public ImageGenerationData setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the base64Data property: The complete data for an image, represented as a base64-encoded string.
     *
     * @return the base64Data value.
     */
    @Generated
    public String getBase64Data() {
        return this.base64Data;
    }

    /**
     * Set the base64Data property: The complete data for an image, represented as a base64-encoded string.
     *
     * @param base64Data the base64Data value to set.
     * @return the ImageGenerationData object itself.
     */
    @Generated
    public ImageGenerationData setBase64Data(String base64Data) {
        this.base64Data = base64Data;
        return this;
    }

    /**
     * Get the revisedPrompt property: The final prompt used by the model to generate the image.
     * Only provided with dall-3-models and only when revisions were made to the prompt.
     *
     * @return the revisedPrompt value.
     */
    @Generated
    public String getRevisedPrompt() {
        return this.revisedPrompt;
    }

    /**
     * Set the revisedPrompt property: The final prompt used by the model to generate the image.
     * Only provided with dall-3-models and only when revisions were made to the prompt.
     *
     * @param revisedPrompt the revisedPrompt value to set.
     * @return the ImageGenerationData object itself.
     */
    @Generated
    public ImageGenerationData setRevisedPrompt(String revisedPrompt) {
        this.revisedPrompt = revisedPrompt;
        return this;
    }
}
