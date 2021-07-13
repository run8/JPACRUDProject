package com.skilldistillery.paraglidermanufacturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ParagliderAppApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ParagliderAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ParagliderAppApplication.class, args);
	}

}
