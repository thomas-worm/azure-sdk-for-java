// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.SecretInner;
import java.util.Map;

/** An immutable client-side representation of Secret. */
public interface Secret {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the value property: The value of the secret for secret creation.
     *
     * @return the value value.
     */
    String value();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.SecretInner object.
     *
     * @return the inner object.
     */
    SecretInner innerModel();

    /** The entirety of the Secret definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }

    /** The Secret definition stages. */
    interface DefinitionStages {
        /** The first stage of the Secret definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the Secret definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /** The stage of the Secret definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName, username.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labName The name of the lab.
             * @param username The name of the user profile.
             * @return the next definition stage.
             */
            WithCreate withExistingUser(String resourceGroupName, String labName, String username);
        }

        /**
         * The stage of the Secret definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithValue {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Secret create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Secret create(Context context);
        }

        /** The stage of the Secret definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the Secret definition allowing to specify value. */
        interface WithValue {
            /**
             * Specifies the value property: The value of the secret for secret creation..
             *
             * @param value The value of the secret for secret creation.
             * @return the next definition stage.
             */
            WithCreate withValue(String value);
        }
    }

    /**
     * Begins update for the Secret resource.
     *
     * @return the stage of resource update.
     */
    Secret.Update update();

    /** The template for Secret update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Secret apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Secret apply(Context context);
    }

    /** The Secret update stages. */
    interface UpdateStages {
        /** The stage of the Secret update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             *
             * @param tags The tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Secret refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Secret refresh(Context context);
}
