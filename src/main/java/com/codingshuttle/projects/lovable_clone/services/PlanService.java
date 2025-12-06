package com.codingshuttle.projects.lovable_clone.services;

import com.codingshuttle.projects.lovable_clone.Dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
