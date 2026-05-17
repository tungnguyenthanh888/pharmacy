package com.medical.pharmacyservice.service;

import com.medical.pharmacyservice.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name="warehouse-service")
public interface ProductService {
    @GetMapping("/api/v1/products/{id}")
    ProductDTO getProductById(@PathVariable("id") Long id);
}
