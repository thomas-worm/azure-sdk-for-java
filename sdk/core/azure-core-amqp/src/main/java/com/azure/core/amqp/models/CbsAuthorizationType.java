// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

import com.azure.core.amqp.ClaimsBasedSecurityNode;
import com.azure.core.util.ExpandableStringEnum;

/**
 * An enumeration of supported authorization methods with the {@link ClaimsBasedSecurityNode}.
 */
public final class CbsAuthorizationType extends ExpandableStringEnum<CbsAuthorizationType> {
    /**
     * Creates a new instance of {@link CbsAuthorizationType} without a {@link #toString()} value.
     * <p>
     * This constructor shouldn't be called as it will produce a {@link CbsAuthorizationType} which doesn't have a
     * String enum value.
     *
     * @deprecated Use one of the constants or the {@link #fromString(String, Class)} factory method.
     */
    @Deprecated
    public CbsAuthorizationType() {
    }

    /**
     * Authorize with CBS through a shared access signature.
     */
    public static final CbsAuthorizationType SHARED_ACCESS_SIGNATURE
        = fromString("servicebus.windows.net:sastoken", CbsAuthorizationType.class);

    /**
     * Authorize with CBS using a JSON web token.
     * <p>
     * This is used in the case where Azure Active Directory is used for authentication and the authenticated user
     * wants to authorize with Azure Event Hubs.
     */
    public static final CbsAuthorizationType JSON_WEB_TOKEN = fromString("jwt", CbsAuthorizationType.class);
}
