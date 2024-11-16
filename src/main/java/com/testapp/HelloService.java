package com.testapp;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String createHelloMessage(String name) {
        return "Hello " + name + "!";
    }
}