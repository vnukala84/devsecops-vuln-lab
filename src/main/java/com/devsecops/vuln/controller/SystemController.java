package com.devsecops.vuln.controller;

import org.springframework.web.bind.annotation.*;
import java.nio.file.*;

@RestController
public class SystemController {

    @GetMapping("/ping")
    public String ping(@RequestParam String host) throws Exception {
        Runtime.getRuntime().exec("ping " + host);
        return "Executed";
    }

    @GetMapping("/file")
    public String readFile(@RequestParam String name) throws Exception {
        return new String(
            Files.readAllBytes(Paths.get("files/" + name))
        );
    }
}
