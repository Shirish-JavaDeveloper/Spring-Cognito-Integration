package com.study.rest;

import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String sayHello(Principal principal){
        return "hello : "+principal.getName();
    }
}
