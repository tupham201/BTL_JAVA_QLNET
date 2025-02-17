package org.example.ENTITY.Order;

import jakarta.persistence.*;

@Entity
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Khóa chính tự tăng

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private A_Order order;  // Khóa ngoại

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;  // Khóa ngoại

    @Column(nullable = false)
    private int soLuong;

    public OrderProduct() {}

    public OrderProduct(A_Order order, Product product, int soLuong) {
        this.order = order;
        this.product = product;
        this.soLuong = soLuong;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    public A_Order getOrder() {
        return order;
    }

    public void setOrder(A_Order order) {
        this.order = order;
    }

    public Product getHang() {
        return product;
    }

    public void setHang(Product product) {
        this.product = product;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
