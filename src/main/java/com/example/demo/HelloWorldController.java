package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/")
    public String hello()
    {
        return "This is basic sample springboot setup for reuse";
    }

    @RequestMapping("/first")
    public String first()
    {
        return "Hello first endpoint";
    }

    //this is second endpoint
    @RequestMapping("/second")
    public String second()
    {
        return "Hello second endpoint";
    }
}
