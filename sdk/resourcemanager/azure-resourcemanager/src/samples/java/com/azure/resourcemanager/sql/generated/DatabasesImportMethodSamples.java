// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.ImportExistingDatabaseDefinition;
import com.azure.resourcemanager.sql.models.NetworkIsolationSettings;
import com.azure.resourcemanager.sql.models.StorageKeyType;

/** Samples for Databases ImportMethod. */
public final class DatabasesImportMethodSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ImportDatabase.json
     */
    /**
     * Sample code: Imports to an existing empty database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void importsToAnExistingEmptyDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .importMethod(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new ImportExistingDatabaseDefinition()
                    .withStorageKeyType(StorageKeyType.STORAGE_ACCESS_KEY)
                    .withStorageKey("fakeTokenPlaceholder")
                    .withStorageUri("https://test.blob.core.windows.net/test.bacpac")
                    .withAdministratorLogin("login")
                    .withAdministratorLoginPassword("fakeTokenPlaceholder")
                    .withAuthenticationType("Sql"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ImportDatabaseWithNetworkIsolation.json
     */
    /**
     * Sample code: Imports to an existing empty database, using private link to communicate with SQL server and storage
     * account.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void importsToAnExistingEmptyDatabaseUsingPrivateLinkToCommunicateWithSQLServerAndStorageAccount(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .importMethod(
                "Default-SQL-SouthEastAsia",
                "testsvr",
                "testdb",
                new ImportExistingDatabaseDefinition()
                    .withStorageKeyType(StorageKeyType.STORAGE_ACCESS_KEY)
                    .withStorageKey("fakeTokenPlaceholder")
                    .withStorageUri("https://test.blob.core.windows.net/test.bacpac")
                    .withAdministratorLogin("login")
                    .withAdministratorLoginPassword("fakeTokenPlaceholder")
                    .withAuthenticationType("Sql")
                    .withNetworkIsolation(
                        new NetworkIsolationSettings()
                            .withStorageAccountResourceId(
                                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Storage/storageAccounts/test-privatelink")
                            .withSqlServerResourceId(
                                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/testsvr")),
                Context.NONE);
    }
}
