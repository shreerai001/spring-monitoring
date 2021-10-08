package com.shree.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    public ResponseEntity<String> getDefaultString() {
        return ResponseEntity.ok("Hello");
    }
}
