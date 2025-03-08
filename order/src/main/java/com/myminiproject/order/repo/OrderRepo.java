package com.myminiproject.order.repo;

import com.myminiproject.order.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import java.util.Optional;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
    @Override
    Optional<Order> findById(@NonNull Integer orderId);
}
