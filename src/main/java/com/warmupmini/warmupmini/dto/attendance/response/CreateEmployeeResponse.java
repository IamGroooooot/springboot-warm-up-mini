package com.warmupmini.warmupmini.dto.attendance.response;

public class CreateEmployeeResponse {
    private long id;

    public CreateEmployeeResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
