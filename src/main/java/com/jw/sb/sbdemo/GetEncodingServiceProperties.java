package com.jw.sb.sbdemo;

import java.nio.charset.Charset;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="spring.http.encoding")
public class GetEncodingServiceProperties {
	
	public static final Charset DEFAULT_CHARSET=Charset.forName("UTF-8");
	
	private Charset charset=DEFAULT_CHARSET;	
	
	private boolean force=true;

	public Charset getCharset() {
		return charset;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public boolean isForce() {
		return force;
	}

	public void setForce(boolean force) {
		this.force = force;
	}
	
	
	
	

}
