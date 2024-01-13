package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.web.TrafficWebJaxRs;

@Configuration
public class MyConfig {
    
	@Bean
	public ResourceConfig resourceConfig() {
		ResourceConfig jerseyServlet=new ResourceConfig();
		jerseyServlet.register(TrafficWebJaxRs.class);
		return jerseyServlet;
		
	}
	
}
