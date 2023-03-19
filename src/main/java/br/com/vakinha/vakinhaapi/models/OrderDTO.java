package br.com.vakinha.vakinhaapi.models;

import lombok.*;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
public class OrderDTO {
    private Long userId;
    private String cpf;
    private String address;
    private List<ShoppingCartModel> items;
}
