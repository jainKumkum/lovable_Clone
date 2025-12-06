package com.codingshuttle.projects.lovable_clone.services;

import com.codingshuttle.projects.lovable_clone.Dto.subscription.CheckoutRequest;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.CheckoutResponse;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.PortalResponse;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

//    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
