package br.com.vakinha.vakinhaapi.resources;

import br.com.vakinha.vakinhaapi.models.Product;
import br.com.vakinha.vakinhaapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductResources {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<Product> add(@RequestBody Product product) {
        Product pr = productRepository.save(product);

        if (pr != null) {
                return ResponseEntity.ok(pr);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Product>> getAll() {
        List<Product> result = productRepository.findAll();

        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}