package com.codingshuttle.projects.lovable_clone.serivcesImpl;

import com.codingshuttle.projects.lovable_clone.Dto.project.FileContentResponse;
import com.codingshuttle.projects.lovable_clone.Dto.project.FileNode;
import com.codingshuttle.projects.lovable_clone.services.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFile(Long projectId, Long userId) {
        return null;
    }
}
