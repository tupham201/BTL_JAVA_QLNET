package org.example.ENTYTI.Computer;

public enum Status {
    AVAILABLE("Còn trống"),
    IN_USE("Đang được sử dụng"),
    OUT_OF_ORDER("Hỏng");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
