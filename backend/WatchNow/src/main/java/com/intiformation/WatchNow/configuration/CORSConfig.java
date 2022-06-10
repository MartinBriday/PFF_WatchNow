package com.intiformation.WatchNow.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSConfig implements WebMvcConfigurer
{

	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/**")
			.allowedOrigins("http://localhost:4200")
			.allowedHeaders("*")
			.allowedMethods("post, put, get, options, delete")
			.exposedHeaders("Set-Cookie","Authorization");
	}

}
