package com.onlinejudge.security.service;

import com.onlinejudge.security.dao.response.JwtAuthenticationResponse;
import com.onlinejudge.security.dao.request.SignUpRequest;
import com.onlinejudge.security.dao.request.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
