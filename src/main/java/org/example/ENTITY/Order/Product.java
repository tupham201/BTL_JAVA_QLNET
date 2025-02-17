package org.example.ENTITY.Order;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<OrderProduct> orderProducts; // Đổi tên cho rõ nghĩa

    // Constructors
    public Product() {}

    public Product(String name, double price, int quantity, int category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public int getCategory() { return category; }
    public void setCategory(int category) { this.category = category; }

    public Set<OrderProduct> getOrderProducts() { return orderProducts; }
    public void setOrderProducts(Set<OrderProduct> orderProducts) { this.orderProducts = orderProducts; }
}
