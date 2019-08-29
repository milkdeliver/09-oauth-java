package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping(path="/hello")
public class HelloWorldController {
	@RequestMapping(path="/hello/post", method = RequestMethod.POST)
	public String addHello() {
		return "Post Hello SAP";
	}
	
	@RequestMapping(path="/hello/get", method = RequestMethod.GET)
	public String getHello() {
		return "Get Hello SAP";
	}

}