package com.simakov.spring.security.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MySecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        
    }
}
