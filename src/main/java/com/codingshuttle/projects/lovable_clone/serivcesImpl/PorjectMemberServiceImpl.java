package com.codingshuttle.projects.lovable_clone.serivcesImpl;

import com.codingshuttle.projects.lovable_clone.Dto.member.MemberResponse;
import com.codingshuttle.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.codingshuttle.projects.lovable_clone.entity.ProjectMember;
import com.codingshuttle.projects.lovable_clone.services.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PorjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<ProjectMember> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
