package com.myminiproject.order.service;

import com.myminiproject.order.dto.OrderDTO;
import com.myminiproject.order.model.Order;
import com.myminiproject.order.repo.OrderRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;

    public OrderDTO addOrder(OrderDTO orderDTO) {
        orderRepo.save(modelMapper.map(orderDTO, Order.class));
        return orderDTO;
    }

    public List<OrderDTO> getAllOrders() {
        List<Order>OrderList = orderRepo.findAll();
        return modelMapper.map(OrderList, new TypeToken<List<OrderDTO>>(){}.getType());
    }

    public OrderDTO getOneOrder(int orderId) {
        Optional<Order> order = orderRepo.findById(orderId);
        return order.map(f -> modelMapper.map(f, OrderDTO.class))
                .orElse(null);
    }
    public OrderDTO updateOrder(OrderDTO orderDTO) {
        orderRepo.save(modelMapper.map(orderDTO, Order.class));
        return orderDTO;
    }

    public String deleteOrder(Integer orderId) {
        orderRepo.deleteById(orderId);
        return "Order deleted!";
    }
}
