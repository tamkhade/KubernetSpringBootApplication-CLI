package com.kube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootKubernetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKubernetApplication.class, args);
	}
	
	@GetMapping("/message")
	public String  getMessage() {
		
		return "Successfully deployed ";
	}

}
