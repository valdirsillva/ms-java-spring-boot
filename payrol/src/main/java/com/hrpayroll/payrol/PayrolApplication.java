package com.hrpayroll.payrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PayrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrolApplication.class, args);
	}

}
