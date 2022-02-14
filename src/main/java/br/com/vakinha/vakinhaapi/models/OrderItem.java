package br.com.vakinha.vakinhaapi.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderItem() {}

    public OrderItem(Long id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}


