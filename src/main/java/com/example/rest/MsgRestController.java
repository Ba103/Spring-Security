package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/msg")
	public String getMsg() {

		return "Good evening";
	}
}
