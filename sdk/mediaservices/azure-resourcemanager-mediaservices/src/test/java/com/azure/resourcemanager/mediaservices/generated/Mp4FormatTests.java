// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.Mp4Format;
import com.azure.resourcemanager.mediaservices.models.OutputFile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class Mp4FormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Mp4Format model =
            BinaryData
                .fromString(
                    "{\"@odata.type\":\"#Microsoft.Media.Mp4Format\",\"outputFiles\":[{\"labels\":[\"foimwkslircizjxv\",\"dfcea\",\"vlhv\"]}],\"filenamePattern\":\"gdyftumrtwna\"}")
                .toObject(Mp4Format.class);
        Assertions.assertEquals("gdyftumrtwna", model.filenamePattern());
        Assertions.assertEquals("foimwkslircizjxv", model.outputFiles().get(0).labels().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Mp4Format model =
            new Mp4Format()
                .withFilenamePattern("gdyftumrtwna")
                .withOutputFiles(
                    Arrays.asList(new OutputFile().withLabels(Arrays.asList("foimwkslircizjxv", "dfcea", "vlhv"))));
        model = BinaryData.fromObject(model).toObject(Mp4Format.class);
        Assertions.assertEquals("gdyftumrtwna", model.filenamePattern());
        Assertions.assertEquals("foimwkslircizjxv", model.outputFiles().get(0).labels().get(0));
    }
}