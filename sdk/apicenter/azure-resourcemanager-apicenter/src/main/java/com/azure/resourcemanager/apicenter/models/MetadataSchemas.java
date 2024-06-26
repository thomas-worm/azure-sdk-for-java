// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of MetadataSchemas.
 */
public interface MetadataSchemas {
    /**
     * Returns a collection of metadata schemas.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MetadataSchema list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MetadataSchema> list(String resourceGroupName, String serviceName);

    /**
     * Returns a collection of metadata schemas.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param filter OData filter parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MetadataSchema list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MetadataSchema> list(String resourceGroupName, String serviceName, String filter, Context context);

    /**
     * Returns details of the metadata schema.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param metadataSchemaName The name of the metadata schema.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata schema entity.
     */
    Response<MetadataSchema> getWithResponse(String resourceGroupName, String serviceName, String metadataSchemaName,
        Context context);

    /**
     * Returns details of the metadata schema.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param metadataSchemaName The name of the metadata schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata schema entity.
     */
    MetadataSchema get(String resourceGroupName, String serviceName, String metadataSchemaName);

    /**
     * Deletes specified metadata schema.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param metadataSchemaName The name of the metadata schema.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String metadataSchemaName,
        Context context);

    /**
     * Deletes specified metadata schema.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param metadataSchemaName The name of the metadata schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String metadataSchemaName);

    /**
     * Checks if specified metadata schema exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param metadataSchemaName The name of the metadata schema.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> headWithResponse(String resourceGroupName, String serviceName, String metadataSchemaName,
        Context context);

    /**
     * Checks if specified metadata schema exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param metadataSchemaName The name of the metadata schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head(String resourceGroupName, String serviceName, String metadataSchemaName);

    /**
     * Returns details of the metadata schema.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata schema entity.
     */
    MetadataSchema getById(String id);

    /**
     * Returns details of the metadata schema.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata schema entity.
     */
    Response<MetadataSchema> getByIdWithResponse(String id, Context context);

    /**
     * Deletes specified metadata schema.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes specified metadata schema.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MetadataSchema resource.
     * 
     * @param name resource name.
     * @return the first stage of the new MetadataSchema definition.
     */
    MetadataSchema.DefinitionStages.Blank define(String name);
}
