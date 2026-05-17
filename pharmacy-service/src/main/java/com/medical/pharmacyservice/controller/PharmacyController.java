package com.medical.pharmacyservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pharmacy")
@RefreshScope
public class PharmacyController {
    @Value("${app.branchName}")
    private String branchName;

    @Value("${app.hotline}")
    private String hotline;

    @GetMapping
    public String testConfig()
    {
        return branchName + hotline;
    }
}
