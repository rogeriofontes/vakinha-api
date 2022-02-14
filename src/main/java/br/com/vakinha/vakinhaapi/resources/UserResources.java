package br.com.vakinha.vakinhaapi.resources;

import br.com.vakinha.vakinhaapi.models.User;
import br.com.vakinha.vakinhaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/register")
public class UserResources {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        User save = userRepository.save(user);

        if (save != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}

//400