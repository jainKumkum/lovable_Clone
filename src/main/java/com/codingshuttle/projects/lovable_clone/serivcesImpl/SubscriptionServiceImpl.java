package com.codingshuttle.projects.lovable_clone.serivcesImpl;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.CheckoutRequest;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.CheckoutResponse;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.PortalResponse;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.SubscriptionResponse;
import com.codingshuttle.projects.lovable_clone.services.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
