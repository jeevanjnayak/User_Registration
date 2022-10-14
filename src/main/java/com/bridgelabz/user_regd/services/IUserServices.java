package com.bridgelabz.user_regd.services;


import com.bridgelabz.user_regd.dto.UserDTO;
import com.bridgelabz.user_regd.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserServices {
    User addUser(UserDTO userDTO);

    List<User> getAddressBook();

    Optional<User> getById(int id);

    String deleteById(int id);

    String editUser(UserDTO employeeDto, int id);

    List<User> getUserByCountry(String country);
    Object sortByCity();
    Object sortByName();
}
