package com.example.caffeine_spring_cache;

import com.example.caffeine_spring_cache.models.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/no-cache/{id}")
    public Order getUserNoCache(@PathVariable long id) {
        return service.getOrderNoCache(id); // sem cache
    }

    @GetMapping("/with-cache/{id}")
    public Order getUserWithCache(@PathVariable long id) {
        return service.getOrderWithCache(id); // com cache
    }
}
