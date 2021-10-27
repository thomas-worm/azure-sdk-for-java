// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Options for changing video publishing behavior on the video sink and output video. */
@Fluent
public final class VideoPublishingOptions {
    /*
     * When set to 'true' the video will publish preview images. Default is
     * 'false'.
     */
    @JsonProperty(value = "enableVideoPreviewImage")
    private String enableVideoPreviewImage;

    /**
     * Get the enableVideoPreviewImage property: When set to 'true' the video will publish preview images. Default is
     * 'false'.
     *
     * @return the enableVideoPreviewImage value.
     */
    public String getEnableVideoPreviewImage() {
        return this.enableVideoPreviewImage;
    }

    /**
     * Set the enableVideoPreviewImage property: When set to 'true' the video will publish preview images. Default is
     * 'false'.
     *
     * @param enableVideoPreviewImage the enableVideoPreviewImage value to set.
     * @return the VideoPublishingOptions object itself.
     */
    public VideoPublishingOptions setEnableVideoPreviewImage(String enableVideoPreviewImage) {
        this.enableVideoPreviewImage = enableVideoPreviewImage;
        return this;
    }
}
