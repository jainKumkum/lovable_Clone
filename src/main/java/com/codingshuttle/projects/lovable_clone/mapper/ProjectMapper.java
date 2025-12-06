package com.codingshuttle.projects.lovable_clone.mapper;

import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectResponse;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.lovable_clone.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    @Mapping(target = "owner", source = "owner")
    ProjectResponse toProjectResponse(Project project);

    List<ProjectSummaryResponse> toListProjectSummaryResponse(List<Project> projects);
}