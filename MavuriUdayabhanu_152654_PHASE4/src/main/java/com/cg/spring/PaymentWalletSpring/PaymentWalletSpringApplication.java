package com.cg.spring.PaymentWalletSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com")
public class PaymentWalletSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentWalletSpringApplication.class, args);
	}
}
