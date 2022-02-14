package br.com.vakinha.vakinhaapi.resources;

import br.com.vakinha.vakinhaapi.models.LoginDTO;
import br.com.vakinha.vakinhaapi.models.User;
import br.com.vakinha.vakinhaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/auth")
public class LoginResources {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> add(@RequestBody LoginDTO loginDTO) {
        User finded = userRepository.findByEmail(loginDTO.getEmail());

        if (finded != null) {
            if (finded.getEmail().equals(loginDTO.getEmail()) && finded.getPassword().equals(loginDTO.getPassword())) {
                return ResponseEntity.ok(finded);
            } else {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            }
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}