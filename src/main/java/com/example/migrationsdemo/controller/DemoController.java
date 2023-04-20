package com.example.migrationsdemo.controller;

import com.example.migrationsdemo.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    ResponseEntity<?> getAll() {
        return ResponseEntity.ok("All demos");
    }


    @GetMapping("/{id}")
    ResponseEntity<?> getAll(@PathVariable Integer id) {
        return ResponseEntity.ok("Demo with id " + id);
    }

    @PostMapping
    ResponseEntity<?> create(@RequestBody User user) {
        user.id++;
        return ResponseEntity.ok(user);
    }
}
