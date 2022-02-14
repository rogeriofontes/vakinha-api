package br.com.vakinha.vakinhaapi.resources;

import br.com.vakinha.vakinhaapi.models.Order;
import br.com.vakinha.vakinhaapi.models.OrderDTO;
import br.com.vakinha.vakinhaapi.models.OrderPixDTO;
import br.com.vakinha.vakinhaapi.models.Product;
import br.com.vakinha.vakinhaapi.repositories.OrderRepository;
import br.com.vakinha.vakinhaapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/orders")
public class OrderResources {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public ResponseEntity<OrderPixDTO> add(@RequestBody OrderDTO orderDTO) {
        System.out.println(orderDTO.toString());
        /*Order pr = orderRepository.save(order);

        if (pr != null) {
                return ResponseEntity.ok(pr);
        } else {
            return ResponseEntity.noContent().build();
        } */

        OrderPixDTO orderPixDTO = new OrderPixDTO.OrderPixDTOBuilder("3830ce06-8c70-11ec-a8a3-0242ac120002")
                .totalValue(30)
                .image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTasvi4i7sEQvaC3yZtDoL8P72P38Nhwy7A-VkFGHwvdGj2BL2UMCnrheBJdo2C7IEJPk&usqp=CAU")
                .build();

        return ResponseEntity.ok(orderPixDTO);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Order>> getAll() {
        List<Order> result = orderRepository.findAll();

        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}