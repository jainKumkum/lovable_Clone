package com.codingshuttle.projects.lovable_clone.Dto.project;

import java.util.List;

public record FileTreeResponse(
        List<FileNode> files
) {
}
