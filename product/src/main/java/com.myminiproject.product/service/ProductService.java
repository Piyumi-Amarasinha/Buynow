package com.myminiproject.product.service;

import com.myminiproject.product.dto.ProductDTO;
import com.myminiproject.product.model.Product;
import com.myminiproject.product.repo.ProductRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ProductDTO addProduct(ProductDTO productDTO) {
        productRepo.save(modelMapper.map(productDTO, Product.class));
        return productDTO;
    }

    public List<ProductDTO> getAllProducts() {
        List<Product>ProductList = productRepo.findAll();
        return modelMapper.map(ProductList, new TypeToken<List<ProductDTO>>(){}.getType());
    }

    public ProductDTO getOneProduct(int productId) {
        Optional<Product> product = productRepo.findById(productId);
        return product.map(f -> modelMapper.map(f, ProductDTO.class))
                .orElse(null);
    }

    public ProductDTO updateProduct(ProductDTO productDTO) {
        productRepo.save(modelMapper.map(productDTO, Product.class));
        return productDTO;
    }

    public String deleteProduct(int productId) {
        productRepo.deleteById(productId);
        return "Product deleted!";
    }
}
