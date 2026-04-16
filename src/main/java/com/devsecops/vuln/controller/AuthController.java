package com.devsecops.vuln.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;

@RestController
public class AuthController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        String query = "SELECT * FROM users WHERE username='"
                + username + "' AND password='" + password + "'";

        System.out.println("Executing: " + query);

        List<Map<String,Object>> result =
                jdbcTemplate.queryForList(query);

        return result.isEmpty() ? "FAILED ❌" : "SUCCESS 🎉";
    }
}
