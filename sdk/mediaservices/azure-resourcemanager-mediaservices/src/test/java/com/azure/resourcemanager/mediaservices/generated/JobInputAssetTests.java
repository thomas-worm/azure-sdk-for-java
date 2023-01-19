// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ClipTime;
import com.azure.resourcemanager.mediaservices.models.InputDefinition;
import com.azure.resourcemanager.mediaservices.models.JobInputAsset;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JobInputAssetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobInputAsset model =
            BinaryData
                .fromString(
                    "{\"@odata.type\":\"#Microsoft.Media.JobInputAsset\",\"assetName\":\"hxmsivfo\",\"files\":[\"ox\",\"gdufiqnd\",\"euzaof\"],\"start\":{\"@odata.type\":\"ClipTime\"},\"end\":{\"@odata.type\":\"ClipTime\"},\"label\":\"cyyysfgdot\",\"inputDefinitions\":[{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[]}]}")
                .toObject(JobInputAsset.class);
        Assertions.assertEquals("ox", model.files().get(0));
        Assertions.assertEquals("cyyysfgdot", model.label());
        Assertions.assertEquals("hxmsivfo", model.assetName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobInputAsset model =
            new JobInputAsset()
                .withFiles(Arrays.asList("ox", "gdufiqnd", "euzaof"))
                .withStart(new ClipTime())
                .withEnd(new ClipTime())
                .withLabel("cyyysfgdot")
                .withInputDefinitions(
                    Arrays
                        .asList(
                            new InputDefinition().withIncludedTracks(Arrays.asList()),
                            new InputDefinition().withIncludedTracks(Arrays.asList())))
                .withAssetName("hxmsivfo");
        model = BinaryData.fromObject(model).toObject(JobInputAsset.class);
        Assertions.assertEquals("ox", model.files().get(0));
        Assertions.assertEquals("cyyysfgdot", model.label());
        Assertions.assertEquals("hxmsivfo", model.assetName());
    }
}