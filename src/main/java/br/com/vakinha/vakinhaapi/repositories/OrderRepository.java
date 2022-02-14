package br.com.vakinha.vakinhaapi.repositories;

import br.com.vakinha.vakinhaapi.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
