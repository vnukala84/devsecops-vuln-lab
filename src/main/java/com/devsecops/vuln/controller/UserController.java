package com.devsecops.vuln.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;

@RestController
public class UserController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/user/{id}")
    public List<Map<String,Object>> getUser(@PathVariable int id) {
        return jdbcTemplate.queryForList(
            "SELECT * FROM users WHERE id=" + id
        );
    }
}
