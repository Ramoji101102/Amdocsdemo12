package com.amdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	@GetMapping("/first")
	public String print() {
		return "Welcome to java world";
	}
}
