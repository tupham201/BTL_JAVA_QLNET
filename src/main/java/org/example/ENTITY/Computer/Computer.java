package org.example.ENTITY.Computer;

import jakarta.persistence.*;
import org.example.ENTITY.USER.User;

@Entity
public class Computer {
    @Id
    private String name;  // Tên máy

    @Column(nullable = false)
    private Status status;  // Trạng thái (Enum)

    @OneToOne
    @JoinColumn(name = "user_id")  // Liên kết 1-1 với User
    private User user;

    public Computer() {}

    public Computer(String name, Status status) {
        this.name = name;
        this.status = status;
        this.user = null;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
