package com.warmupmini.warmupmini.controller;

import com.warmupmini.warmupmini.dto.attendance.request.CreateEmployeeRequest;
import com.warmupmini.warmupmini.dto.attendance.request.CreateTeamRequest;
import com.warmupmini.warmupmini.dto.attendance.response.CreateEmployeeResponse;
import com.warmupmini.warmupmini.dto.attendance.response.CreateTeamResponse;
import com.warmupmini.warmupmini.dto.attendance.response.GetEmployeeResponse;
import com.warmupmini.warmupmini.dto.attendance.response.GetTeamResponse;
import com.warmupmini.warmupmini.service.attendance.EmployeeService;
import com.warmupmini.warmupmini.service.attendance.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    private CreateEmployeeResponse createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
        return new CreateEmployeeResponse(employeeService.save(createEmployeeRequest).getId());
    }

    @GetMapping("/teams")
    private List<GetTeamResponse> getTeam() {
        List<GetTeamResponse> teamResponses = new ArrayList<>();
        for (var team : teamService.getAll()) {
            teamResponses.add(new GetTeamResponse(team));
        }
        return teamResponses;
    }

    @GetMapping("/employees")
    private List<GetEmployeeResponse> getEmployee() {
        List<GetEmployeeResponse> employeeResponses = new ArrayList<>();
        for (var employee : employeeService.getAll()) {
            employeeResponses.add(new GetEmployeeResponse(employee));
        }
        return employeeResponses;
    }
}
