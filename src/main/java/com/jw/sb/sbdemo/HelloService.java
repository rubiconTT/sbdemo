package com.jw.sb.sbdemo;

public class HelloService {
	
	private String msg;
	
	
	
	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public String sayHello(){
		return "Hello, "+msg;
	}

}
