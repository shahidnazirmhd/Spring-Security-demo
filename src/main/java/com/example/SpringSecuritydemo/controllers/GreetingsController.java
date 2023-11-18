package com.example.SpringSecuritydemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello! from API ");
    }

    @GetMapping(path = "bye")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Good bye!");
    }
}
