package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sap.cloud.security.oauth2.OAuthAuthorizationFilter;

@Configuration
public class WebConfig {
	@Bean
	public FilterRegistrationBean<OAuthAuthorizationFilter> oauthFilterRegistration() {
		FilterRegistrationBean<OAuthAuthorizationFilter> registrationBean = new FilterRegistrationBean<OAuthAuthorizationFilter>();
		registrationBean.setFilter(new OAuthAuthorizationFilter());
		registrationBean.addUrlPatterns("/hello");
		registrationBean.addInitParameter("scope", "hello");
		registrationBean.addInitParameter("http-method", "get");
		registrationBean.addInitParameter("no-session", "true");
		registrationBean.setOrder(1);
		return registrationBean;
	}

}
