package org.example.ENTYTI.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.ENTYTI.USER.Role;

@Entity
public class Hang {
    @Id
    @Column(nullable = false, unique = true)
    private String id;
    @Column(columnDefinition = "varchar(100)",nullable = false)
    private String nameHang;
    @Column(nullable = false)
    private int money;

    public Hang() {
    }

    public Hang(String id, String nameHang, int money) {
        this.id = id;
        this.nameHang = nameHang;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameHang() {
        return nameHang;
    }

    public void setNameHang(String nameHang) {
        this.nameHang = nameHang;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
