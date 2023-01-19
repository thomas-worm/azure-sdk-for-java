// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.operationsmanagement.models.SolutionProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SolutionProperties model =
            BinaryData
                .fromString(
                    "{\"workspaceResourceId\":\"p\",\"provisioningState\":\"noi\",\"containedResources\":[\"lrxybqsoq\",\"jgkdmbpazlobcu\"],\"referencedResources\":[\"znrb\",\"cqqjnqglhqgn\",\"foooj\"]}")
                .toObject(SolutionProperties.class);
        Assertions.assertEquals("p", model.workspaceResourceId());
        Assertions.assertEquals("lrxybqsoq", model.containedResources().get(0));
        Assertions.assertEquals("znrb", model.referencedResources().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SolutionProperties model =
            new SolutionProperties()
                .withWorkspaceResourceId("p")
                .withContainedResources(Arrays.asList("lrxybqsoq", "jgkdmbpazlobcu"))
                .withReferencedResources(Arrays.asList("znrb", "cqqjnqglhqgn", "foooj"));
        model = BinaryData.fromObject(model).toObject(SolutionProperties.class);
        Assertions.assertEquals("p", model.workspaceResourceId());
        Assertions.assertEquals("lrxybqsoq", model.containedResources().get(0));
        Assertions.assertEquals("znrb", model.referencedResources().get(0));
    }
}