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
@Table(name = "USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false, unique=true)
    private String email;
    @Column(length = 50, nullable = false)
    private String password;

}

