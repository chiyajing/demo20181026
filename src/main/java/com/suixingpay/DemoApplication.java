package com.suixingpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath*:core-context.xml"})
public class DemoApplication {

	public static void main(String[] args) {
		//fsadfasfadfads
		SpringApplication.run(DemoApplication.class, args);
	}
}
