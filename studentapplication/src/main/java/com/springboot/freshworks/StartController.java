package com.springboot.freshworks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

}
