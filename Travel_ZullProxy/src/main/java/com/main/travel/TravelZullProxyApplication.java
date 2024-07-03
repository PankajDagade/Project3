package com.main.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class TravelZullProxyApplication {

	public static void main(String[] args) {
		System.out.println("This is Zuul Proxy!!!!");
		SpringApplication.run(TravelZullProxyApplication.class, args);
	}

}
