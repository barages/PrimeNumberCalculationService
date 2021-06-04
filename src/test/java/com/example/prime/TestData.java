package com.example.prime;

import com.example.prime.model.PrimeNumberDetails;

import java.util.Arrays;

public class TestData {

    public static  final PrimeNumberDetails PRIME_NUMBER_DETAILS =
                        PrimeNumberDetails.builder()
                                .primes(Arrays.asList(2,3,5,7))
                                .initials(10)
                                .build();

    public static final PrimeNumberDetails PRIME_NUMBER_UNDER_15 =
                        PrimeNumberDetails.builder()
                                .primes(Arrays.asList(2,3,5,7,11,13))
                                .initials(15)
                                .build();
    public static final PrimeNumberDetails PRIME_NUMBER_UNDER_0 =
            PrimeNumberDetails.builder()
                    .primes(Arrays.asList())
                    .initials(0)
                    .build();
}
