package br.com.vakinha.vakinhaapi.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
@Entity
@Table(name = "ORDER_I")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String transactionId;
    private String cpf;
    private String deliveryAddress;
    private String status;
   // @OneToMany(mappedBy = "product")
    @Transient
    private List<OrderItem> items;

}
