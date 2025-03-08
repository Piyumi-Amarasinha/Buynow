package com.myminiproject.product.repo;

import com.myminiproject.product.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Override
    Optional<Product> findById(@NonNull Integer productId);
}
