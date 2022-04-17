package com.ews.devinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class DevInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevInterviewApplication.class, args);

	}

}