package com.bw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2020-05-03
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7001.class,args);
	}
}