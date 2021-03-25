package com.selimhorri.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {
	
	@Get
	public String msg() {
		return "Hello Micronaut !!";
	}
	
	
	
}





