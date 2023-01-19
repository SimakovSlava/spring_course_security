package com.simakov.spring.security.configuration;

import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure( AuthenticationManagerBuilder authenticationManagerBuilder ) throws Exception {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        authenticationManagerBuilder.inMemoryAuthentication().
                withUser(userBuilder.username("slava").password("slava").roles("EMPLOYEE")).
                withUser(userBuilder.username("elena").password("elena").roles("HR")).
                withUser(userBuilder.username("ivan").password("ivan").roles("MANAGER", "HR"));


    }
}
