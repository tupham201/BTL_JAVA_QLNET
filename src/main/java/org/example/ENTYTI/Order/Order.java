package org.example.ENTYTI.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    @Column(nullable = false, unique = true)
    private String id;
    @Column(columnDefinition = "nvarchar1000",nullable = false)
    private String idHang;
    @Column(nullable = false)
    private int SoLuong;
    public Order() {
    }

    public Order(String id, String idHang, int soLuong) {
        this.id = id;
        this.idHang = idHang;
        SoLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdHang() {
        return idHang;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
}
