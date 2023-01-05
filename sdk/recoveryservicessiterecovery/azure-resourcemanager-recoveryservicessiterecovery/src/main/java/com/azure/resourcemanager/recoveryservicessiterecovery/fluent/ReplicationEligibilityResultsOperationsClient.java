// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationEligibilityResultsCollectionInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationEligibilityResultsInner;

/**
 * An instance of this class provides access to all the operations defined in
 * ReplicationEligibilityResultsOperationsClient.
 */
public interface ReplicationEligibilityResultsOperationsClient {
    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results collection response model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReplicationEligibilityResultsCollectionInner> listWithResponse(
        String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results collection response model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplicationEligibilityResultsCollectionInner list(String resourceGroupName, String virtualMachineName);

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results response model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReplicationEligibilityResultsInner> getWithResponse(
        String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Gets the validation errors in case the VM is unsuitable for protection.
     *
     * <p>Validates whether a given VM can be protected or not in which case returns list of errors.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param virtualMachineName Virtual Machine name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication eligibility results response model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplicationEligibilityResultsInner get(String resourceGroupName, String virtualMachineName);
}