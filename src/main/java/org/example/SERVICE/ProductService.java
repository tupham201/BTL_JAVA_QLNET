package org.example.SERVICE;

import jakarta.persistence.TypedQuery;
import org.example.ENTITY.Order.Product;

import java.util.ArrayList;

import static org.example.DAO.Main.entityManager;

public class ProductService {

    public ArrayList<Product> selectAllProduct(){
        entityManager.clear();
        TypedQuery<Product> query = entityManager.createQuery("Select c from Product c", Product.class);
        return (ArrayList<Product>) query.getResultList();
    }

    public void addProduct(Product product){
        entityManager.getTransaction().begin();
        entityManager.merge(product);
        entityManager.getTransaction().commit();
    }

    public Product setNewProduct(Product product, String name, double price, int quantity, int type) {
        product.setName(name);
        product.setPrice(price);
        product.setCategory(type);
        product.setQuantity(quantity);
        return product;
    }

    public Product FindProduct(int id){
        entityManager.clear();
        return entityManager.find(Product.class,id);
    }

    public void deleteProduct(Product product){
        entityManager.getTransaction().begin();
        entityManager.remove(product);
        entityManager.getTransaction().commit();
    }
}
