package com.example.ecommerce.Customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest (
        String id,

        @NotNull(message = "Customer Firstname is required")
        String firstname,

        @NotNull(message = "Customer Firstname is required")
        String lastname,

        @NotNull(message = "Customer Firstname is required")
        @Email(message= "Customer Email is not a valid email")
        String email,

        Address address
){
}
