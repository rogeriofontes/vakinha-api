package br.com.vakinha.vakinhaapi.models;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
public class ProductModel {
    int id;
    String name;
    String description;
    double price;
    String image;

}
