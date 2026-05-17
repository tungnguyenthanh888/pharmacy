package com.medical.pharmacyservice.controller;


import com.medical.pharmacyservice.service.BillService;
import com.netflix.discovery.converters.Auto;
import feign.Body;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bill")
@RequiredArgsConstructor
public class BillController {
    @Autowired
    private final BillService billService;

    @PostMapping
    private double calculateBill(@RequestBody double total)
    {
        return billService.calculateBilling(total);
    }
}
