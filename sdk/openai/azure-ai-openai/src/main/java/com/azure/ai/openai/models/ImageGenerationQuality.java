// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * An image generation configuration that specifies how the model should prioritize quality, cost, and speed.
 * Only configurable with dall-e-3 models.
 */
public final class ImageGenerationQuality extends ExpandableStringEnum<ImageGenerationQuality> {

    /**
     * Requests image generation with standard, balanced characteristics of quality, cost, and speed.
     */
    @Generated
    public static final ImageGenerationQuality STANDARD = fromString("standard");

    /**
     * Requests image generation with higher quality, higher cost and lower speed relative to standard.
     */
    @Generated
    public static final ImageGenerationQuality HD = fromString("hd");

    /**
     * Creates a new instance of ImageGenerationQuality value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ImageGenerationQuality() {
    }

    /**
     * Creates or finds a ImageGenerationQuality from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageGenerationQuality.
     */
    @Generated
    @JsonCreator
    public static ImageGenerationQuality fromString(String name) {
        return fromString(name, ImageGenerationQuality.class);
    }

    /**
     * Gets known ImageGenerationQuality values.
     *
     * @return known ImageGenerationQuality values.
     */
    @Generated
    public static Collection<ImageGenerationQuality> values() {
        return values(ImageGenerationQuality.class);
    }
}
