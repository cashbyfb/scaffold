package com.perye.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@SpringBootApplication( scanBasePackages = "com.perye")
public class ManageSystemWebAppApplication extends SpringBootServletInitializer {

	public static void main ( String[] args ) {
		SpringApplication.run( ManageSystemWebAppApplication.class , args );
	}


	@Override
	protected SpringApplicationBuilder configure ( SpringApplicationBuilder application ) {
		return application.sources( SpringBootServletInitializer.class );
	}

}
