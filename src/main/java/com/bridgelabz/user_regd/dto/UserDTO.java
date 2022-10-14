package com.bridgelabz.user_regd.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Date;

@Data
@RequiredArgsConstructor
public class UserDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$", message = "First Name is invalid! it must have at least 2 characters and the first character should be uppercase.")
    private String firstName;

    @Pattern(regexp = "[A-Z]$", message = "Middle Name is invalid!")
    private String middleName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$", message = "Last Name is invalid! it must have at least 2 characters and the first character should be uppercase.")
    private String lastName;

    @NotEmpty(message = "Profile pic can't be empty")
    private String profilePic;

    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$",message = "Please enter a valid number")
    private String mobileNumber;

    @Email(message = "Please enter a valid email")
    private String email;

    @NotEmpty(message = "Please enter your country")
    private String country;

    @NotEmpty(message = "Please enter your gender")
    private String gender;

    @NotEmpty(message = "Please enter the address")
    private String address;

    @NotEmpty(message = "Please enter the username")
    private String userName;

    @NotEmpty(message = "Please enter the password")
    private String password;

    @NotEmpty(message = "Please enter the role")
    private String role;

    private LocalDate dob;
}
