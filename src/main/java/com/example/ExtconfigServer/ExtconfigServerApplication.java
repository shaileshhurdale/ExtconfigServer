package com.example.ExtconfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ExtconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtconfigServerApplication.class, args);
	}

}
