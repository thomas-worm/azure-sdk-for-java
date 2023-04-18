// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.IotHubPropertiesDeviceStreams;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IotHubPropertiesDeviceStreamsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotHubPropertiesDeviceStreams model =
            BinaryData
                .fromString("{\"streamingEndpoints\":[\"pcyvahfnljkyqx\",\"vuujq\",\"idokgjlj\"]}")
                .toObject(IotHubPropertiesDeviceStreams.class);
        Assertions.assertEquals("pcyvahfnljkyqx", model.streamingEndpoints().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotHubPropertiesDeviceStreams model =
            new IotHubPropertiesDeviceStreams()
                .withStreamingEndpoints(Arrays.asList("pcyvahfnljkyqx", "vuujq", "idokgjlj"));
        model = BinaryData.fromObject(model).toObject(IotHubPropertiesDeviceStreams.class);
        Assertions.assertEquals("pcyvahfnljkyqx", model.streamingEndpoints().get(0));
    }
}
