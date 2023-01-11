// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The failover deployment model. */
public final class FailoverDeploymentModel extends ExpandableStringEnum<FailoverDeploymentModel> {
    /** Static value NotApplicable for FailoverDeploymentModel. */
    public static final FailoverDeploymentModel NOT_APPLICABLE = fromString("NotApplicable");

    /** Static value Classic for FailoverDeploymentModel. */
    public static final FailoverDeploymentModel CLASSIC = fromString("Classic");

    /** Static value ResourceManager for FailoverDeploymentModel. */
    public static final FailoverDeploymentModel RESOURCE_MANAGER = fromString("ResourceManager");

    /**
     * Creates a new instance of FailoverDeploymentModel value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FailoverDeploymentModel() {
    }

    /**
     * Creates or finds a FailoverDeploymentModel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FailoverDeploymentModel.
     */
    @JsonCreator
    public static FailoverDeploymentModel fromString(String name) {
        return fromString(name, FailoverDeploymentModel.class);
    }

    /**
     * Gets known FailoverDeploymentModel values.
     *
     * @return known FailoverDeploymentModel values.
     */
    public static Collection<FailoverDeploymentModel> values() {
        return values(FailoverDeploymentModel.class);
    }
}
