package com.codingshuttle.projects.lovable_clone.Dto.project;

import java.time.Instant;

public record ProjectSummaryResponse(
        Long id,
        String name,
        Instant updatedAt,
        Instant createdAt
) {
}
