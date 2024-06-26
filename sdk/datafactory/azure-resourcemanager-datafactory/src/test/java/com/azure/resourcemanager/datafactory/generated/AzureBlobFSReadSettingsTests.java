// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSReadSettings;

public final class AzureBlobFSReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSReadSettings model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSReadSettings\",\"recursive\":\"datasbk\",\"wildcardFolderPath\":\"dataouytsajjgvu\",\"wildcardFileName\":\"datawichjk\",\"fileListPath\":\"datatlsohrtgpvvcbt\",\"enablePartitionDiscovery\":\"dataiwc\",\"partitionRootPath\":\"datayaoyzjfgv\",\"deleteFilesAfterCompletion\":\"datauimnabgrs\",\"modifiedDatetimeStart\":\"datazmthiecuflazfot\",\"modifiedDatetimeEnd\":\"datakumam\",\"maxConcurrentConnections\":\"datargljekh\",\"disableMetricsCollection\":\"datafgjbeybdukbglniw\",\"\":{\"oexkon\":\"dataysceji\",\"edhaftniffajniwb\":\"dataiacdloehsmvvxkc\"}}")
            .toObject(AzureBlobFSReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSReadSettings model = new AzureBlobFSReadSettings().withMaxConcurrentConnections("datargljekh")
            .withDisableMetricsCollection("datafgjbeybdukbglniw").withRecursive("datasbk")
            .withWildcardFolderPath("dataouytsajjgvu").withWildcardFileName("datawichjk")
            .withFileListPath("datatlsohrtgpvvcbt").withEnablePartitionDiscovery("dataiwc")
            .withPartitionRootPath("datayaoyzjfgv").withDeleteFilesAfterCompletion("datauimnabgrs")
            .withModifiedDatetimeStart("datazmthiecuflazfot").withModifiedDatetimeEnd("datakumam");
        model = BinaryData.fromObject(model).toObject(AzureBlobFSReadSettings.class);
    }
}
