// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of the user. */
public final class UserType extends ExpandableStringEnum<UserType> {
    /** Static value Share for UserType. */
    public static final UserType SHARE = fromString("Share");

    /** Static value LocalManagement for UserType. */
    public static final UserType LOCAL_MANAGEMENT = fromString("LocalManagement");

    /** Static value ARM for UserType. */
    public static final UserType ARM = fromString("ARM");

    /**
     * Creates a new instance of UserType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UserType() {
    }

    /**
     * Creates or finds a UserType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UserType.
     */
    @JsonCreator
    public static UserType fromString(String name) {
        return fromString(name, UserType.class);
    }

    /**
     * Gets known UserType values.
     *
     * @return known UserType values.
     */
    public static Collection<UserType> values() {
        return values(UserType.class);
    }
}
