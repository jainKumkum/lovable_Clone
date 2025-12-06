package com.codingshuttle.projects.lovable_clone.controller;

import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectRequest;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectResponse;
import com.codingshuttle.projects.lovable_clone.Dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.lovable_clone.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
@SuppressWarnings("NullableProblems")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects() {
        Long userId = 1L; //TODO: will get the user id from login
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = 1L; //TODO: will get the user id from login
        return ResponseEntity.ok(projectService.getProjectById(id, userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest project){
        Long userId = 1L; //TODO: will get the user id from login
        return ResponseEntity.ok(projectService.createProject(project, userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest project){
        Long userId = 1L;//TODO: will get the user id from login
        return ResponseEntity.ok(projectService.updateProject(id, project, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProjectById(@PathVariable Long id){
        Long userId = 1L; //TODO: will get the user id from login
         projectService.softDelete(id, userId);
         return ResponseEntity.ok().build();
    }



}
