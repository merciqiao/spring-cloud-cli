package com.yingu.project.feign.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.yingu.project.feign.controller"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.yingu.project.feign.rpc"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
}
