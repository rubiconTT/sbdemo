package com.jw.sb.sbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @SpringBootApplication是核心注解，作用是开启自动配置。它是一个组合注解
 * 组合以下注解：@Configuration,@AutoEnableConfiguration,@ComponentScan
 * 不使用@SpringBootApplication,可以直接将以上三个注解添加到入口类名上
 * 关闭特定的自动配置可以使用注解的exclude参数，将需要关闭的自动配置类写进去
 * @author TT
 *
 */
@RestController
@SpringBootApplication
//@EnableConfigurationProperties(TypeSafeBeanDemo.class)
public class SbdemoApplication {
	@Autowired
	private TypeSafeBeanDemo tsbd;

	public static void main(String[] args) {
//		SpringApplication.run(SbdemoApplication.class, args);
		SpringApplication app=new SpringApplication(SbdemoApplication.class);
		app.setBannerMode(Mode.CONSOLE);
		
		app.run(args);
	}
	
//	@RequestMapping("/")
//	String index(){
//		return "hello spring boot!";
//	}
	
	@RequestMapping("/services")
	String index2(){
		return "user auther: "+tsbd.getAuthor()+" , gender: "+tsbd.getGender()+" ,age: "+tsbd.getAge();
	}
}
