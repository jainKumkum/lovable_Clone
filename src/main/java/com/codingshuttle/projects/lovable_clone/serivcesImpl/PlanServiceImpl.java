package com.codingshuttle.projects.lovable_clone.serivcesImpl;
import com.codingshuttle.projects.lovable_clone.services.PlanService;
import com.codingshuttle.projects.lovable_clone.Dto.subscription.PlanResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
