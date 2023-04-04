package com.company.model;

import lombok.*;


import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    // Thymeleaf accepts  yyyy-MM-dd but LocalDate accepts mm-dd-yyyy or yyyy-dd-mm
    private LocalDate birthday;
    private String email;
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
