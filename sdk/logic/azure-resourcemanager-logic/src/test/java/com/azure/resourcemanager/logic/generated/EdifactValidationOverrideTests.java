// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.EdifactValidationOverride;
import com.azure.resourcemanager.logic.models.TrailingSeparatorPolicy;
import org.junit.jupiter.api.Assertions;

public final class EdifactValidationOverrideTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EdifactValidationOverride model =
            BinaryData
                .fromString(
                    "{\"messageId\":\"suxmpraf\",\"enforceCharacterSet\":false,\"validateEDITypes\":false,\"validateXSDTypes\":true,\"allowLeadingAndTrailingSpacesAndZeroes\":true,\"trailingSeparatorPolicy\":\"Mandatory\",\"trimLeadingAndTrailingSpacesAndZeroes\":true}")
                .toObject(EdifactValidationOverride.class);
        Assertions.assertEquals("suxmpraf", model.messageId());
        Assertions.assertEquals(false, model.enforceCharacterSet());
        Assertions.assertEquals(false, model.validateEdiTypes());
        Assertions.assertEquals(true, model.validateXsdTypes());
        Assertions.assertEquals(true, model.allowLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(TrailingSeparatorPolicy.MANDATORY, model.trailingSeparatorPolicy());
        Assertions.assertEquals(true, model.trimLeadingAndTrailingSpacesAndZeroes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EdifactValidationOverride model =
            new EdifactValidationOverride()
                .withMessageId("suxmpraf")
                .withEnforceCharacterSet(false)
                .withValidateEdiTypes(false)
                .withValidateXsdTypes(true)
                .withAllowLeadingAndTrailingSpacesAndZeroes(true)
                .withTrailingSeparatorPolicy(TrailingSeparatorPolicy.MANDATORY)
                .withTrimLeadingAndTrailingSpacesAndZeroes(true);
        model = BinaryData.fromObject(model).toObject(EdifactValidationOverride.class);
        Assertions.assertEquals("suxmpraf", model.messageId());
        Assertions.assertEquals(false, model.enforceCharacterSet());
        Assertions.assertEquals(false, model.validateEdiTypes());
        Assertions.assertEquals(true, model.validateXsdTypes());
        Assertions.assertEquals(true, model.allowLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(TrailingSeparatorPolicy.MANDATORY, model.trailingSeparatorPolicy());
        Assertions.assertEquals(true, model.trimLeadingAndTrailingSpacesAndZeroes());
    }
}
