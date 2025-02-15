package org.example.ENTYTI.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Order {
    @Id
    @Column(nullable = false, unique = true)
    private String idOrder;
    @Column(columnDefinition = "nvarchar1000",nullable = false)
    private String Don;

    public Order() {
    }

    public Order(String idOrder, String don) {
        this.idOrder = idOrder;
        this.Don = don;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getDon() {
        return Don;
    }

    public void setDon(String don) {
        Don = don;
    }
}
