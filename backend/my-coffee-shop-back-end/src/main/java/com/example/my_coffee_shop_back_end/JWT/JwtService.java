package com.example.my_coffee_shop_back_end.JWT;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
@Component
public class JwtService {
    
    @Value("{$jwt.secret.key}")
    private  String SECRETE_KEY;

    public String extractUserName(String token)
    {
        return extractClaim(token, Claims::getSubject);
    }
    public Date extractExpiration(String token)
    {
        return extractClaim(token, Claims::getExpiration);
    }


    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver )
    {
        final Claims claims =  extractAllClaims(token);
        return claimsResolver.apply(claims);

    }
    public Claims extractAllClaims(String token)
    {
        return Jwts.
        parserBuilder().
        setSigningKey(getSignKey()).
        build().
        parseClaimsJws(token).
        getBody();
    }
    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRETE_KEY);
       return Keys.hmacShaKeyFor(keyBytes);
    }    
    
    public Boolean isTokenExpired(String token)
    {
        return extractExpiration(token).before(new Date());
    }
    public Boolean isValidToken(String token , UserDetails userDateils)
    {
        String username = extractUserName(token);
        return(
            userDateils.getUsername().equals(username) 
            && !isTokenExpired(token));
    }
    public String createToken(Map<String,Object>Claims,String username )
    {
        return Jwts.builder().
        setClaims(Claims).
        setSubject(username).
        setIssuedAt(new Date()).
        setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 1)).
        signWith(getSignKey(),SignatureAlgorithm.HS256).
        compact();
    }   
      public String GenerateToken(String username){
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, username);
    }

}
