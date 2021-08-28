package com.donation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DonationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonationApplication.class, args);
	}

}
