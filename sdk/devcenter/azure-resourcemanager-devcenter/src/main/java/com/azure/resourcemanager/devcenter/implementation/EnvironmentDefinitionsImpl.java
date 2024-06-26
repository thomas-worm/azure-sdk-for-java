// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devcenter.fluent.EnvironmentDefinitionsClient;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogResourceValidationErrorDetailsInner;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentDefinitionInner;
import com.azure.resourcemanager.devcenter.models.CatalogResourceValidationErrorDetails;
import com.azure.resourcemanager.devcenter.models.EnvironmentDefinition;
import com.azure.resourcemanager.devcenter.models.EnvironmentDefinitions;

public final class EnvironmentDefinitionsImpl implements EnvironmentDefinitions {
    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentDefinitionsImpl.class);

    private final EnvironmentDefinitionsClient innerClient;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    public EnvironmentDefinitionsImpl(
        EnvironmentDefinitionsClient innerClient, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EnvironmentDefinition> listByCatalog(
        String resourceGroupName, String devCenterName, String catalogName) {
        PagedIterable<EnvironmentDefinitionInner> inner =
            this.serviceClient().listByCatalog(resourceGroupName, devCenterName, catalogName);
        return Utils.mapPage(inner, inner1 -> new EnvironmentDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<EnvironmentDefinition> listByCatalog(
        String resourceGroupName, String devCenterName, String catalogName, Integer top, Context context) {
        PagedIterable<EnvironmentDefinitionInner> inner =
            this.serviceClient().listByCatalog(resourceGroupName, devCenterName, catalogName, top, context);
        return Utils.mapPage(inner, inner1 -> new EnvironmentDefinitionImpl(inner1, this.manager()));
    }

    public Response<EnvironmentDefinition> getWithResponse(
        String resourceGroupName,
        String devCenterName,
        String catalogName,
        String environmentDefinitionName,
        Context context) {
        Response<EnvironmentDefinitionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, devCenterName, catalogName, environmentDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EnvironmentDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EnvironmentDefinition get(
        String resourceGroupName, String devCenterName, String catalogName, String environmentDefinitionName) {
        EnvironmentDefinitionInner inner =
            this.serviceClient().get(resourceGroupName, devCenterName, catalogName, environmentDefinitionName);
        if (inner != null) {
            return new EnvironmentDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CatalogResourceValidationErrorDetails> getErrorDetailsWithResponse(
        String resourceGroupName,
        String devCenterName,
        String catalogName,
        String environmentDefinitionName,
        Context context) {
        Response<CatalogResourceValidationErrorDetailsInner> inner =
            this
                .serviceClient()
                .getErrorDetailsWithResponse(
                    resourceGroupName, devCenterName, catalogName, environmentDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CatalogResourceValidationErrorDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CatalogResourceValidationErrorDetails getErrorDetails(
        String resourceGroupName, String devCenterName, String catalogName, String environmentDefinitionName) {
        CatalogResourceValidationErrorDetailsInner inner =
            this
                .serviceClient()
                .getErrorDetails(resourceGroupName, devCenterName, catalogName, environmentDefinitionName);
        if (inner != null) {
            return new CatalogResourceValidationErrorDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private EnvironmentDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}
