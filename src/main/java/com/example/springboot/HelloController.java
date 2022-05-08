package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello from <a href='https://github.com/KwaWingu/kwawingu-tomcat-example'>https://github.com/KwaWingu/kwawingu-tomcat-example</a>!";
	}

}
