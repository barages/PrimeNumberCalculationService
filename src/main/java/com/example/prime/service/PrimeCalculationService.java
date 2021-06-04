package com.example.prime.service;

import com.example.prime.model.PrimeNumberDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PrimeCalculationService {


    public PrimeNumberDetails calculatePrimes(int number) {
       List<Integer> primeNumberList  =  IntStream.rangeClosed(2,number).filter(this::isNumberPrime).boxed().collect(Collectors.toList());
        return PrimeNumberDetails.builder().initials(number).primes(primeNumberList).build();
    }

    private boolean isNumberPrime(int number){
       return  IntStream.range(2,number).allMatch(n -> number % n != 0);
    }


}