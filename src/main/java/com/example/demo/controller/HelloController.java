package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloController {  

    @RequestMapping(value="/hello", method=RequestMethod.GET)  
    public String HelloController() {  
        return "Hello World!";  
    }  

}  