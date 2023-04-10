package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

	@RequestMapping("/springboot")
	public String msg() {

		return "hello springboot docker app";
		
	}

}
