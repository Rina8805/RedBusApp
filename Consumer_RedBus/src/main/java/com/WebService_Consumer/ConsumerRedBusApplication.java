package com.WebService_Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerRedBusApplication {

	public static void main(String[] args) {
		System.out.println("This is Consumer - RedBus");
		SpringApplication.run(ConsumerRedBusApplication.class, args);
	}

	@Bean
	public RestTemplate rsTemplate()
	{
		RestTemplate rs = new RestTemplate();
		return rs;
	}
	
}
