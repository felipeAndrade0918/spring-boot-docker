package com.felipeandrade0918.javadocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello my friend, stay a while and listen!";
	}
}
