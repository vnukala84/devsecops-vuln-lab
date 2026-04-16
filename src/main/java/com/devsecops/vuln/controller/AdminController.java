package com.devsecops.vuln.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "🚨 Admin Data: password=root123";
    }

    @GetMapping("/secrets")
    public String secrets() {
        return "AWS_SECRET=AKIAIOSFODNN7SECRET";
    }
}
