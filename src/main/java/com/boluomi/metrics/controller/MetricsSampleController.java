package com.boluomi.metrics.controller;

import com.boluomi.metrics.annotation.RequestType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsSampleController {
    @RequestMapping("/")
    @RequestType(requestType = "Demo", subRequestType = "test")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
