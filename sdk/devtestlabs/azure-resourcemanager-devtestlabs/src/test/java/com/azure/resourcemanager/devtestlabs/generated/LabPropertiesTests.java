// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabProperties;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.LabAnnouncementProperties;
import com.azure.resourcemanager.devtestlabs.models.LabSupportProperties;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LabPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LabProperties model =
            BinaryData
                .fromString(
                    "{\"defaultStorageAccount\":\"i\",\"defaultPremiumStorageAccount\":\"thz\",\"artifactsStorageAccount\":\"qdrabhjybigehoqf\",\"premiumDataDiskStorageAccount\":\"wska\",\"vaultName\":\"ktzlcuiywg\",\"labStorageType\":\"Standard\",\"mandatoryArtifactsResourceIdsLinux\":[\"drvyn\",\"zgpphrcgyncocpe\",\"fvm\"],\"mandatoryArtifactsResourceIdsWindows\":[\"ofsx\"],\"createdDate\":\"2021-10-25T19:09:19Z\",\"premiumDataDisks\":\"Enabled\",\"environmentPermission\":\"Reader\",\"announcement\":{\"title\":\"qabcypm\",\"markdown\":\"kwlzuvccfwnfn\",\"enabled\":\"Enabled\",\"expirationDate\":\"2021-02-24T21:18:31Z\",\"expired\":true,\"provisioningState\":\"ebxetqgtzxdp\",\"uniqueIdentifier\":\"bqqwxrj\"},\"support\":{\"enabled\":\"Enabled\",\"markdown\":\"nwsubisnj\"},\"vmCreationResourceGroup\":\"pmng\",\"publicIpId\":\"scxaq\",\"loadBalancerId\":\"ochcbonqvpkvl\",\"networkSecurityGroupId\":\"njeaseipheofloke\",\"extendedProperties\":{\"jp\":\"enjbdlwtgrhp\",\"e\":\"umasxazjpq\",\"zvdudgwdslfhotwm\":\"ualhbxxhejj\"},\"provisioningState\":\"npwlbjnpg\",\"uniqueIdentifier\":\"ftadehxnltyfs\"}")
                .toObject(LabProperties.class);
        Assertions.assertEquals(StorageType.STANDARD, model.labStorageType());
        Assertions.assertEquals("drvyn", model.mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("ofsx", model.mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.ENABLED, model.premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, model.environmentPermission());
        Assertions.assertEquals("qabcypm", model.announcement().title());
        Assertions.assertEquals("kwlzuvccfwnfn", model.announcement().markdown());
        Assertions.assertEquals(EnableStatus.ENABLED, model.announcement().enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-24T21:18:31Z"), model.announcement().expirationDate());
        Assertions.assertEquals(true, model.announcement().expired());
        Assertions.assertEquals(EnableStatus.ENABLED, model.support().enabled());
        Assertions.assertEquals("nwsubisnj", model.support().markdown());
        Assertions.assertEquals("enjbdlwtgrhp", model.extendedProperties().get("jp"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LabProperties model =
            new LabProperties()
                .withLabStorageType(StorageType.STANDARD)
                .withMandatoryArtifactsResourceIdsLinux(Arrays.asList("drvyn", "zgpphrcgyncocpe", "fvm"))
                .withMandatoryArtifactsResourceIdsWindows(Arrays.asList("ofsx"))
                .withPremiumDataDisks(PremiumDataDisk.ENABLED)
                .withEnvironmentPermission(EnvironmentPermission.READER)
                .withAnnouncement(
                    new LabAnnouncementProperties()
                        .withTitle("qabcypm")
                        .withMarkdown("kwlzuvccfwnfn")
                        .withEnabled(EnableStatus.ENABLED)
                        .withExpirationDate(OffsetDateTime.parse("2021-02-24T21:18:31Z"))
                        .withExpired(true))
                .withSupport(new LabSupportProperties().withEnabled(EnableStatus.ENABLED).withMarkdown("nwsubisnj"))
                .withExtendedProperties(
                    mapOf("jp", "enjbdlwtgrhp", "e", "umasxazjpq", "zvdudgwdslfhotwm", "ualhbxxhejj"));
        model = BinaryData.fromObject(model).toObject(LabProperties.class);
        Assertions.assertEquals(StorageType.STANDARD, model.labStorageType());
        Assertions.assertEquals("drvyn", model.mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("ofsx", model.mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.ENABLED, model.premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, model.environmentPermission());
        Assertions.assertEquals("qabcypm", model.announcement().title());
        Assertions.assertEquals("kwlzuvccfwnfn", model.announcement().markdown());
        Assertions.assertEquals(EnableStatus.ENABLED, model.announcement().enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-24T21:18:31Z"), model.announcement().expirationDate());
        Assertions.assertEquals(true, model.announcement().expired());
        Assertions.assertEquals(EnableStatus.ENABLED, model.support().enabled());
        Assertions.assertEquals("nwsubisnj", model.support().markdown());
        Assertions.assertEquals("enjbdlwtgrhp", model.extendedProperties().get("jp"));
    }

    // Use "Map.of" if available
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
