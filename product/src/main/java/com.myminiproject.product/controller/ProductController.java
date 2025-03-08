package com.myminiproject.product.controller;

import com.myminiproject.product.dto.ProductDTO;
import com.myminiproject.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addProduct(productDTO);
    }

    @GetMapping("/getproducts")
    public List<ProductDTO> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getproduct")
    public ProductDTO findById(@PathVariable int productId) {
        return productService.getOneProduct(productId);
    }

    @PutMapping("/updateproduct")
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) {
        return productService.updateProduct(productDTO);
    }

    @DeleteMapping("/deleteproduct/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        return productService.deleteProduct(productId);
    }
}
