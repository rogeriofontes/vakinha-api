package br.com.vakinha.vakinhaapi.models;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
//https://www.mballem.com/post/simplificando-com-builder-pattern/
//https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
public class OrderPixDTO {
    private String code;
    private String image;
    private double totalValue;

}
