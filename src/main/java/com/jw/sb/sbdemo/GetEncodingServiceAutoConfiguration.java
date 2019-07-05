package com.jw.sb.sbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GetEncodingServiceProperties.class)
@ConditionalOnClass(GetEncodingService.class)
@ConditionalOnProperty(prefix="spring.http.encoding",value="enabled",matchIfMissing=true)
public class GetEncodingServiceAutoConfiguration {
	@Autowired
	private GetEncodingServiceProperties getEncodingServiceProperties;
	
	@Bean
	@ConditionalOnMissingBean(GetEncodingService.class)
	public GetEncodingService getEncodingService(){
		GetEncodingService getEncodingService=new GetEncodingService();
		getEncodingService.setCharset(getEncodingServiceProperties.getCharset());
		getEncodingService.setForce(getEncodingServiceProperties.isForce());
		
		return getEncodingService;
		
	}

}
