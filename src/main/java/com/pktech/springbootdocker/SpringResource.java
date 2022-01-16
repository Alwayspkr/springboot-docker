package com.pktech.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringResource {

    @GetMapping
    public String Hello(){
        return "Hello World...!";
    }
}
