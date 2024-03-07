package com.warmupmini.warmupmini.dto.attendance.request;

import com.warmupmini.warmupmini.domain.attendance.Role;

import java.time.LocalDate;

public class CreateEmployeeRequest {
    private String name;
    private String teamName;
    private Role role;
    private LocalDate birthDate;
    private LocalDate workStartDate;

    public CreateEmployeeRequest(String name, String teamName, Role role, LocalDate birthDate, LocalDate workStartDate) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthDate = birthDate;
        this.workStartDate = workStartDate;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }
}

