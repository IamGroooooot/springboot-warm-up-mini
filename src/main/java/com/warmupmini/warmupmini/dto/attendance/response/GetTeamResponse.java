package com.warmupmini.warmupmini.dto.attendance.response;

import com.warmupmini.warmupmini.domain.attendance.Team;

public class GetTeamResponse {
    public String name;
    public String manager;
    public int memberCount;

    public GetTeamResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManager();
        this.memberCount = team.getEmployees().size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
}
