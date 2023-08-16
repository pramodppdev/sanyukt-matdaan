package com.sanyukt.matdaan.security;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SecurityFilter extends GenericFilterBean {

    Logger LOG = LoggerFactory.getLogger(SecurityFilter.class);

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String clientKey = request.getHeader("CLIENT_KEY");

        if (StringUtils.isNotBlank(clientKey)) { // Check if clientKey is present
            TokenAuthentication token = new TokenAuthentication();
            token.setAuthenticated(true);
            LOG.info("Logging validation");
            SecurityContextHolder.getContext().setAuthentication(token);
        }

        chain.doFilter(request, response);
    }
}

