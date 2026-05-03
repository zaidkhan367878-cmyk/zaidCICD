package com.zmr.helloworld.Restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldRestController {
	
	@GetMapping("/hello")
    public String getHello() {
        return "Hello World this is my first kubernates app";
    }
}
