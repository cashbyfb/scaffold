package com.perye.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author: Perye
 * @Date: 2019-03-16
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure ( HttpSecurity http ) throws Exception {
		http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
	}
}
