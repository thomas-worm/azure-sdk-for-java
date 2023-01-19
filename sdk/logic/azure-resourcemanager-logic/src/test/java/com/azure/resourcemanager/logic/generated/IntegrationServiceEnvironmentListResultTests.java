// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentInner;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentListResult;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentProperties;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSku;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuName;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentity;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.logic.models.WorkflowProvisioningState;
import com.azure.resourcemanager.logic.models.WorkflowState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationServiceEnvironmentListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationServiceEnvironmentListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Creating\",\"state\":\"Disabled\",\"integrationServiceEnvironmentId\":\"hqlyvijo\"},\"sku\":{\"name\":\"Developer\",\"capacity\":1624003781},\"identity\":{\"type\":\"None\",\"tenantId\":\"9ea88366-3ea4-4370-b154-828b4ec05063\",\"principalId\":\"cbe97528-b71f-41d1-9517-82220c1f0229\",\"userAssignedIdentities\":{}},\"location\":\"xrtikvcpwpgclr\",\"tags\":{\"frkenxpmyyefrp\":\"tso\",\"pqfrtqlkz\":\"pdnqqskawaoqvmmb\"},\"id\":\"egnitg\",\"name\":\"kxlzyqdrfeg\",\"type\":\"ealzxwhcansymoyq\"},{\"properties\":{\"provisioningState\":\"NotSpecified\",\"state\":\"Deleted\",\"integrationServiceEnvironmentId\":\"vbkbxgomf\"},\"sku\":{\"name\":\"NotSpecified\",\"capacity\":1901948402},\"identity\":{\"type\":\"None\",\"tenantId\":\"77738cbb-0480-4a1b-9554-fe268e166a8c\",\"principalId\":\"b7ea0c9e-174d-4ab5-850e-85a3a5a499a7\",\"userAssignedIdentities\":{}},\"location\":\"uxakjsqzhzbezk\",\"tags\":{\"vvjskgfmocwahp\":\"sidxasicdd\",\"eaahhvjhhn\":\"gat\",\"jjidjk\":\"kzyb\",\"vblbjednljlageua\":\"yxkyxvx\"},\"id\":\"lxunsmjbnkppxy\",\"name\":\"enlsvxeizzgwkln\",\"type\":\"rmffeyc\"}],\"nextLink\":\"ktp\"}")
                .toObject(IntegrationServiceEnvironmentListResult.class);
        Assertions.assertEquals("xrtikvcpwpgclr", model.value().get(0).location());
        Assertions.assertEquals("tso", model.value().get(0).tags().get("frkenxpmyyefrp"));
        Assertions
            .assertEquals(WorkflowProvisioningState.CREATING, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(WorkflowState.DISABLED, model.value().get(0).properties().state());
        Assertions.assertEquals("hqlyvijo", model.value().get(0).properties().integrationServiceEnvironmentId());
        Assertions.assertEquals(IntegrationServiceEnvironmentSkuName.DEVELOPER, model.value().get(0).sku().name());
        Assertions.assertEquals(1624003781, model.value().get(0).sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("ktp", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationServiceEnvironmentListResult model =
            new IntegrationServiceEnvironmentListResult()
                .withValue(
                    Arrays
                        .asList(
                            new IntegrationServiceEnvironmentInner()
                                .withLocation("xrtikvcpwpgclr")
                                .withTags(mapOf("frkenxpmyyefrp", "tso", "pqfrtqlkz", "pdnqqskawaoqvmmb"))
                                .withProperties(
                                    new IntegrationServiceEnvironmentProperties()
                                        .withProvisioningState(WorkflowProvisioningState.CREATING)
                                        .withState(WorkflowState.DISABLED)
                                        .withIntegrationServiceEnvironmentId("hqlyvijo"))
                                .withSku(
                                    new IntegrationServiceEnvironmentSku()
                                        .withName(IntegrationServiceEnvironmentSkuName.DEVELOPER)
                                        .withCapacity(1624003781))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf())),
                            new IntegrationServiceEnvironmentInner()
                                .withLocation("uxakjsqzhzbezk")
                                .withTags(
                                    mapOf(
                                        "vvjskgfmocwahp",
                                        "sidxasicdd",
                                        "eaahhvjhhn",
                                        "gat",
                                        "jjidjk",
                                        "kzyb",
                                        "vblbjednljlageua",
                                        "yxkyxvx"))
                                .withProperties(
                                    new IntegrationServiceEnvironmentProperties()
                                        .withProvisioningState(WorkflowProvisioningState.NOT_SPECIFIED)
                                        .withState(WorkflowState.DELETED)
                                        .withIntegrationServiceEnvironmentId("vbkbxgomf"))
                                .withSku(
                                    new IntegrationServiceEnvironmentSku()
                                        .withName(IntegrationServiceEnvironmentSkuName.NOT_SPECIFIED)
                                        .withCapacity(1901948402))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf()))))
                .withNextLink("ktp");
        model = BinaryData.fromObject(model).toObject(IntegrationServiceEnvironmentListResult.class);
        Assertions.assertEquals("xrtikvcpwpgclr", model.value().get(0).location());
        Assertions.assertEquals("tso", model.value().get(0).tags().get("frkenxpmyyefrp"));
        Assertions
            .assertEquals(WorkflowProvisioningState.CREATING, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(WorkflowState.DISABLED, model.value().get(0).properties().state());
        Assertions.assertEquals("hqlyvijo", model.value().get(0).properties().integrationServiceEnvironmentId());
        Assertions.assertEquals(IntegrationServiceEnvironmentSkuName.DEVELOPER, model.value().get(0).sku().name());
        Assertions.assertEquals(1624003781, model.value().get(0).sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("ktp", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}