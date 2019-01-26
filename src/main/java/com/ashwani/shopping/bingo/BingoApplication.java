package com.ashwani.shopping.bingo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class BingoApplication extends SpringBootServletInitializer {

	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(BingoApplication.class);
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(BingoApplication.class, args);
	    }

}

