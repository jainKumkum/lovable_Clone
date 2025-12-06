package com.codingshuttle.projects.lovable_clone.services;

import com.codingshuttle.projects.lovable_clone.Dto.auth.AuthResponseDto;
import com.codingshuttle.projects.lovable_clone.Dto.auth.LoginRequestDto;
import com.codingshuttle.projects.lovable_clone.Dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
     AuthResponseDto signup(SignupRequest signupRequest);

     AuthResponseDto login(LoginRequestDto loginRequestDto);
}
