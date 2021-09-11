package com.github.konz.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse(UUID.randomUUID());
    }
}
