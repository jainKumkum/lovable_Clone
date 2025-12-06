package com.codingshuttle.projects.lovable_clone.Dto.auth;

public record UserProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl
) {
}
