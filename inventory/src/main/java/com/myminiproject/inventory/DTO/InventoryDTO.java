package com.myminiproject.inventory.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDTO {
    private Long inventoryId;
    private LocalDateTime dateTime;
    private String inventoryName;
    private String inventoryDescription;
}
