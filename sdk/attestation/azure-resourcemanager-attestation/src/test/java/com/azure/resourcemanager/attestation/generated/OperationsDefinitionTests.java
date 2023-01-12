// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.attestation.models.OperationsDefinition;
import com.azure.resourcemanager.attestation.models.OperationsDisplayDefinition;
import org.junit.jupiter.api.Assertions;

public final class OperationsDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsDefinition model =
            BinaryData
                .fromString(
                    "{\"name\":\"tbmufpo\",\"display\":{\"provider\":\"izhwlrxy\",\"resource\":\"soqijg\",\"operation\":\"mbpazlobcufpdzn\",\"description\":\"t\"}}")
                .toObject(OperationsDefinition.class);
        Assertions.assertEquals("tbmufpo", model.name());
        Assertions.assertEquals("izhwlrxy", model.display().provider());
        Assertions.assertEquals("soqijg", model.display().resource());
        Assertions.assertEquals("mbpazlobcufpdzn", model.display().operation());
        Assertions.assertEquals("t", model.display().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsDefinition model =
            new OperationsDefinition()
                .withName("tbmufpo")
                .withDisplay(
                    new OperationsDisplayDefinition()
                        .withProvider("izhwlrxy")
                        .withResource("soqijg")
                        .withOperation("mbpazlobcufpdzn")
                        .withDescription("t"));
        model = BinaryData.fromObject(model).toObject(OperationsDefinition.class);
        Assertions.assertEquals("tbmufpo", model.name());
        Assertions.assertEquals("izhwlrxy", model.display().provider());
        Assertions.assertEquals("soqijg", model.display().resource());
        Assertions.assertEquals("mbpazlobcufpdzn", model.display().operation());
        Assertions.assertEquals("t", model.display().description());
    }
}