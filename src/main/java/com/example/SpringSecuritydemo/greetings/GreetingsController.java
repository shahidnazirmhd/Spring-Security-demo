package com.example.SpringSecuritydemo.greetings;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingsController {
    @GetMapping(path = "data/greetings")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello! from API ");
    }


    @GetMapping(path = "admin")
    public ResponseEntity<String> getAdminData() {
        return ResponseEntity.ok("This is Admin Data");
    }

    @GetMapping(path = "data/info")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("This is Spring Security 6 Demo");
    }
}
