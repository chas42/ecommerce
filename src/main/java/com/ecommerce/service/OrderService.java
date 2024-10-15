package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.order.OrderDto;
import com.ecommerce.model.Order;
import com.ecommerce.model.OrderItem;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;
import com.ecommerce.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    public void create(Long userId, Long productId, Integer quantity) {

        User user = userService.getUserById(userId);

        Order newOrder = new Order();
        newOrder.setUser(user);

        Product product = productService.getProductById(productId);

        OrderItem newOrderItem = new OrderItem(product, quantity);
        newOrder.addOrderItem(newOrderItem);

        orderRepository.save(newOrder);

    }

    public void addItemToOrder(Long orderId, Long productId, Integer quantity) {

        Order order = orderRepository.findById(orderId).get();

        Product product = productService.getProductById(productId);

        OrderItem newOrderItem = new OrderItem(product, quantity);

        order.addOrderItem(newOrderItem);

        orderRepository.save(order);
    }

    public void updateItemInOrder(Long orderId, Long productId, Integer quantity) {

        Order order = orderRepository.findById(orderId).get();

        OrderItem orderItem = order.getOrderItems().stream()
                .filter(item -> item.getProduct().getId().equals(productId))
                .findFirst()
                .get();

        orderItem.setQuantity(quantity);

        orderRepository.save(order);
    }


    public void deleteItemFromOrder(Long orderId, Long productId) {

        Order order = orderRepository.findById(orderId).get();

        OrderItem orderItem = order.getOrderItems().stream()
                .filter(item -> item.getProduct().getId().equals(productId))
                .findFirst()
                .get();

        order.removeOrderItem(orderItem);

        orderRepository.save(order);
    }

    public OrderDto getOrderByUserId(Long userId) {

        Order order = orderRepository.findByUserIdOrderByCreatedAtDesc(userId);

        return new OrderDto(order);
    }

}
