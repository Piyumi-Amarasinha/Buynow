package com.myminiproject.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatic ID generator.
    @Column(name = "product_id")
    private int productId;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateTime;

    private String productName;
    private String productDescription;
//    private int quantity;
}
