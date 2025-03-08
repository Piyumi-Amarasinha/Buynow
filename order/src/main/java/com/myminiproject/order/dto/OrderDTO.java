package com.myminiproject.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private int orderId;
    private LocalDateTime orderDate;
    private String orderName;
    private String orderDescription;
    private String orderStatus;

    private int customerId;
    private String customerName;
}
