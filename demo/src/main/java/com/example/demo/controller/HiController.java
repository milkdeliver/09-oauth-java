package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@RequestMapping(path = "/hi/post", method = RequestMethod.POST)
	public String addHello() {
		return "Post Hi SAP";
	}

	@RequestMapping(path = "/hi/get", method = RequestMethod.GET)
	public String getHello() {
		return "Get Hi SAP";
	}
}
