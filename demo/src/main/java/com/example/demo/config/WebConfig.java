package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sap.cloud.security.oauth2.OAuthAuthorizationFilter;

@Configuration
public class WebConfig {
	private int filterOrder = 1;
	@Bean
	public FilterRegistrationBean registerOperateScope() {
		return getOAuthFilterRegistration("hello", "HelloScopeFilter", "/hello/*");
	}
	
	@Bean
	public FilterRegistrationBean registerBillsScope() {
		return getOAuthFilterRegistration("hi", "HiScopeFilter", "/hi/*");
	}

	private FilterRegistrationBean getOAuthFilterRegistration(String scope, String name, String... urlPatterns) {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new OAuthAuthorizationFilter());
		registration.addUrlPatterns(urlPatterns);
		registration.addInitParameter("scope", scope);
		registration.addInitParameter("no-session", "true");
		registration.addInitParameter("user-principal", "yes");
		registration.setName(name);
		registration.setOrder(filterOrder++);
		return registration;
	}

}
