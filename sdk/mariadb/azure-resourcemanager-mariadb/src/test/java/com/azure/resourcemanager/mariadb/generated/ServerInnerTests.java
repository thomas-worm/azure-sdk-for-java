// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.ServerInner;
import com.azure.resourcemanager.mariadb.models.GeoRedundantBackup;
import com.azure.resourcemanager.mariadb.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.mariadb.models.PublicNetworkAccessEnum;
import com.azure.resourcemanager.mariadb.models.ServerState;
import com.azure.resourcemanager.mariadb.models.ServerVersion;
import com.azure.resourcemanager.mariadb.models.Sku;
import com.azure.resourcemanager.mariadb.models.SkuTier;
import com.azure.resourcemanager.mariadb.models.SslEnforcementEnum;
import com.azure.resourcemanager.mariadb.models.StorageAutogrow;
import com.azure.resourcemanager.mariadb.models.StorageProfile;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ServerInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerInner model =
            BinaryData
                .fromString(
                    "{\"sku\":{\"name\":\"s\",\"tier\":\"Basic\",\"capacity\":677804557,\"size\":\"yf\",\"family\":\"fogknygjofjdde\"},\"properties\":{\"administratorLogin\":\"deupewnwrei\",\"version\":\"10.2\",\"sslEnforcement\":\"Disabled\",\"minimalTlsVersion\":\"TLS1_2\",\"userVisibleState\":\"Dropping\",\"fullyQualifiedDomainName\":\"hmofc\",\"earliestRestoreDate\":\"2021-07-19T23:58:55Z\",\"storageProfile\":{\"backupRetentionDays\":1913554341,\"geoRedundantBackup\":\"Disabled\",\"storageMB\":1304880130,\"storageAutogrow\":\"Enabled\"},\"replicationRole\":\"he\",\"masterServerId\":\"k\",\"replicaCapacity\":1950851050,\"publicNetworkAccess\":\"Disabled\",\"privateEndpointConnections\":[{\"id\":\"mparcryuanzw\"}]},\"location\":\"zdxtayrlhmwhf\",\"tags\":{\"ryrtihfxtijbpzv\":\"qobmtukk\",\"zufcyzkohdbi\":\"nwzsymg\"},\"id\":\"anufhfcbjysag\",\"name\":\"th\",\"type\":\"qhabifpikxwcz\"}")
                .toObject(ServerInner.class);
        Assertions.assertEquals("zdxtayrlhmwhf", model.location());
        Assertions.assertEquals("qobmtukk", model.tags().get("ryrtihfxtijbpzv"));
        Assertions.assertEquals("s", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals(677804557, model.sku().capacity());
        Assertions.assertEquals("yf", model.sku().size());
        Assertions.assertEquals("fogknygjofjdde", model.sku().family());
        Assertions.assertEquals("deupewnwrei", model.administratorLogin());
        Assertions.assertEquals(ServerVersion.ONE_ZERO_TWO, model.version());
        Assertions.assertEquals(SslEnforcementEnum.DISABLED, model.sslEnforcement());
        Assertions.assertEquals(MinimalTlsVersionEnum.TLS1_2, model.minimalTlsVersion());
        Assertions.assertEquals(ServerState.DROPPING, model.userVisibleState());
        Assertions.assertEquals("hmofc", model.fullyQualifiedDomainName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-19T23:58:55Z"), model.earliestRestoreDate());
        Assertions.assertEquals(1913554341, model.storageProfile().backupRetentionDays());
        Assertions.assertEquals(GeoRedundantBackup.DISABLED, model.storageProfile().geoRedundantBackup());
        Assertions.assertEquals(1304880130, model.storageProfile().storageMB());
        Assertions.assertEquals(StorageAutogrow.ENABLED, model.storageProfile().storageAutogrow());
        Assertions.assertEquals("he", model.replicationRole());
        Assertions.assertEquals("k", model.masterServerId());
        Assertions.assertEquals(1950851050, model.replicaCapacity());
        Assertions.assertEquals(PublicNetworkAccessEnum.DISABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerInner model =
            new ServerInner()
                .withLocation("zdxtayrlhmwhf")
                .withTags(mapOf("ryrtihfxtijbpzv", "qobmtukk", "zufcyzkohdbi", "nwzsymg"))
                .withSku(
                    new Sku()
                        .withName("s")
                        .withTier(SkuTier.BASIC)
                        .withCapacity(677804557)
                        .withSize("yf")
                        .withFamily("fogknygjofjdde"))
                .withAdministratorLogin("deupewnwrei")
                .withVersion(ServerVersion.ONE_ZERO_TWO)
                .withSslEnforcement(SslEnforcementEnum.DISABLED)
                .withMinimalTlsVersion(MinimalTlsVersionEnum.TLS1_2)
                .withUserVisibleState(ServerState.DROPPING)
                .withFullyQualifiedDomainName("hmofc")
                .withEarliestRestoreDate(OffsetDateTime.parse("2021-07-19T23:58:55Z"))
                .withStorageProfile(
                    new StorageProfile()
                        .withBackupRetentionDays(1913554341)
                        .withGeoRedundantBackup(GeoRedundantBackup.DISABLED)
                        .withStorageMB(1304880130)
                        .withStorageAutogrow(StorageAutogrow.ENABLED))
                .withReplicationRole("he")
                .withMasterServerId("k")
                .withReplicaCapacity(1950851050)
                .withPublicNetworkAccess(PublicNetworkAccessEnum.DISABLED);
        model = BinaryData.fromObject(model).toObject(ServerInner.class);
        Assertions.assertEquals("zdxtayrlhmwhf", model.location());
        Assertions.assertEquals("qobmtukk", model.tags().get("ryrtihfxtijbpzv"));
        Assertions.assertEquals("s", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals(677804557, model.sku().capacity());
        Assertions.assertEquals("yf", model.sku().size());
        Assertions.assertEquals("fogknygjofjdde", model.sku().family());
        Assertions.assertEquals("deupewnwrei", model.administratorLogin());
        Assertions.assertEquals(ServerVersion.ONE_ZERO_TWO, model.version());
        Assertions.assertEquals(SslEnforcementEnum.DISABLED, model.sslEnforcement());
        Assertions.assertEquals(MinimalTlsVersionEnum.TLS1_2, model.minimalTlsVersion());
        Assertions.assertEquals(ServerState.DROPPING, model.userVisibleState());
        Assertions.assertEquals("hmofc", model.fullyQualifiedDomainName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-19T23:58:55Z"), model.earliestRestoreDate());
        Assertions.assertEquals(1913554341, model.storageProfile().backupRetentionDays());
        Assertions.assertEquals(GeoRedundantBackup.DISABLED, model.storageProfile().geoRedundantBackup());
        Assertions.assertEquals(1304880130, model.storageProfile().storageMB());
        Assertions.assertEquals(StorageAutogrow.ENABLED, model.storageProfile().storageAutogrow());
        Assertions.assertEquals("he", model.replicationRole());
        Assertions.assertEquals("k", model.masterServerId());
        Assertions.assertEquals(1950851050, model.replicaCapacity());
        Assertions.assertEquals(PublicNetworkAccessEnum.DISABLED, model.publicNetworkAccess());
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
