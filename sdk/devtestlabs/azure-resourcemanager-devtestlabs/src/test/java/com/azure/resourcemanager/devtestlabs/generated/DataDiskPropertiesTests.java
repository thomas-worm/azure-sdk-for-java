// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.AttachNewDataDiskOptions;
import com.azure.resourcemanager.devtestlabs.models.DataDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.HostCachingOptions;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import org.junit.jupiter.api.Assertions;

public final class DataDiskPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataDiskProperties model =
            BinaryData
                .fromString(
                    "{\"attachNewDataDiskOptions\":{\"diskSizeGiB\":1554558708,\"diskName\":\"crpw\",\"diskType\":\"StandardSSD\"},\"existingLabDiskId\":\"noigbrnjwmwk\",\"hostCaching\":\"None\"}")
                .toObject(DataDiskProperties.class);
        Assertions.assertEquals(1554558708, model.attachNewDataDiskOptions().diskSizeGiB());
        Assertions.assertEquals("crpw", model.attachNewDataDiskOptions().diskName());
        Assertions.assertEquals(StorageType.STANDARD_SSD, model.attachNewDataDiskOptions().diskType());
        Assertions.assertEquals("noigbrnjwmwk", model.existingLabDiskId());
        Assertions.assertEquals(HostCachingOptions.NONE, model.hostCaching());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataDiskProperties model =
            new DataDiskProperties()
                .withAttachNewDataDiskOptions(
                    new AttachNewDataDiskOptions()
                        .withDiskSizeGiB(1554558708)
                        .withDiskName("crpw")
                        .withDiskType(StorageType.STANDARD_SSD))
                .withExistingLabDiskId("noigbrnjwmwk")
                .withHostCaching(HostCachingOptions.NONE);
        model = BinaryData.fromObject(model).toObject(DataDiskProperties.class);
        Assertions.assertEquals(1554558708, model.attachNewDataDiskOptions().diskSizeGiB());
        Assertions.assertEquals("crpw", model.attachNewDataDiskOptions().diskName());
        Assertions.assertEquals(StorageType.STANDARD_SSD, model.attachNewDataDiskOptions().diskType());
        Assertions.assertEquals("noigbrnjwmwk", model.existingLabDiskId());
        Assertions.assertEquals(HostCachingOptions.NONE, model.hostCaching());
    }
}
