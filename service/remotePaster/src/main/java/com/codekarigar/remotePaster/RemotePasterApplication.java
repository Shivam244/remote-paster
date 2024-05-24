package com.codekarigar.remotePaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RemotePasterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RemotePasterApplication.class, args);
	}

}
