package com.WebService_PurpleBus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsProducerPurpleBusApplication {

	public static void main(String[] args) {
		System.out.println("This is Producer-Purple Bus.");
		SpringApplication.run(MsProducerPurpleBusApplication.class, args);
	}

}
