package com.crts.app.hm.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/gethmpls")
	public String getHmlps() {
		return "Hi! You are in HMLPS";
	}
}
