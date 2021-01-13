package com.springboot.addten;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@GetMapping("/{num}")
	public Sum addTen(@PathVariable int num) {
		return new Sum(num + 10);
	}
	
	@GetMapping("/{num1}/{num2}")
	public Sum adder(@PathVariable int num1, @PathVariable int num2) {
		return new Sum(num1 + num2);
	}
	
}
