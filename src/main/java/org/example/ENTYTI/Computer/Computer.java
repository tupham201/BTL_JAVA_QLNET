package org.example.ENTYTI.Computer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Computer {
    @Id
    @Column(nullable = false, unique = true)
    private String idComputer;
    @Column(nullable = false)
    private Status status;

    public Computer() {
    }

    public Computer(String idComputer, Status status) {
        this.idComputer = idComputer;
        this.status = status;
    }

    public String getIdComputer() {
        return idComputer;
    }

    public void setIdComputer(String idComputer) {
        this.idComputer = idComputer;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
