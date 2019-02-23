package com.kuharski.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String root(){
         return "yo";
    }

    @GetMapping("/g")
    public String g(){
         return "goooo";
    }

}