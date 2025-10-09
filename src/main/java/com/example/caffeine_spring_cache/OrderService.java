package com.example.caffeine_spring_cache;

import com.example.caffeine_spring_cache.models.Order;
import com.example.caffeine_spring_cache.models.OrderItem;
import com.example.caffeine_spring_cache.models.PaymentInfo;
import com.example.caffeine_spring_cache.models.ShippingInfo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
public class OrderService {

    private final Random random = new Random();

    @Cacheable(value = "orders", key = "#orderId")
    public Order getOrderWithCache(Long orderId) {
        simulateSlowDatabase();
        return createOrder(orderId);
    }

    public Order getOrderNoCache(Long orderId) {
        simulateSlowDatabase();
        return createOrder(orderId);
    }

    public Order createOrder(Long orderId) {
        Order order = new Order();
        order.setId(orderId);
        order.setCustomerName("Cliente " + orderId);

        order.setItems(Arrays.asList(
                new OrderItem("Produto A", random.nextInt(5) + 1, 10.0),
                new OrderItem("Produto B", random.nextInt(5) + 1, 20.0)
        ));

        order.setShipping(new ShippingInfo("Rua Exemplo, 123", "Transportadora X"));
        order.setPayment(new PaymentInfo("Cartão", "Pago"));

        return order;
    }

    private void simulateSlowDatabase() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}