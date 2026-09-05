package com.example.demo.util;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
@Component
public class JwtUtil {
 private static final String SECRET="SOA_Banking_API_JWT_Secret_Key_2026_AtLeast32CharactersLong";
 private final SecretKey key=Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
 public String generateToken(String username){Date now=new Date();return Jwts.builder().subject(username).issuedAt(now).expiration(new Date(now.getTime()+60*60*1000)).signWith(key).compact();}
 public String extractUsername(String token){Claims c=Jwts.parser().verifyWith(key).build().parseSignedClaims(token).getPayload();return c.getSubject();}
 public boolean isTokenValid(String token){try{Jwts.parser().verifyWith(key).build().parseSignedClaims(token);return true;}catch(Exception e){return false;}}
}
