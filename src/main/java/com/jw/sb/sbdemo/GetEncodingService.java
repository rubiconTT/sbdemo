package com.jw.sb.sbdemo;

import java.nio.charset.Charset;

public class GetEncodingService {
	
	private Charset charset;
	private boolean force;
	
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
	
	public String getEncoding(){
		return "charset: "+charset+" ,is force: "+force;
	}

}
