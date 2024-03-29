package com.microsoft.azure.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DemoController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Test response" + counter.incrementAndGet();
    }
    
    @RequestMapping("/test1")
    public String test() {
        String result = "";
        for (String name : System.getProperties().stringPropertyNames()) {
            result += name + " " + System.getProperty(name) + "\n";
        }
        return "Start command:" + result;
    }
}
