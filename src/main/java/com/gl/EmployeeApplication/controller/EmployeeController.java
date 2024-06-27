package com.gl.EmployeeApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public ResponseEntity<String> printEmployees(){
        return ResponseEntity.ok("Employee Details");
    }
}
