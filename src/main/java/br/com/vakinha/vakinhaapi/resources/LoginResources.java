package br.com.vakinha.vakinhaapi.resources;

import br.com.vakinha.vakinhaapi.models.LoginDTO;
import br.com.vakinha.vakinhaapi.models.RegisterDTO;
import br.com.vakinha.vakinhaapi.models.User;
import br.com.vakinha.vakinhaapi.repositories.UserRepository;
import br.com.vakinha.vakinhaapi.utils.RestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(path = "/api/v1/auth")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginResources {
    private static final Logger logger = LogManager.getLogger(LoginResources.class);

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

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterDTO registerDTO) {
        User finded = userRepository.findByEmail(registerDTO.getEmail());
        if (finded != null) {
            return ResponseEntity.badRequest().build();
        }

        logger.debug("Register DTO: {}", registerDTO);
        var user = new User();
        user.setName(registerDTO.getName());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());

        User saved = userRepository.save(user);

        if (saved != null){
            URI location = RestUtils.getUri(saved.getId());
            return ResponseEntity.created(location).body(saved);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}