package com.pe.idat.app_matricula.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("123"))
                .roles("ADMIN");
        auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("123"))
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
                .antMatchers("/docente/listar").permitAll()
                .antMatchers("/docente/guardar").access("hasRole('ADMIN')")
                .antMatchers("/docente/eliminar").access("hasRole('ADMIN')")
                .antMatchers("/docente/actualizar").access("hasRole('USER')")
                .antMatchers("/curso/listar").access("hasRole('ADMIN')");

        http.authorizeRequests().and()
                .httpBasic();

        http.authorizeRequests().and()
                .csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
