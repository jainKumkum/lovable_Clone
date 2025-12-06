package com.codingshuttle.projects.lovable_clone.services;

import com.codingshuttle.projects.lovable_clone.Dto.project.FileContentResponse;
import com.codingshuttle.projects.lovable_clone.Dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;
public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

     FileContentResponse getFile(Long projectId, Long userId);
}
