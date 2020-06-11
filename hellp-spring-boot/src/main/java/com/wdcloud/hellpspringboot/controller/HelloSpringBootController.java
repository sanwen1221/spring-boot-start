package com.wdcloud.hellpspringboot.controller;

import com.wdcloud.hellpspringboot.service.HelloSpringBootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author dinghh
 * time 2020-06-10 14:41
 */
@RestController
@RequestMapping("/hello")
public class HelloSpringBootController {

    @Autowired
    private HelloSpringBootService helloSpringBootService;


    @GetMapping("/")
    public String test(){
        return "hello spring boot";
    }
}
