package com.gazatem.spinny.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class HomeController {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello";
    }
}
