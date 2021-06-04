package com.example.prime;

import com.example.prime.exceptions.ErrorResult;
import com.example.prime.model.PrimeNumberDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PrimeNumberCalculationServiceApplicationTests {

	public PrimeNumberCalculationServiceApplicationTests(){

	}


	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void getPrimeNumbers_test(){

		ResponseEntity<PrimeNumberDetails> response =  restTemplate.exchange(createURLWithPort("/primes/10")
		, HttpMethod.GET,null, PrimeNumberDetails.class);

		Assertions.assertEquals(TestData.PRIME_NUMBER_DETAILS,response.getBody());
	}

	@Test
	public void getPrimeNumbers_test_bad_request(){

		ResponseEntity<ErrorResult> response =  restTemplate.exchange(createURLWithPort("/primes/abc")
				, HttpMethod.GET,null, ErrorResult.class);

		Assertions.assertEquals(HttpStatus.BAD_REQUEST,response.getStatusCode());
	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}
