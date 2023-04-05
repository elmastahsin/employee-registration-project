package com.company.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;


import javax.validation.constraints.*;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    //@NotNull // ---> field shouldnt be null only NutNull
    //@NotEmpty // ---> field shouldnt be empty "" NutNull + NotEmpty
    @NotBlank // ---> field shouldnt be blank "     " NutNull + NotEmpty+ NotBlank**cover all of them
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;
    // Thymeleaf accepts  yyyy-MM-dd but LocalDate accepts mm-dd-yyyy or yyyy-dd-mm
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Pattern(regexp ="^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])){4,}$" )
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
