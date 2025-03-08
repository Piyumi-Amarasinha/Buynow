package com.myminiproject.order.controller;

import com.myminiproject.order.dto.OrderDTO;
import com.myminiproject.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/order")

public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/addorder")
    public OrderDTO addOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.addOrder(orderDTO);
    }

    @GetMapping("/getorders")
    public List<OrderDTO> getOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/getorder/{orderId}")
    public OrderDTO findById(@PathVariable int orderId) {
        return orderService.getOneOrder(orderId);
    }

    @PutMapping("/updateorder")
    public OrderDTO updateOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.updateOrder(orderDTO);
    }

    @DeleteMapping("/deleteorder/{orderId}")
    public String deleteOrder(@PathVariable int orderId) {
        return orderService.deleteOrder(orderId);
    }
}
