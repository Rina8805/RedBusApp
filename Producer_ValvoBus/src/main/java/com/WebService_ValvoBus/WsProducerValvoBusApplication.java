package com.WebService_ValvoBus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsProducerValvoBusApplication {

	public static void main(String[] args) {
		System.out.println("This is Producer- Valvo Bus.");
		SpringApplication.run(WsProducerValvoBusApplication.class, args);
	}

}
