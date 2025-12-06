package com.codingshuttle.projects.lovable_clone.controller;

import com.codingshuttle.projects.lovable_clone.Dto.auth.AuthResponseDto;
import com.codingshuttle.projects.lovable_clone.Dto.auth.LoginRequestDto;
import com.codingshuttle.projects.lovable_clone.Dto.auth.SignupRequest;
import com.codingshuttle.projects.lovable_clone.Dto.auth.UserProfileResponse;
import com.codingshuttle.projects.lovable_clone.services.AuthService;
import com.codingshuttle.projects.lovable_clone.services.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<AuthResponseDto> signup(SignupRequest signupRequest) {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(LoginRequestDto loginRequestDto) {
        return ResponseEntity.ok(authService.login(loginRequestDto));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }

}
