package com.i2i.academy.spring_boot_task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Welcome to i2i Academy <br> (This project  created by zelis for the i2i Academy internship program)";
    }
}