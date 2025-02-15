/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.ENTYTI.ADMIN;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.ENTYTI.USER.Role;

@Entity
public class Admin {
    @Id
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(columnDefinition = "varchar(100)",nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column
    private Role role;
    public Admin() {
    }

    public Admin(String phone, String name, String password, Role role) {
        this.phone = phone;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
