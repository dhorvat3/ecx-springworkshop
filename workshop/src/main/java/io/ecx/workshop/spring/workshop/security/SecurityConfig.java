package io.ecx.workshop.spring.workshop.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
                .antMatchers("/login", "/registration").not().authenticated()
                .antMatchers("/js/**", "/css/**", "/webjars/**", "/error").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/home", true).failureForwardUrl("/login_error")
                .and().exceptionHandling().accessDeniedPage("/home")
                .and().logout().clearAuthentication(true).logoutSuccessUrl("/login");
    }
}
