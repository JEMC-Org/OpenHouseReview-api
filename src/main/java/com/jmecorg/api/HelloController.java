package com.jmecorg.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class HelloController {

    @GetMapping("/hello")
    private String sayHello() {
        return "Hello";
    }
}
