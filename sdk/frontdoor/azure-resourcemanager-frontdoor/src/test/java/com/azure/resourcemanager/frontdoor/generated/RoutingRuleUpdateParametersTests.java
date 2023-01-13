// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.models.RouteConfiguration;
import com.azure.resourcemanager.frontdoor.models.RoutingRuleEnabledState;
import com.azure.resourcemanager.frontdoor.models.RoutingRuleUpdateParameters;
import com.azure.resourcemanager.frontdoor.models.RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RoutingRuleUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutingRuleUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"frontendEndpoints\":[{\"id\":\"elwuipi\"},{\"id\":\"jzkzi\"}],\"acceptedProtocols\":[\"Http\",\"Http\"],\"patternsToMatch\":[\"y\",\"hyrnxxmu\"],\"enabledState\":\"Disabled\",\"routeConfiguration\":{\"@odata.type\":\"RouteConfiguration\"},\"rulesEngine\":{\"id\":\"dvstkw\"},\"webApplicationFirewallPolicyLink\":{\"id\":\"chea\"}}")
                .toObject(RoutingRuleUpdateParameters.class);
        Assertions.assertEquals("elwuipi", model.frontendEndpoints().get(0).id());
        Assertions.assertEquals(FrontDoorProtocol.HTTP, model.acceptedProtocols().get(0));
        Assertions.assertEquals("y", model.patternsToMatch().get(0));
        Assertions.assertEquals(RoutingRuleEnabledState.DISABLED, model.enabledState());
        Assertions.assertEquals("dvstkw", model.rulesEngine().id());
        Assertions.assertEquals("chea", model.webApplicationFirewallPolicyLink().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutingRuleUpdateParameters model =
            new RoutingRuleUpdateParameters()
                .withFrontendEndpoints(
                    Arrays.asList(new SubResource().withId("elwuipi"), new SubResource().withId("jzkzi")))
                .withAcceptedProtocols(Arrays.asList(FrontDoorProtocol.HTTP, FrontDoorProtocol.HTTP))
                .withPatternsToMatch(Arrays.asList("y", "hyrnxxmu"))
                .withEnabledState(RoutingRuleEnabledState.DISABLED)
                .withRouteConfiguration(new RouteConfiguration())
                .withRulesEngine(new SubResource().withId("dvstkw"))
                .withWebApplicationFirewallPolicyLink(
                    new RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink().withId("chea"));
        model = BinaryData.fromObject(model).toObject(RoutingRuleUpdateParameters.class);
        Assertions.assertEquals("elwuipi", model.frontendEndpoints().get(0).id());
        Assertions.assertEquals(FrontDoorProtocol.HTTP, model.acceptedProtocols().get(0));
        Assertions.assertEquals("y", model.patternsToMatch().get(0));
        Assertions.assertEquals(RoutingRuleEnabledState.DISABLED, model.enabledState());
        Assertions.assertEquals("dvstkw", model.rulesEngine().id());
        Assertions.assertEquals("chea", model.webApplicationFirewallPolicyLink().id());
    }
}