// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDefinitionItemInner;
import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDetailsInner;

public final class SecureScoreControlDetailsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureScoreControlDetailsInner model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":\"fcb\",\"score\":{\"max\":584126929,\"current\":47.16012778789482,\"percentage\":25.299200031358147},\"healthyResourceCount\":2015345147,\"unhealthyResourceCount\":1255552249,\"notApplicableResourceCount\":575774513,\"weight\":8710885731420794723,\"definition\":{\"properties\":{\"displayName\":\"ywnfyszzaczs\",\"description\":\"q\",\"maxScore\":574281119,\"source\":{\"sourceType\":\"BuiltIn\"},\"assessmentDefinitions\":[{\"id\":\"syvrmkjmyitr\"},{\"id\":\"wudlxeeihtpmnoe\"}]},\"id\":\"hqlfmsib\",\"name\":\"oyrfgxk\",\"type\":\"dpmypgfqvmtywh\"}},\"id\":\"a\",\"name\":\"xpejpewpy\",\"type\":\"lfxampqc\"}")
            .toObject(SecureScoreControlDetailsInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureScoreControlDetailsInner model
            = new SecureScoreControlDetailsInner().withDefinition(new SecureScoreControlDefinitionItemInner());
        model = BinaryData.fromObject(model).toObject(SecureScoreControlDetailsInner.class);
    }
}
