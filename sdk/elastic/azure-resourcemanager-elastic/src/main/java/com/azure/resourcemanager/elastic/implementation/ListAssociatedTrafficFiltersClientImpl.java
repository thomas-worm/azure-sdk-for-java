// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.elastic.fluent.ListAssociatedTrafficFiltersClient;
import com.azure.resourcemanager.elastic.fluent.models.ElasticTrafficFilterResponseInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ListAssociatedTrafficFiltersClient. */
public final class ListAssociatedTrafficFiltersClientImpl implements ListAssociatedTrafficFiltersClient {
    /** The proxy service used to perform REST calls. */
    private final ListAssociatedTrafficFiltersService service;

    /** The service client containing this operation class. */
    private final MicrosoftElasticImpl client;

    /**
     * Initializes an instance of ListAssociatedTrafficFiltersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ListAssociatedTrafficFiltersClientImpl(MicrosoftElasticImpl client) {
        this.service =
            RestProxy
                .create(
                    ListAssociatedTrafficFiltersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftElasticListAssociatedTrafficFilters to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftElasticList")
    public interface ListAssociatedTrafficFiltersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Elastic/monitors"
                + "/{monitorName}/listAssociatedTrafficFilters")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ElasticTrafficFilterResponseInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("monitorName") String monitorName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the list of all associated traffic filters for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of all associated traffic filters for the given deployment along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ElasticTrafficFilterResponseInner>> listWithResponseAsync(
        String resourceGroupName, String monitorName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            monitorName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the list of all associated traffic filters for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of all associated traffic filters for the given deployment along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ElasticTrafficFilterResponseInner>> listWithResponseAsync(
        String resourceGroupName, String monitorName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (monitorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter monitorName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                monitorName,
                accept,
                context);
    }

    /**
     * Get the list of all associated traffic filters for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of all associated traffic filters for the given deployment on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ElasticTrafficFilterResponseInner> listAsync(String resourceGroupName, String monitorName) {
        return listWithResponseAsync(resourceGroupName, monitorName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the list of all associated traffic filters for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of all associated traffic filters for the given deployment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ElasticTrafficFilterResponseInner> listWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        return listWithResponseAsync(resourceGroupName, monitorName, context).block();
    }

    /**
     * Get the list of all associated traffic filters for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of all associated traffic filters for the given deployment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ElasticTrafficFilterResponseInner list(String resourceGroupName, String monitorName) {
        return listWithResponse(resourceGroupName, monitorName, Context.NONE).getValue();
    }
}