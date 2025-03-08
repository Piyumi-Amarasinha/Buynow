package com.myminiproject.inventory.controller;

import com.myminiproject.inventory.DTO.InventoryDTO;
import com.myminiproject.inventory.model.Inventory;
import com.myminiproject.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/addinventory")
    public InventoryDTO addInventory(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.addInventory(inventoryDTO);
    }

    @GetMapping("/getinventories")
    public List<InventoryDTO> getAllInventories() {
        return inventoryService.getAllInventories();
    }

    @GetMapping("/getinventory/{inventoryId}")
    public InventoryDTO findById(@PathVariable int inventoryId) {
        return inventoryService.getOneInventory(inventoryId);
    }

    @PutMapping("/updateinventory")
    public InventoryDTO updateInventory(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.updateInventory(inventoryDTO);
    }

    @DeleteMapping("/deleteinventory/{inventoryId}")
    public String deleteInventory(@PathVariable int inventoryId) {
        return inventoryService.deleteInventory(inventoryId);
    }
}
