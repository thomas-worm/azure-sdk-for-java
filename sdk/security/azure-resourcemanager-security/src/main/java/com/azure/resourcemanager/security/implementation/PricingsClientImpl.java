// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.security.fluent.PricingsClient;
import com.azure.resourcemanager.security.fluent.models.PricingInner;
import com.azure.resourcemanager.security.fluent.models.PricingListInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PricingsClient.
 */
public final class PricingsClientImpl implements PricingsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PricingsService service;

    /**
     * The service client containing this operation class.
     */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of PricingsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    PricingsClientImpl(SecurityCenterImpl client) {
        this.service = RestProxy.create(PricingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterPricings to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterPricin")
    public interface PricingsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/{scopeId}/providers/Microsoft.Security/pricings/{pricingName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PricingInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam(value = "scopeId", encoded = true) String scopeId,
            @PathParam("pricingName") String pricingName, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/{scopeId}/providers/Microsoft.Security/pricings/{pricingName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PricingInner>> update(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam(value = "scopeId", encoded = true) String scopeId,
            @PathParam("pricingName") String pricingName, @BodyParam("application/json") PricingInner pricing,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/{scopeId}/providers/Microsoft.Security/pricings/{pricingName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scopeId", encoded = true) String scopeId, @PathParam("pricingName") String pricingName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/{scopeId}/providers/Microsoft.Security/pricings")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PricingListInner>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam(value = "scopeId", encoded = true) String scopeId,
            @QueryParam("$filter") String filter, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id). At the resource level, supported resource types are 'VirtualMachines, VMSS and ARC Machines'.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id) along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PricingInner>> getWithResponseAsync(String scopeId, String pricingName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        if (pricingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricingName is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getEndpoint(), apiVersion, scopeId, pricingName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id). At the resource level, supported resource types are 'VirtualMachines, VMSS and ARC Machines'.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id) along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PricingInner>> getWithResponseAsync(String scopeId, String pricingName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        if (pricingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricingName is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), apiVersion, scopeId, pricingName, accept, context);
    }

    /**
     * Get the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id). At the resource level, supported resource types are 'VirtualMachines, VMSS and ARC Machines'.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id) on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PricingInner> getAsync(String scopeId, String pricingName) {
        return getWithResponseAsync(scopeId, pricingName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id). At the resource level, supported resource types are 'VirtualMachines, VMSS and ARC Machines'.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id) along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PricingInner> getWithResponse(String scopeId, String pricingName, Context context) {
        return getWithResponseAsync(scopeId, pricingName, context).block();
    }

    /**
     * Get the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id). At the resource level, supported resource types are 'VirtualMachines, VMSS and ARC Machines'.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Defender plans pricing configurations of the selected scope (valid scopes are resource id or a
     * subscription id).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PricingInner get(String scopeId, String pricingName) {
        return getWithResponse(scopeId, pricingName, Context.NONE).getValue();
    }

    /**
     * Updates a provided Microsoft Defender for Cloud pricing configuration in the scope. Valid scopes are:
     * subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and ARC Machines' and
     * only for plan='VirtualMachines' and subPlan='P1').
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @param pricing Pricing object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return microsoft Defender for Cloud is provided in two pricing tiers: free and standard along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PricingInner>> updateWithResponseAsync(String scopeId, String pricingName,
        PricingInner pricing) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        if (pricingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricingName is required and cannot be null."));
        }
        if (pricing == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricing is required and cannot be null."));
        } else {
            pricing.validate();
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.update(this.client.getEndpoint(), apiVersion, scopeId, pricingName, pricing,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates a provided Microsoft Defender for Cloud pricing configuration in the scope. Valid scopes are:
     * subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and ARC Machines' and
     * only for plan='VirtualMachines' and subPlan='P1').
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @param pricing Pricing object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return microsoft Defender for Cloud is provided in two pricing tiers: free and standard along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PricingInner>> updateWithResponseAsync(String scopeId, String pricingName,
        PricingInner pricing, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        if (pricingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricingName is required and cannot be null."));
        }
        if (pricing == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricing is required and cannot be null."));
        } else {
            pricing.validate();
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), apiVersion, scopeId, pricingName, pricing, accept, context);
    }

    /**
     * Updates a provided Microsoft Defender for Cloud pricing configuration in the scope. Valid scopes are:
     * subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and ARC Machines' and
     * only for plan='VirtualMachines' and subPlan='P1').
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @param pricing Pricing object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return microsoft Defender for Cloud is provided in two pricing tiers: free and standard on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PricingInner> updateAsync(String scopeId, String pricingName, PricingInner pricing) {
        return updateWithResponseAsync(scopeId, pricingName, pricing).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates a provided Microsoft Defender for Cloud pricing configuration in the scope. Valid scopes are:
     * subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and ARC Machines' and
     * only for plan='VirtualMachines' and subPlan='P1').
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @param pricing Pricing object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return microsoft Defender for Cloud is provided in two pricing tiers: free and standard along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PricingInner> updateWithResponse(String scopeId, String pricingName, PricingInner pricing,
        Context context) {
        return updateWithResponseAsync(scopeId, pricingName, pricing, context).block();
    }

    /**
     * Updates a provided Microsoft Defender for Cloud pricing configuration in the scope. Valid scopes are:
     * subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and ARC Machines' and
     * only for plan='VirtualMachines' and subPlan='P1').
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param pricingName name of the pricing configuration.
     * @param pricing Pricing object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return microsoft Defender for Cloud is provided in two pricing tiers: free and standard.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PricingInner update(String scopeId, String pricingName, PricingInner pricing) {
        return updateWithResponse(scopeId, pricingName, pricing, Context.NONE).getValue();
    }

    /**
     * Deletes a provided Microsoft Defender for Cloud pricing configuration in a specific resource. Valid only for
     * resource scope (Supported resources are: 'VirtualMachines, VMSS and ARC MachinesS').
     * 
     * @param scopeId The identifier of the resource, (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}).
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String scopeId, String pricingName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        if (pricingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricingName is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.delete(this.client.getEndpoint(), apiVersion, scopeId, pricingName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes a provided Microsoft Defender for Cloud pricing configuration in a specific resource. Valid only for
     * resource scope (Supported resources are: 'VirtualMachines, VMSS and ARC MachinesS').
     * 
     * @param scopeId The identifier of the resource, (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}).
     * @param pricingName name of the pricing configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String scopeId, String pricingName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        if (pricingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pricingName is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), apiVersion, scopeId, pricingName, accept, context);
    }

    /**
     * Deletes a provided Microsoft Defender for Cloud pricing configuration in a specific resource. Valid only for
     * resource scope (Supported resources are: 'VirtualMachines, VMSS and ARC MachinesS').
     * 
     * @param scopeId The identifier of the resource, (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}).
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String scopeId, String pricingName) {
        return deleteWithResponseAsync(scopeId, pricingName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes a provided Microsoft Defender for Cloud pricing configuration in a specific resource. Valid only for
     * resource scope (Supported resources are: 'VirtualMachines, VMSS and ARC MachinesS').
     * 
     * @param scopeId The identifier of the resource, (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}).
     * @param pricingName name of the pricing configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String scopeId, String pricingName, Context context) {
        return deleteWithResponseAsync(scopeId, pricingName, context).block();
    }

    /**
     * Deletes a provided Microsoft Defender for Cloud pricing configuration in a specific resource. Valid only for
     * resource scope (Supported resources are: 'VirtualMachines, VMSS and ARC MachinesS').
     * 
     * @param scopeId The identifier of the resource, (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}).
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String scopeId, String pricingName) {
        deleteWithResponse(scopeId, pricingName, Context.NONE);
    }

    /**
     * Lists Microsoft Defender for Cloud pricing configurations of the scopeId, that match the optional given $filter.
     * Valid scopes are: subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and
     * ARC Machines'). Valid $filter is: 'name in ({planName1},{planName2},...)'. If $filter is not provided, the
     * unfiltered list will be returned. If '$filter=name in (planName1,planName2)' is provided, the returned list
     * includes the pricings set for 'planName1' and 'planName2' only.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param filter OData filter. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of pricing configurations response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PricingListInner>> listWithResponseAsync(String scopeId, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), apiVersion, scopeId, filter, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists Microsoft Defender for Cloud pricing configurations of the scopeId, that match the optional given $filter.
     * Valid scopes are: subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and
     * ARC Machines'). Valid $filter is: 'name in ({planName1},{planName2},...)'. If $filter is not provided, the
     * unfiltered list will be returned. If '$filter=name in (planName1,planName2)' is provided, the returned list
     * includes the pricings set for 'planName1' and 'planName2' only.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of pricing configurations response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PricingListInner>> listWithResponseAsync(String scopeId, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scopeId == null) {
            return Mono.error(new IllegalArgumentException("Parameter scopeId is required and cannot be null."));
        }
        final String apiVersion = "2024-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), apiVersion, scopeId, filter, accept, context);
    }

    /**
     * Lists Microsoft Defender for Cloud pricing configurations of the scopeId, that match the optional given $filter.
     * Valid scopes are: subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and
     * ARC Machines'). Valid $filter is: 'name in ({planName1},{planName2},...)'. If $filter is not provided, the
     * unfiltered list will be returned. If '$filter=name in (planName1,planName2)' is provided, the returned list
     * includes the pricings set for 'planName1' and 'planName2' only.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of pricing configurations response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PricingListInner> listAsync(String scopeId) {
        final String filter = null;
        return listWithResponseAsync(scopeId, filter).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Lists Microsoft Defender for Cloud pricing configurations of the scopeId, that match the optional given $filter.
     * Valid scopes are: subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and
     * ARC Machines'). Valid $filter is: 'name in ({planName1},{planName2},...)'. If $filter is not provided, the
     * unfiltered list will be returned. If '$filter=name in (planName1,planName2)' is provided, the returned list
     * includes the pricings set for 'planName1' and 'planName2' only.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of pricing configurations response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PricingListInner> listWithResponse(String scopeId, String filter, Context context) {
        return listWithResponseAsync(scopeId, filter, context).block();
    }

    /**
     * Lists Microsoft Defender for Cloud pricing configurations of the scopeId, that match the optional given $filter.
     * Valid scopes are: subscription id or a specific resource id (Supported resources are: 'VirtualMachines, VMSS and
     * ARC Machines'). Valid $filter is: 'name in ({planName1},{planName2},...)'. If $filter is not provided, the
     * unfiltered list will be returned. If '$filter=name in (planName1,planName2)' is provided, the returned list
     * includes the pricings set for 'planName1' and 'planName2' only.
     * 
     * @param scopeId The scope id of the pricing. Valid scopes are: subscription (format:
     * 'subscriptions/{subscriptionId}'), or a specific resource (format:
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName})
     * - Supported resources are (VirtualMachines).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of pricing configurations response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PricingListInner list(String scopeId) {
        final String filter = null;
        return listWithResponse(scopeId, filter, Context.NONE).getValue();
    }
}
