package br.com.vakinha.vakinhaapi.models;

import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
public class RegisterDTO implements Serializable {

    private String name;
    private String email;
    private String password;

}

