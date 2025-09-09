package com.tropicalpepe.exampleauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/authenticated")
    public String protectedEndpoint(){
        return "Hello, Admin!";
    }

    @GetMapping("/public")
    public String publicEndpoint(){
        return "Hello, Anyone!";
    }
}
