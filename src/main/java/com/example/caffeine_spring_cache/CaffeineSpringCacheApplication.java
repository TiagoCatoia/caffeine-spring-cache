package com.example.caffeine_spring_cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class CaffeineSpringCacheApplication {
	public static void main(String[] args) {
		SpringApplication.run(CaffeineSpringCacheApplication.class, args);
	}
}
