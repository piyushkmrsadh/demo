package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/get/data")
    public ResponseEntity<Map<Integer, String>> getData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bishnu Dutt");
        map.put(2, "Piyush Kumar");
        map.put(3, "Rahul ");
        return ResponseEntity.ok(map);

        

        
    }

}
