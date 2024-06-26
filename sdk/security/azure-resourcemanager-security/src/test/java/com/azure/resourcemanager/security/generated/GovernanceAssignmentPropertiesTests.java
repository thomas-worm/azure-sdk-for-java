// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GovernanceAssignmentProperties;
import com.azure.resourcemanager.security.models.GovernanceAssignmentAdditionalData;
import com.azure.resourcemanager.security.models.GovernanceEmailNotification;
import com.azure.resourcemanager.security.models.RemediationEta;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class GovernanceAssignmentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceAssignmentProperties model = BinaryData.fromString(
            "{\"owner\":\"vdnkfxusem\",\"remediationDueDate\":\"2021-02-14T09:42:03Z\",\"remediationEta\":{\"eta\":\"2020-12-23T10:27:47Z\",\"justification\":\"muhapfcqdpsqxqv\"},\"isGracePeriod\":false,\"governanceEmailNotification\":{\"disableManagerEmailNotification\":false,\"disableOwnerEmailNotification\":false},\"additionalData\":{\"ticketNumber\":182894224,\"ticketLink\":\"vezrypqlmfeo\",\"ticketStatus\":\"rqwky\"}}")
            .toObject(GovernanceAssignmentProperties.class);
        Assertions.assertEquals("vdnkfxusem", model.owner());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-14T09:42:03Z"), model.remediationDueDate());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-23T10:27:47Z"), model.remediationEta().eta());
        Assertions.assertEquals("muhapfcqdpsqxqv", model.remediationEta().justification());
        Assertions.assertEquals(false, model.isGracePeriod());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableOwnerEmailNotification());
        Assertions.assertEquals(182894224, model.additionalData().ticketNumber());
        Assertions.assertEquals("vezrypqlmfeo", model.additionalData().ticketLink());
        Assertions.assertEquals("rqwky", model.additionalData().ticketStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceAssignmentProperties model = new GovernanceAssignmentProperties().withOwner("vdnkfxusem")
            .withRemediationDueDate(OffsetDateTime.parse("2021-02-14T09:42:03Z"))
            .withRemediationEta(new RemediationEta()
                .withEta(OffsetDateTime.parse("2020-12-23T10:27:47Z")).withJustification("muhapfcqdpsqxqv"))
            .withIsGracePeriod(false)
            .withGovernanceEmailNotification(new GovernanceEmailNotification()
                .withDisableManagerEmailNotification(false).withDisableOwnerEmailNotification(false))
            .withAdditionalData(new GovernanceAssignmentAdditionalData().withTicketNumber(182894224)
                .withTicketLink("vezrypqlmfeo").withTicketStatus("rqwky"));
        model = BinaryData.fromObject(model).toObject(GovernanceAssignmentProperties.class);
        Assertions.assertEquals("vdnkfxusem", model.owner());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-14T09:42:03Z"), model.remediationDueDate());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-23T10:27:47Z"), model.remediationEta().eta());
        Assertions.assertEquals("muhapfcqdpsqxqv", model.remediationEta().justification());
        Assertions.assertEquals(false, model.isGracePeriod());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableOwnerEmailNotification());
        Assertions.assertEquals(182894224, model.additionalData().ticketNumber());
        Assertions.assertEquals("vezrypqlmfeo", model.additionalData().ticketLink());
        Assertions.assertEquals("rqwky", model.additionalData().ticketStatus());
    }
}
