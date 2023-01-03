// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.implementation;

import com.azure.resourcemanager.loadtesting.fluent.models.OperationInner;
import com.azure.resourcemanager.loadtesting.models.ActionType;
import com.azure.resourcemanager.loadtesting.models.Operation;
import com.azure.resourcemanager.loadtesting.models.OperationDisplay;
import com.azure.resourcemanager.loadtesting.models.Origin;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.loadtesting.LoadTestManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.loadtesting.LoadTestManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Origin origin() {
        return this.innerModel().origin();
    }

    public ActionType actionType() {
        return this.innerModel().actionType();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loadtesting.LoadTestManager manager() {
        return this.serviceManager;
    }
}