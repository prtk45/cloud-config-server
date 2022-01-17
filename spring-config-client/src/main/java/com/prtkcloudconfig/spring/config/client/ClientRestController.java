package com.prtkcloudconfig.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientRestController {

	@Value("${server.url:Unable to connect to config server}")
	private String url;

	@RequestMapping("/server/url")
	String getURL() {
		return this.url;
	}
}
