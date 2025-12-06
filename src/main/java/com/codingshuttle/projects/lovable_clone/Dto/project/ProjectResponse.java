package com.codingshuttle.projects.lovable_clone.Dto.project;

import com.codingshuttle.projects.lovable_clone.Dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant updatedAt,
        Instant createdAt,
        UserProfileResponse owner
) {
}
