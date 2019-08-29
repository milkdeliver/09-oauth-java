package com.example.demo.filter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;

import com.sap.cloud.security.oauth2.OAuthAuthorizationFilter;

public class OAuthFilter extends OAuthAuthorizationFilter{

	public OAuthFilter() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

}
