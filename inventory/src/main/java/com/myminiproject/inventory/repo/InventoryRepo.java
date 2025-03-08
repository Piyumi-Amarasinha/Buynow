package com.myminiproject.inventory.repo;

import com.myminiproject.inventory.model.Inventory;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import java.util.Optional;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {
    @Override
    Optional<Inventory> findById(@NonNull Integer inventoryId);
}
