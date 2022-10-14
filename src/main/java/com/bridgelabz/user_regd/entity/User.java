package com.bridgelabz.user_regd.entity;

import com.bridgelabz.user_regd.dto.UserDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
@ToString
@RequiredArgsConstructor

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String middleName;
    private String lastName;
    private String profilePic;
    private String mobileNumber;
    private String email;
    private String country;
    private String gender;
    private String address;
    private String userName;
    private String password;
    private String role;
    private LocalDate dob;

//    int age = Period.between(dob, LocalDate.now()).getYears();

    public User(UserDTO userDTO) {
        this.firstName = userDTO.getFirstName();
        this.middleName = userDTO.getMiddleName();
        this.lastName = userDTO.getLastName();
        this.profilePic = userDTO.getProfilePic();
        this.mobileNumber = userDTO.getMobileNumber();
        this.email = userDTO.getEmail();
        this.country = userDTO.getCountry();
        this.gender = userDTO.getGender();
        this.address = userDTO.getAddress();
        this.userName = userDTO.getUserName();
        this.password = userDTO.getPassword();
        this.role = userDTO.getRole();
        this.dob = userDTO.getDob();

    }

    public User(UserDTO userDTO, int id) {
        this.firstName = userDTO.getFirstName();
        this.middleName = userDTO.getMiddleName();
        this.lastName = userDTO.getLastName();
        this.profilePic = userDTO.getProfilePic();
        this.mobileNumber = userDTO.getMobileNumber();
        this.email = userDTO.getEmail();
        this.country = userDTO.getCountry();
        this.gender = userDTO.getGender();
        this.address = userDTO.getAddress();
        this.userName = userDTO.getUserName();
        this.password = userDTO.getPassword();
        this.role = userDTO.getRole();
        this.dob = userDTO.getDob();
        this.id = id;
    }

}

