// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated;

import com.azure.core.util.Context;

/** Samples for ServerAdministrators Delete. */
public final class ServerAdministratorsDeleteSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2017-12-01/examples/ServerAdminDelete.json
     */
    /**
     * Sample code: ServerAdministratorsDelete.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void serverAdministratorsDelete(com.azure.resourcemanager.mysql.MySqlManager manager) {
        manager.serverAdministrators().delete("testrg", "mysqltestsvc4", Context.NONE);
    }
}
