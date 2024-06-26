// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ContainerizedNetworkFunctionTemplate;

public final class ContainerizedNetworkFunctionTemplateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerizedNetworkFunctionTemplate model
            = BinaryData.fromString("{\"nfviType\":\"ContainerizedNetworkFunctionTemplate\"}")
                .toObject(ContainerizedNetworkFunctionTemplate.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerizedNetworkFunctionTemplate model = new ContainerizedNetworkFunctionTemplate();
        model = BinaryData.fromObject(model).toObject(ContainerizedNetworkFunctionTemplate.class);
    }
}
