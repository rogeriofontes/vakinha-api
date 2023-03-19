package br.com.vakinha.vakinhaapi.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
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

}


