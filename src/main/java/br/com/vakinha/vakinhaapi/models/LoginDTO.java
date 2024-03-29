package br.com.vakinha.vakinhaapi.models;

import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
public class LoginDTO implements Serializable {
    private String email;
    private String password;
}

