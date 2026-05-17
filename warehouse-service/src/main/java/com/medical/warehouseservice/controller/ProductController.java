package com.medical.warehouseservice.controller;

import com.medical.warehouseservice.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @GetMapping("/{id}")
    private ProductDTO findProduct(@PathVariable("id") long id)
    {
        return new ProductDTO(id,"iphone 17 prm", 5, 15000000);
    }
}
