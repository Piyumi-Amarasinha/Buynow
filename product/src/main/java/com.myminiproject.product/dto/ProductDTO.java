package com.myminiproject.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private int productId;
    private LocalDateTime dateTime;
    private String productName;
    private String productDescription;
//    private int quantity;
}
