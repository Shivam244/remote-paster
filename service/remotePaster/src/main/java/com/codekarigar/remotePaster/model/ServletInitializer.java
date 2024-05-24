package com.codekarigar.remotePaster.model;

import com.codekarigar.remotePaster.RemotePasterApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RemotePasterApplication.class);
	}

}
