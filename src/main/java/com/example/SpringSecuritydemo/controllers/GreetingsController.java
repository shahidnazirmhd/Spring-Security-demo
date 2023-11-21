package com.example.SpringSecuritydemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingsController {
    @GetMapping(path = "greetings")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello! from API ");
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(path = "admin")
    public ResponseEntity<String> getAdminData() {
        return ResponseEntity.ok("This is Admin Data");
    }

    @GetMapping(path = "bye")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Good bye!");
    }
}
