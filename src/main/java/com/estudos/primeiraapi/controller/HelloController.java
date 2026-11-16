package com.estudos.primeiraapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return ("Minha primeira API Spring Boot!");
    }
}
