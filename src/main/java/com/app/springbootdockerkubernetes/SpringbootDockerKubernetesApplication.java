package com.app.springbootdockerkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerKubernetesApplication {
	@GetMapping("/message")
	public String displayMessage(){
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerKubernetesApplication.class, args);
	}

}
