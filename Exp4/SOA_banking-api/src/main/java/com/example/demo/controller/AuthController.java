package com.example.demo.controller;
import com.example.demo.service.AuthService;
import com.example.demo.util.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
public class AuthController {
 private final AuthService authService; private final JwtUtil jwtUtil;
 public AuthController(AuthService authService,JwtUtil jwtUtil){this.authService=authService;this.jwtUtil=jwtUtil;}
 @PostMapping("/login") public ResponseEntity<?> login(@RequestBody Map<String,String> request){String token=authService.login(request.get("username"),request.get("password"));if(token==null)return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message","Invalid username or password"));return ResponseEntity.ok(Map.of("token",token));}
 @GetMapping("/account/details") public ResponseEntity<String> accountDetails(@RequestHeader(value="Authorization",required=false) String authorization){if(authorization==null||!authorization.startsWith("Bearer "))return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Missing or invalid Authorization header");String token=authorization.substring(7);if(!jwtUtil.isTokenValid(token))return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid or expired JWT token");String username=jwtUtil.extractUsername(token);return ResponseEntity.ok("Account Details for "+username+": Balance = ₹50,000");}
}
