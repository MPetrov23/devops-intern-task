package com.example.challenge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${app.greeting.message}")
    private String greetingMessage;

    @Value("${app.team.name}")
    private String teamName;

    @GetMapping("/hello")
    public String hello() {
        return greetingMessage + " (from team: " + teamName + ")";
    }

}
