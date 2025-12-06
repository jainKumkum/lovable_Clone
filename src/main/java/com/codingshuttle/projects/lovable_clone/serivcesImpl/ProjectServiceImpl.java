package com.codingshuttle.projects.lovable_clone.serivcesImpl;

import com.codingshuttle.projects.lovable_clone.Dto.auth.UserProfileResponse;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectRequest;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectResponse;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.lovable_clone.entity.Project;
import com.codingshuttle.projects.lovable_clone.entity.User;
import com.codingshuttle.projects.lovable_clone.mapper.ProjectMapper;
import com.codingshuttle.projects.lovable_clone.repository.ProjectRepository;
import com.codingshuttle.projects.lovable_clone.repository.UserRepository;
import com.codingshuttle.projects.lovable_clone.services.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {
     ProjectRepository projectRepository;
     UserRepository userRepository;
     ProjectMapper projectMapper;

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        List<Project> projects = projectRepository.findAllAccessibleByUser(userId);
        log.info("getUserProjects: {}", projects);
        return projectMapper.toListProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getProjectById(Long id, Long userId) {
       return   null;

    }

    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest, Long userId) {
        //finding logged-in user details
        User owner = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User Not Found"));
        log.info("user Details : {}", owner.getId());
        Project project = Project.builder().name(projectRequest.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);
        log.info("Project owner Details : {}", project.getOwner().getId());
        return projectMapper.toProjectResponse(project);
        }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest project, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
