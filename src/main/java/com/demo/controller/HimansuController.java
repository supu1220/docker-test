package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HimansuController {

	@GetMapping("/message")
	public String getmessage() {
		return "I LOVE YOU";
	}
}
