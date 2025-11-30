package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.PreviewStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE )

public class Preview {
    Long id;

    Project project;

    String namespace;
    String previewUrl;
    String podName;
    PreviewStatus status;

    Instant StartedAt;
    Instant CreatedAt;
    Instant terminatedAt;




}
