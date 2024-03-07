package com.warmupmini.warmupmini.dto.attendance.response;

public class CreateTeamResponse {
    private long id;

    public CreateTeamResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
