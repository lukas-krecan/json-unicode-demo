package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/data")
    public Result get() {
        return new Result("€");
    }

    public record Result(String data) {}
}