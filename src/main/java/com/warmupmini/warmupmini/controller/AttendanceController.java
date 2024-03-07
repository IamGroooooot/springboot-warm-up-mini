package com.warmupmini.warmupmini.controller;

import com.warmupmini.warmupmini.dto.attendance.request.CreateTeamRequest;
import com.warmupmini.warmupmini.dto.attendance.response.CreateTeamResponse;
import com.warmupmini.warmupmini.service.attendance.EmployeeService;
import com.warmupmini.warmupmini.service.attendance.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {
    private final TeamService teamService;
    private final EmployeeService employeeService;

    public AttendanceController(TeamService teamService, EmployeeService employeeService) {
        this.teamService = teamService;
        this.employeeService = employeeService;
    }

    @PostMapping("/teams")
    private CreateTeamResponse createTeam(@RequestBody CreateTeamRequest createTeamRequest) {
        return new CreateTeamResponse(teamService.save(createTeamRequest).getId());
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
