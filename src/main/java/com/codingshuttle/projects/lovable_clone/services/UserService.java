package com.codingshuttle.projects.lovable_clone.services;

import com.codingshuttle.projects.lovable_clone.Dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
