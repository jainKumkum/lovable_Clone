package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.SubscriptionStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE )
public class Subscription {
    Long id;
    User user;
    Plan plan;
    String stripeCustomerId;
    String stripeSubscriptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Instant cancelAtPeriodEnd;

    Instant updatedAt;
    Instant createdAt;

    SubscriptionStatus status;
}
