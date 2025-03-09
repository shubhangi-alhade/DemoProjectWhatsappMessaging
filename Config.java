package com.example.demoProject.config;

	
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.reactive.function.client.WebClient;

	@Configuration
	public class Config {

	    @Bean
	    public WebClient webClient(WebClient.Builder builder) {
	        return builder.baseUrl("https://graph.facebook.com/v22.0/532596386612837/messages") // Set your base URL
	                .defaultHeader("Content-Type", "application/json") // Default headers (optional)
	                .build();
	    }
	}

	


