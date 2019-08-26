package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

	@GetMapping("/hello/{name}")
	public String getHelloWorld(@PathVariable String name) {
		return "Hello " + name + " from eureka client hosted on docker";
	}
}
