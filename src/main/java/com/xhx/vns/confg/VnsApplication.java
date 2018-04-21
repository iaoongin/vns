package com.xhx.vns.confg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xhx.vns.backend.dao")
@ComponentScan("com.xhx.vns")
public class VnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VnsApplication.class, args);
	}
}
