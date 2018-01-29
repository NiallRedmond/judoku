package com.example.judoku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
@SpringBootApplication
@EnableJpaAuditing
public class JudokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(JudokuApplication.class, args);
	}		
}
**/

@SpringBootApplication
@EnableJpaAuditing
public class JudokuApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JudokuApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JudokuApplication.class, args);
    }
}