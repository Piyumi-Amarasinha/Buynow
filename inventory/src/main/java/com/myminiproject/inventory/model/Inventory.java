package com.myminiproject.inventory.model;

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
public class Inventory {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatic ID generator.
    @Column(name = "inventory_id")
    private int inventoryId;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateTime;

    private String inventoryName;
    private String inventoryDescription;
}
