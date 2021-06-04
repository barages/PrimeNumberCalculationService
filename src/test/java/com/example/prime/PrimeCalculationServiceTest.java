package com.example.prime;


import com.example.prime.model.PrimeNumberDetails;
import com.example.prime.service.PrimeCalculationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrimeCalculationServiceTest {

    @Autowired
    PrimeCalculationService primeCalculationService;

    @Test
    public void calculatePrimes_test(){
        PrimeNumberDetails primeNumberDetails_15 = primeCalculationService.calculatePrimes(15);
        Assertions.assertEquals(TestData.PRIME_NUMBER_UNDER_15 ,primeNumberDetails_15);

        PrimeNumberDetails primeNumberDetails_0 = primeCalculationService.calculatePrimes(0);
        Assertions.assertEquals(TestData.PRIME_NUMBER_UNDER_0 ,primeNumberDetails_0);
    }

}
