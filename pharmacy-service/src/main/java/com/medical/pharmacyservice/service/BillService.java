package com.medical.pharmacyservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BillService {
    @Value("${app.vat}")
    private final double vatRate;

    public double calculateBilling(double total)
    {
        return total * vatRate;
    }
}
