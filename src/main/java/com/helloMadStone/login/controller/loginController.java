package com.helloMadStone.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class loginController {
	 @RequestMapping("/hello")
	    public String hello() {
	        return "Hello MadStone 1995 !!!";
	    }
}
