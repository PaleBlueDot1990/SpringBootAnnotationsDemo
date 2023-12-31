package com.bhuvnesh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name)
	{
		System.out.println("Welcome Page");
		return String.format("Hello %s!", name);
	}

	@GetMapping("/")
	public String getHomePage()
	{
		System.out.println("Home Page");
		return String.format("Index Page");
	}
}
