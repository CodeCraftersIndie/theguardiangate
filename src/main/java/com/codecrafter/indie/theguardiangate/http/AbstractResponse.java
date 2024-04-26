package com.codecrafter.indie.theguardiangate.http;

public abstract class AbstractResponse {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AbstractResponse{" +
                "status='" + status + '\'' +
                '}';
    }
}
