// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the content filtering results for the prompt of a image generation request.
 */
@Immutable
public final class ImageGenerationPromptFilterResults {

    /*
     * Describes language related to anatomical organs and genitals, romantic relationships,
     * acts portrayed in erotic or affectionate terms, physical sexual acts, including
     * those portrayed as an assault or a forced sexual violent act against one’s will,
     * prostitution, pornography, and abuse.
     */
    @Generated
    @JsonProperty(value = "sexual")
    private ContentFilterResult sexual;

    /*
     * Describes language related to physical actions intended to hurt, injure, damage, or
     * kill someone or something; describes weapons, etc.
     */
    @Generated
    @JsonProperty(value = "violence")
    private ContentFilterResult violence;

    /*
     * Describes language attacks or uses that include pejorative or discriminatory language
     * with reference to a person or identity group on the basis of certain differentiating
     * attributes of these groups including but not limited to race, ethnicity, nationality,
     * gender identity and expression, sexual orientation, religion, immigration status, ability
     * status, personal appearance, and body size.
     */
    @Generated
    @JsonProperty(value = "hate")
    private ContentFilterResult hate;

    /*
     * Describes language related to physical actions intended to purposely hurt, injure,
     * or damage one’s body, or kill oneself.
     */
    @Generated
    @JsonProperty(value = "self_harm")
    private ContentFilterResult selfHarm;

    /*
     * Describes whether profanity was detected.
     */
    @Generated
    @JsonProperty(value = "profanity")
    private ContentFilterDetectionResult profanity;

    /*
     * Whether a jailbreak attempt was detected in the prompt.
     */
    @Generated
    @JsonProperty(value = "jailbreak")
    private ContentFilterDetectionResult jailbreak;

    /**
     * Creates an instance of ImageGenerationPromptFilterResults class.
     */
    @Generated
    private ImageGenerationPromptFilterResults() {
    }

    /**
     * Get the sexual property: Describes language related to anatomical organs and genitals, romantic relationships,
     * acts portrayed in erotic or affectionate terms, physical sexual acts, including
     * those portrayed as an assault or a forced sexual violent act against one’s will,
     * prostitution, pornography, and abuse.
     *
     * @return the sexual value.
     */
    @Generated
    public ContentFilterResult getSexual() {
        return this.sexual;
    }

    /**
     * Get the violence property: Describes language related to physical actions intended to hurt, injure, damage, or
     * kill someone or something; describes weapons, etc.
     *
     * @return the violence value.
     */
    @Generated
    public ContentFilterResult getViolence() {
        return this.violence;
    }

    /**
     * Get the hate property: Describes language attacks or uses that include pejorative or discriminatory language
     * with reference to a person or identity group on the basis of certain differentiating
     * attributes of these groups including but not limited to race, ethnicity, nationality,
     * gender identity and expression, sexual orientation, religion, immigration status, ability
     * status, personal appearance, and body size.
     *
     * @return the hate value.
     */
    @Generated
    public ContentFilterResult getHate() {
        return this.hate;
    }

    /**
     * Get the selfHarm property: Describes language related to physical actions intended to purposely hurt, injure,
     * or damage one’s body, or kill oneself.
     *
     * @return the selfHarm value.
     */
    @Generated
    public ContentFilterResult getSelfHarm() {
        return this.selfHarm;
    }

    /**
     * Get the profanity property: Describes whether profanity was detected.
     *
     * @return the profanity value.
     */
    @Generated
    public ContentFilterDetectionResult getProfanity() {
        return this.profanity;
    }

    /**
     * Get the jailbreak property: Whether a jailbreak attempt was detected in the prompt.
     *
     * @return the jailbreak value.
     */
    @Generated
    public ContentFilterDetectionResult getJailbreak() {
        return this.jailbreak;
    }
}
