// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceControlInner;
import com.azure.resourcemanager.security.models.State;
import org.junit.jupiter.api.Assertions;

public final class RegulatoryComplianceControlInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegulatoryComplianceControlInner model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"wkfvhqcrailvp\",\"state\":\"Failed\",\"passedAssessments\":1360002238,\"failedAssessments\":749760843,\"skippedAssessments\":888986239},\"id\":\"dmhdlxyjr\",\"name\":\"sag\",\"type\":\"fcnihgwq\"}")
            .toObject(RegulatoryComplianceControlInner.class);
        Assertions.assertEquals(State.FAILED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegulatoryComplianceControlInner model = new RegulatoryComplianceControlInner().withState(State.FAILED);
        model = BinaryData.fromObject(model).toObject(RegulatoryComplianceControlInner.class);
        Assertions.assertEquals(State.FAILED, model.state());
    }
}
