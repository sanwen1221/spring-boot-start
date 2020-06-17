package com.wdcloud.hellpspringboot.controller;

import com.wdcloud.hellpspringboot.service.HelloSpringBootService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class HelloSpringBootController {

    @Autowired
    private String gName;

    @Autowired
    private HelloSpringBootService helloSpringBootService;


    @GetMapping("/")
    public String test(){

        log.error(gName);
        return "hello spring boot";
    }
}
