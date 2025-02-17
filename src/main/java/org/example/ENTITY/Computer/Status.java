package org.example.ENTITY.Computer;

public enum Status {
    AVAILABLE("Còn trống"),
    OUT_OF_ORDER("Hỏng"),
    IN_USE("Đang được sử dụng");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
