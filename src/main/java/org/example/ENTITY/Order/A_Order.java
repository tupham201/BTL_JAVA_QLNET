package org.example.ENTITY.Order;

import jakarta.persistence.*;
import org.example.ENTITY.USER.User;

import java.util.Set;

@Entity
public class A_Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderProduct> orderHangs;

    public A_Order() {}

    public A_Order(User user) {
        this.user = user;
    }

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<OrderProduct> getOrderHangs() {
        return orderHangs;
    }

    public void setOrderHangs(Set<OrderProduct> orderHangs) {
        this.orderHangs = orderHangs;
    }
}
