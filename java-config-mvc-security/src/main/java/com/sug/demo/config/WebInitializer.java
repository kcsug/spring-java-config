package com.sug.demo.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebInitializer extends AbstractSecurityWebApplicationInitializer {

	public WebInitializer() {
		super(CommerceWebSecurityConfig.class, CommerceWebConfig.class);
	}

}

