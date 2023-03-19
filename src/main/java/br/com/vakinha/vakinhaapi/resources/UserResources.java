package br.com.vakinha.vakinhaapi.resources;

import br.com.vakinha.vakinhaapi.models.User;
import br.com.vakinha.vakinhaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/v1/register")
@CrossOrigin(origins = "*", allowedHeaders = "*")
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