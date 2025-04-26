package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/contact")
	public String contact() {

		return "contact : +91 70 13 90 60 26";
	}

	@GetMapping("/welcome")
	public String getMsg() {

		return "Good evening";
	}

	@GetMapping("/greet")
	public String getGreet() {

		return "Good evening";
	}
}
