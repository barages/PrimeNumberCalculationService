package com.example.prime.controller;

import com.example.prime.model.PrimeNumberDetails;
import com.example.prime.service.PrimeCalculationService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    @Autowired
    PrimeCalculationService primeCalculationService;

    @GetMapping(value = "/primes/{number}")
    public PrimeNumberDetails getPrimeNumbers(@ApiParam( example="10", value="Prime numbers upto") @PathVariable(value = "number") int number){

       return primeCalculationService.calculatePrimes(number);

    }

}
