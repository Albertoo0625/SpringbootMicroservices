package com.example.ecommerce.Customer;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document
public class Customer {
    @Id
    public String id;
    public String firstname;
    public String lastname;
    public String email;
    public Address address;

}
