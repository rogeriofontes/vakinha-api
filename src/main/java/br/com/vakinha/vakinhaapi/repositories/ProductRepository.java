package br.com.vakinha.vakinhaapi.repositories;

import br.com.vakinha.vakinhaapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
