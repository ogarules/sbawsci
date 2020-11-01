package com.example.democi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {
    
    @Value("${oga.testsetting}")
    String message;

    @GetMapping("/echo/{param}")
    public String doecho(@PathVariable String param) {
        return message + ":" + param;
    }
    
}
