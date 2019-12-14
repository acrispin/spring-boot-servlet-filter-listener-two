package com.anton.dev.servletfilterlistenertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author acrispin
 * https://www.boraji.com/spring-boot-using-servlet-filter-and-listener-example-2
 */
@SpringBootApplication
@ServletComponentScan(basePackages = {
		"com.anton.dev.servletfilterlistenertwo.servlet",
		"com.anton.dev.servletfilterlistenertwo.filter",
		"com.anton.dev.servletfilterlistenertwo.listener"
})
public class SpringBootServletFilterListenerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServletFilterListenerTwoApplication.class, args);
	}

}
