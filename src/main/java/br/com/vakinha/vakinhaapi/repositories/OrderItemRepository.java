package br.com.vakinha.vakinhaapi.repositories;

import br.com.vakinha.vakinhaapi.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
