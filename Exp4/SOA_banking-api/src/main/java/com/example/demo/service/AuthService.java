package com.example.demo.service;
import com.example.demo.util.JwtUtil;
import org.springframework.stereotype.Service;
@Service
public class AuthService { private final JwtUtil jwtUtil; public AuthService(JwtUtil jwtUtil){this.jwtUtil=jwtUtil;} public String login(String username,String password){if("admin".equals(username)&&"admin123".equals(password))return jwtUtil.generateToken(username);return null;} }
