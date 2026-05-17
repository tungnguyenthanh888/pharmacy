package com.medical.pharmacyservice.service;

import com.medical.pharmacyservice.dto.ProductDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BillService {
    @Autowired
    private final ProductService productService;

    @Value("${app.vat}")
    private final double vatRate;

    public double calculateBilling(double total)
    {
        return total * vatRate;
    }

    @CircuitBreaker(name="warehouseCB", fallbackMethod = "fallbackGetProduct")
    private ProductDTO getProductById(long id){
        return productService.getProductById(id);
    }

    private String fallbackGetProduct(Exception ex)
    {
        return "Warehouse service khong phan hoi.";
    }
}
