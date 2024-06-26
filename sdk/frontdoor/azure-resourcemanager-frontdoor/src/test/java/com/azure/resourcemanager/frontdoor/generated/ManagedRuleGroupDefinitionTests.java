// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleGroupDefinition;

public final class ManagedRuleGroupDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedRuleGroupDefinition model =
            BinaryData
                .fromString(
                    "{\"ruleGroupName\":\"ckwhds\",\"description\":\"fiyipjxsqwpgrj\",\"rules\":[{\"ruleId\":\"rcjxvsnbyxqabn\",\"defaultState\":\"Disabled\",\"defaultAction\":\"Log\",\"description\":\"shurzafbljjgpbto\"},{\"ruleId\":\"jmkljavbqidtqajz\",\"defaultState\":\"Disabled\",\"defaultAction\":\"Redirect\",\"description\":\"dj\"},{\"ruleId\":\"lkhbz\",\"defaultState\":\"Enabled\",\"defaultAction\":\"AnomalyScoring\",\"description\":\"gqexzlocxs\"},{\"ruleId\":\"aierhhb\",\"defaultState\":\"Disabled\",\"defaultAction\":\"Redirect\",\"description\":\"majtjaod\"}]}")
                .toObject(ManagedRuleGroupDefinition.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedRuleGroupDefinition model = new ManagedRuleGroupDefinition();
        model = BinaryData.fromObject(model).toObject(ManagedRuleGroupDefinition.class);
    }
}
