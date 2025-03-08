package com.myminiproject.inventory.service;

import com.myminiproject.inventory.DTO.InventoryDTO;
import com.myminiproject.inventory.model.Inventory;
import com.myminiproject.inventory.repo.InventoryRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class InventoryService {
    @Autowired
    private InventoryRepo inventoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    public InventoryDTO addInventory(InventoryDTO inventoryDTO) {
        inventoryRepo.save(modelMapper.map(inventoryDTO, Inventory.class));
        return inventoryDTO;
    }

    public List<InventoryDTO> getAllInventories() {
        List<Inventory>InventoryList = inventoryRepo.findAll();
        return modelMapper.map(InventoryList, new TypeToken<List<InventoryDTO>>(){}.getType());
    }

    public InventoryDTO getOneInventory(int inventoryId) {
        Optional<Inventory> inventory = inventoryRepo.findById(inventoryId);
        return inventory.map(f -> modelMapper.map(f, InventoryDTO.class))
                .orElse(null);
    }

    public InventoryDTO updateInventory(InventoryDTO inventoryDTO) {
        inventoryRepo.save(modelMapper.map(inventoryDTO, Inventory.class));
        return inventoryDTO;
    }

    public String deleteInventory(Integer inventoryId) {
        inventoryRepo.deleteById(inventoryId);
        return "Inventory deleted!";
    }

}
