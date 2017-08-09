package com.sopra.ictest.dumy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DumyApplication {

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(DumyApplication.class);
		ApplicationContext ctx = sa.run(args);
		StuffMaker rs = ctx.getBean(StuffMaker.class);
		rs.go();
	}
}
