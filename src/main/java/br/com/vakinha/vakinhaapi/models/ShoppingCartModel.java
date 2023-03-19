package br.com.vakinha.vakinhaapi.models;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
public class ShoppingCartModel {
    private int quantity;
    private int productId;

}
