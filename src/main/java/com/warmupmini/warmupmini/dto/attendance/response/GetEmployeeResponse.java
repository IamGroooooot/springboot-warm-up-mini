package com.warmupmini.warmupmini.dto.attendance.response;

import com.warmupmini.warmupmini.domain.attendance.Role;

import java.time.LocalDate;

public class GetEmployeeResponse {
    public String name;
    public String teamName;
    public Role role;
    public LocalDate birthday;
    public LocalDate workStartDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(LocalDate workStartDate) {
        this.workStartDate = workStartDate;
    }
}
