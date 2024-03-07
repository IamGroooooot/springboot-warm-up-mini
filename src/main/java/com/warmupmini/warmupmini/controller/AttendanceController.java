package com.warmupmini.warmupmini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {
    @PostMapping("/teams")
    private String createTeam() {
        return "Team created";
    }

    @PostMapping("/employees")
    private String createEmployee() {
        return "Employee created";
    }

    @GetMapping("/teams")
    private String getTeam() {
        return "Teams";
    }

    @GetMapping("/employees")
    private String getEmployee() {
        return "Employees";
    }
}
