package com.learning.realProjectProblems.controller;


import com.learning.realProjectProblems.service.ReadDataFromCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadDataFromCsv {
    @Autowired
    ReadDataFromCsvService readDataFromCsvService;

    @GetMapping("/filterProductPrice")
    public int filterProductPrice() {

        // Add logic to filter product price
        return readDataFromCsvService.getFilteredPrice();
    }
}
