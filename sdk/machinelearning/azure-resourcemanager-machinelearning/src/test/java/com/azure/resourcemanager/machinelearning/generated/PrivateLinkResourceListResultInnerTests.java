// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.PrivateLinkResource;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourceListResultInnerTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResourceListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"c\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"identity\":{\"principalId\":\"56c10707-d26e-4972-b340-ba7237c5c641\",\"tenantId\":\"f3b9487a-a146-4e03-b969-6c9b2522dabd\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"location\":\"jkbegibtnmxiebww\",\"tags\":{\"tzjuzgwyzmhtxo\":\"ayqcgw\",\"nftguvriuhpr\":\"gmtsavjcbpwxqpsr\"},\"sku\":{\"name\":\"dyvxqtayriww\",\"tier\":\"Premium\",\"size\":\"bexrmcq\",\"family\":\"ycnojvknmefqsg\",\"capacity\":488274582},\"id\":\"apj\",\"name\":\"zhpvgqzcjrvxd\",\"type\":\"zlmwlxkvugfhz\"},{\"properties\":{\"groupId\":\"wjvzunluthnn\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"identity\":{\"principalId\":\"3cc330b5-3255-4ba2-a115-59e53a418761\",\"tenantId\":\"3678eda4-8264-4ccb-8cba-d5f55cda385c\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"pjzu\",\"tags\":{\"kzbbtd\":\"xdult\",\"bsjyofdx\":\"umveekgpwozuhkf\",\"oekqvk\":\"uusdttouwa\",\"vbxwyjsflhh\":\"lns\"},\"sku\":{\"name\":\"aln\",\"tier\":\"Premium\",\"size\":\"sxyawjoyaqcs\",\"family\":\"jpkiidzyexznelix\",\"capacity\":705550222},\"id\":\"tfolhbnx\",\"name\":\"nalaulppg\",\"type\":\"dtpnapnyiropuhp\"},{\"properties\":{\"groupId\":\"pgylg\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"identity\":{\"principalId\":\"32dee77e-4a3a-430b-9d66-fc1dc9be82c0\",\"tenantId\":\"3dcc36e2-21ba-4cea-8df9-16a4204532f4\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"v\",\"tags\":{\"rmgucnap\":\"ynqwwncwzzhxgk\",\"oellwp\":\"t\",\"qrhhu\":\"fdygpfqbuaceopz\"},\"sku\":{\"name\":\"pppcqeqxo\",\"tier\":\"Standard\",\"size\":\"hzxct\",\"family\":\"gbkdmoizpos\",\"capacity\":1176728044},\"id\":\"cfbu\",\"name\":\"rmfqjhhkxbpvj\",\"type\":\"mjh\"}]}")
                .toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("jkbegibtnmxiebww", model.value().get(0).location());
        Assertions.assertEquals("ayqcgw", model.value().get(0).tags().get("tzjuzgwyzmhtxo"));
        Assertions.assertEquals("dyvxqtayriww", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.value().get(0).sku().tier());
        Assertions.assertEquals("bexrmcq", model.value().get(0).sku().size());
        Assertions.assertEquals("ycnojvknmefqsg", model.value().get(0).sku().family());
        Assertions.assertEquals(488274582, model.value().get(0).sku().capacity());
    }

    @Test
    public void testSerialize() {
        PrivateLinkResourceListResultInner model =
            new PrivateLinkResourceListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResource()
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.NONE)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("jkbegibtnmxiebww")
                                .withTags(mapOf("tzjuzgwyzmhtxo", "ayqcgw", "nftguvriuhpr", "gmtsavjcbpwxqpsr"))
                                .withSku(
                                    new Sku()
                                        .withName("dyvxqtayriww")
                                        .withTier(SkuTier.PREMIUM)
                                        .withSize("bexrmcq")
                                        .withFamily("ycnojvknmefqsg")
                                        .withCapacity(488274582))
                                .withRequiredZoneNames(Arrays.asList()),
                            new PrivateLinkResource()
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("pjzu")
                                .withTags(
                                    mapOf(
                                        "kzbbtd",
                                        "xdult",
                                        "bsjyofdx",
                                        "umveekgpwozuhkf",
                                        "oekqvk",
                                        "uusdttouwa",
                                        "vbxwyjsflhh",
                                        "lns"))
                                .withSku(
                                    new Sku()
                                        .withName("aln")
                                        .withTier(SkuTier.PREMIUM)
                                        .withSize("sxyawjoyaqcs")
                                        .withFamily("jpkiidzyexznelix")
                                        .withCapacity(705550222))
                                .withRequiredZoneNames(Arrays.asList()),
                            new PrivateLinkResource()
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withLocation("v")
                                .withTags(
                                    mapOf("rmgucnap", "ynqwwncwzzhxgk", "oellwp", "t", "qrhhu", "fdygpfqbuaceopz"))
                                .withSku(
                                    new Sku()
                                        .withName("pppcqeqxo")
                                        .withTier(SkuTier.STANDARD)
                                        .withSize("hzxct")
                                        .withFamily("gbkdmoizpos")
                                        .withCapacity(1176728044))
                                .withRequiredZoneNames(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("jkbegibtnmxiebww", model.value().get(0).location());
        Assertions.assertEquals("ayqcgw", model.value().get(0).tags().get("tzjuzgwyzmhtxo"));
        Assertions.assertEquals("dyvxqtayriww", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.value().get(0).sku().tier());
        Assertions.assertEquals("bexrmcq", model.value().get(0).sku().size());
        Assertions.assertEquals("ycnojvknmefqsg", model.value().get(0).sku().family());
        Assertions.assertEquals(488274582, model.value().get(0).sku().capacity());
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