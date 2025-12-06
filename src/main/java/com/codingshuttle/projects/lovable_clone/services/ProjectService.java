package com.codingshuttle.projects.lovable_clone.services;

import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectRequest;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectResponse;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
     List<ProjectSummaryResponse> getUserProjects(Long userId);
     ProjectResponse getProjectById(Long id, Long userId);
     ProjectResponse createProject(ProjectRequest project, Long userId);
     ProjectResponse updateProject(Long id, ProjectRequest project, Long userId);
     void softDelete(Long id, Long userId);
}
