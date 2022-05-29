package com.magic.cardsInventory.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magic")
public class HelloController {

    @GetMapping("/hello")
    private String sayHello() {
     return "Hello World!";
    }

}
