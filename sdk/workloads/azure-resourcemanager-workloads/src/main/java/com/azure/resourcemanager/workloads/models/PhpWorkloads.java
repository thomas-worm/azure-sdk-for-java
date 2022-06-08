// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PhpWorkloads. */
public interface PhpWorkloads {
    /**
     * Lists PHP workload resources for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PhpWorkloadResource> list();

    /**
     * Lists PHP workload resources for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PhpWorkloadResource> list(Context context);

    /**
     * Lists PHP workload resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PhpWorkloadResource> listByResourceGroup(String resourceGroupName);

    /**
     * Lists PHP workload resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return php workload resource list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PhpWorkloadResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PHP workload resource.
     */
    PhpWorkloadResource getByResourceGroup(String resourceGroupName, String phpWorkloadName);

    /**
     * Gets the PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PHP workload resource along with {@link Response}.
     */
    Response<PhpWorkloadResource> getByResourceGroupWithResponse(
        String resourceGroupName, String phpWorkloadName, Context context);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param deleteInfra Whether to delete infra along with workload resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String phpWorkloadName, String deleteInfra);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String phpWorkloadName);

    /**
     * Delete PHP workload resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param phpWorkloadName Php workload name.
     * @param deleteInfra Whether to delete infra along with workload resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String phpWorkloadName, String deleteInfra, Context context);

    /**
     * Gets the PHP workload resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PHP workload resource along with {@link Response}.
     */
    PhpWorkloadResource getById(String id);

    /**
     * Gets the PHP workload resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PHP workload resource along with {@link Response}.
     */
    Response<PhpWorkloadResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete PHP workload resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete PHP workload resource.
     *
     * @param id the resource ID.
     * @param deleteInfra Whether to delete infra along with workload resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, String deleteInfra, Context context);

    /**
     * Begins definition for a new PhpWorkloadResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new PhpWorkloadResource definition.
     */
    PhpWorkloadResource.DefinitionStages.Blank define(String name);
}
