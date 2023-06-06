// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.databricks.fluent.OutboundNetworkDependenciesEndpointsClient;
import com.azure.resourcemanager.databricks.fluent.models.OutboundEnvironmentEndpointInner;
import com.azure.resourcemanager.databricks.models.ErrorInfoException;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * OutboundNetworkDependenciesEndpointsClient.
 */
public final class OutboundNetworkDependenciesEndpointsClientImpl
    implements OutboundNetworkDependenciesEndpointsClient {
    /** The proxy service used to perform REST calls. */
    private final OutboundNetworkDependenciesEndpointsService service;

    /** The service client containing this operation class. */
    private final AzureDatabricksManagementClientImpl client;

    /**
     * Initializes an instance of OutboundNetworkDependenciesEndpointsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OutboundNetworkDependenciesEndpointsClientImpl(AzureDatabricksManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    OutboundNetworkDependenciesEndpointsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDatabricksManagementClientOutboundNetworkDependenciesEndpoints
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureDatabricksManag")
    public interface OutboundNetworkDependenciesEndpointsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Databricks/workspaces/{workspaceName}/outboundNetworkDependenciesEndpoints")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorInfoException.class)
        Mono<Response<List<OutboundEnvironmentEndpointInner>>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified Workspace.
     *
     * <p>Gets the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane. You must
     * configure outbound access with these endpoints. For more information, see
     * https://docs.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/udr.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorInfoException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<OutboundEnvironmentEndpointInner>>> listWithResponseAsync(
        String resourceGroupName, String workspaceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            workspaceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified Workspace.
     *
     * <p>Gets the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane. You must
     * configure outbound access with these endpoints. For more information, see
     * https://docs.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/udr.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorInfoException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<OutboundEnvironmentEndpointInner>>> listWithResponseAsync(
        String resourceGroupName, String workspaceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                workspaceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified Workspace.
     *
     * <p>Gets the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane. You must
     * configure outbound access with these endpoints. For more information, see
     * https://docs.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/udr.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorInfoException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<OutboundEnvironmentEndpointInner>> listAsync(String resourceGroupName, String workspaceName) {
        return listWithResponseAsync(resourceGroupName, workspaceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified Workspace.
     *
     * <p>Gets the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane. You must
     * configure outbound access with these endpoints. For more information, see
     * https://docs.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/udr.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorInfoException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<OutboundEnvironmentEndpointInner>> listWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        return listWithResponseAsync(resourceGroupName, workspaceName, context).block();
    }

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified Workspace.
     *
     * <p>Gets the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane. You must
     * configure outbound access with these endpoints. For more information, see
     * https://docs.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/udr.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorInfoException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<OutboundEnvironmentEndpointInner> list(String resourceGroupName, String workspaceName) {
        return listWithResponse(resourceGroupName, workspaceName, Context.NONE).getValue();
    }
}
