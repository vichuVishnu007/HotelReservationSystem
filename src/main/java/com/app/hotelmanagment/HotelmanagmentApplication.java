package com.app.hotelmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
public class HotelmanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelmanagmentApplication.class, args);
	}

}
