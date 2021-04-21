// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.implementation.ContainerRegistriesImpl;
import com.azure.containers.containerregistry.implementation.ContainerRegistryImpl;
import com.azure.containers.containerregistry.implementation.ContainerRegistryImplBuilder;
import com.azure.containers.containerregistry.models.DeleteRepositoryResult;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * Initializes a new instance of the asynchronous ContainerRegistry type.
 */
@ServiceClient(builder = ContainerRegistryClientBuilder.class, isAsync = true)
public final class ContainerRegistryAsyncClient {
    private final ContainerRegistryImpl registryImplClient;
    private final ContainerRegistriesImpl registriesImplClient;
    private final HttpPipeline httpPipeline;
    private final String endpoint;
    private final String apiVersion;

    private final ClientLogger logger = new ClientLogger(ContainerRegistryAsyncClient.class);

    ContainerRegistryAsyncClient(HttpPipeline httpPipeline, String endpoint, String version) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.registryImplClient = new ContainerRegistryImplBuilder()
            .url(endpoint)
            .pipeline(httpPipeline)
            .buildClient();
        this.registriesImplClient = this.registryImplClient.getContainerRegistries();
        this.apiVersion = version;
    }

    /**
     * List all the repository names in this registry.
     *
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @return list of repository names.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> listRepositories() {
        return new PagedFlux<>(
            (pageSize) -> withContext(context -> listRepositoriesSinglePageAsync(pageSize, context)),
            (token, pageSize) -> withContext(context -> listRepositoriesNextSinglePageAsync(token, context)));
    }

    PagedFlux<String> listRepositories(Context context) {
        return new PagedFlux<>(
            (pageSize) -> listRepositoriesSinglePageAsync(pageSize, context),
            (token, pageSize) -> listRepositoriesNextSinglePageAsync(token, context));
    }

    Mono<PagedResponse<String>> listRepositoriesSinglePageAsync(Integer pageSize, Context context) {
        try {
            if (pageSize != null && pageSize < 0) {
                return monoError(logger, new IllegalArgumentException("'pageSize' cannot be negative."));
            }

            Mono<PagedResponse<String>> pagedResponseMono = this.registriesImplClient.getRepositoriesSinglePageAsync(null, pageSize, context)
                .map(res -> Utils.getPagedResponseWithContinuationToken(res))
                .onErrorMap(Utils::mapException);
            return pagedResponseMono;

        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    Mono<PagedResponse<String>> listRepositoriesNextSinglePageAsync(String nextLink, Context context) {
        try {
            Mono<PagedResponse<String>> pagedResponseMono = this.registriesImplClient.getRepositoriesNextSinglePageAsync(nextLink, context);
            return pagedResponseMono.map(res -> Utils.getPagedResponseWithContinuationToken(res));
        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    /**
     * Delete the repository identified by 'name'.
     *
     * @param name Name of the repository (including the namespace).
     * @return deleted repository properties.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given name was not found.
     * @throws NullPointerException thrown if the name is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DeleteRepositoryResult>> deleteRepositoryWithResponse(String name) {
        return withContext(context -> deleteRepositoryWithResponse(name, context));
    }

    Mono<Response<DeleteRepositoryResult>> deleteRepositoryWithResponse(String name, Context context) {
        try {
            if (name == null) {
                return monoError(logger, new NullPointerException("'name' cannot be null."));
            }

            return this.registriesImplClient.deleteRepositoryWithResponseAsync(name, context)
                .onErrorMap(Utils::mapException);

        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    /**
     * Delete the repository identified by 'name'.
     *
     * @param name Name of the image (including the namespace).
     * @return deleted repository properties.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws ResourceNotFoundException thrown if the given name was not found.
     * @throws NullPointerException thrown if the name is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeleteRepositoryResult> deleteRepository(String name) {
        return withContext(context -> this.deleteRepository(name, context));
    }

    Mono<DeleteRepositoryResult> deleteRepository(String name, Context context) {
        return this.deleteRepositoryWithResponse(name, context).map(Response::getValue);
    }

    /**
     * Get an instance of repository client from the registry client.
     *
     * @param repository Name of the repository (including the namespace).
     * @return repository client.
     */
    public ContainerRepositoryAsyncClient getRepositoryClient(String repository) {
        return new ContainerRepositoryAsyncClient(repository, httpPipeline, endpoint, apiVersion);
    }
}
