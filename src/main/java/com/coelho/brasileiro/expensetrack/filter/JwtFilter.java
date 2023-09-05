package com.coelho.brasileiro.expensetrack.filter;


import com.coelho.brasileiro.expensetrack.exception.TokenException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;

public class JwtFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final String authHeader = request.getHeader("authorization");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            filterChain.doFilter(request, response);
        } else {
            if(authHeader == null || !authHeader.startsWith("Bearer ")){
                throw new TokenException("token not found");
            }
        }
        final String token = authHeader.substring(7);

        Claims claims = Jwts.parser().setSigningKey("secret").parseClaimsJws(token).getBody();
        System.out.println(claims.getSubject());
        request.setAttribute("claims", claims);
        request.setAttribute("blog", servletRequest.getParameter("id"));
        filterChain.doFilter(request, response);
    }

    public void decode(String token){
        String[] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();

        String header = new String(decoder.decode(chunks[0]));
        String payload = new String(decoder.decode(chunks[1]));
        System.out.println(header);
        System.out.println(payload);
    }
}
