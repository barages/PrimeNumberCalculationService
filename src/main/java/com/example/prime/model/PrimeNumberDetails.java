package com.example.prime.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrimeNumberDetails {

    @ApiModelProperty(name = "Inititals " , value = "Prime numbers upto")
    Integer initials;
    @ApiModelProperty(name="primes" , value = "Prime number List" ,example = "2,3,,5,7" , dataType = "List")
    List<Integer> primes;

}
