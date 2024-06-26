// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateLinkResourceInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"groupId\":\"awuwzdufypivls\",\"displayName\":\"jpmcub\",\"requiredMembers\":[\"foxx\",\"ubvphavpmhbrbqgv\",\"ovpbbttefjoknssq\",\"zqedikdfrdbi\"],\"requiredZoneNames\":[\"jgeihfqlggwfi\",\"zcxmjpbyep\"]},\"id\":\"gt\",\"name\":\"j\",\"type\":\"cmyfqipgxhnpo\"}")
            .toObject(PrivateLinkResourceInner.class);
        Assertions.assertEquals("gt", model.id());
        Assertions.assertEquals("j", model.name());
        Assertions.assertEquals("cmyfqipgxhnpo", model.type());
        Assertions.assertEquals("awuwzdufypivls", model.groupId());
        Assertions.assertEquals("jpmcub", model.displayName());
        Assertions.assertEquals("foxx", model.requiredMembers().get(0));
        Assertions.assertEquals("jgeihfqlggwfi", model.requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceInner model = new PrivateLinkResourceInner().withId("gt").withName("j")
            .withType("cmyfqipgxhnpo").withGroupId("awuwzdufypivls").withDisplayName("jpmcub")
            .withRequiredMembers(Arrays.asList("foxx", "ubvphavpmhbrbqgv", "ovpbbttefjoknssq", "zqedikdfrdbi"))
            .withRequiredZoneNames(Arrays.asList("jgeihfqlggwfi", "zcxmjpbyep"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceInner.class);
        Assertions.assertEquals("gt", model.id());
        Assertions.assertEquals("j", model.name());
        Assertions.assertEquals("cmyfqipgxhnpo", model.type());
        Assertions.assertEquals("awuwzdufypivls", model.groupId());
        Assertions.assertEquals("jpmcub", model.displayName());
        Assertions.assertEquals("foxx", model.requiredMembers().get(0));
        Assertions.assertEquals("jgeihfqlggwfi", model.requiredZoneNames().get(0));
    }
}
