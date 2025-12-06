package com.codingshuttle.projects.lovable_clone.serivcesImpl;

import com.codingshuttle.projects.lovable_clone.Dto.auth.AuthResponseDto;
import com.codingshuttle.projects.lovable_clone.Dto.auth.LoginRequestDto;
import com.codingshuttle.projects.lovable_clone.Dto.auth.SignupRequest;
import com.codingshuttle.projects.lovable_clone.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponseDto signup(SignupRequest signupRequest) {
        return null;
    }

    @Override
    public AuthResponseDto login(LoginRequestDto loginRequestDto) {
        return null;
    }
}
