package com.bridgelabz.user_regd.services;

import com.bridgelabz.user_regd.dto.UserDTO;
import com.bridgelabz.user_regd.entity.User;
import com.bridgelabz.user_regd.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices implements IUserServices {

    @Autowired
    IUserRepository iUserRepository;
    @Override
    public User addUser(UserDTO userDTO) {

        User user = new User(userDTO);
        return iUserRepository.save(user);
    }

    @Override
    public List<User> getAddressBook() {
        return iUserRepository.findAll();
    }

    @Override
    public Optional<User> getById(int id) {
        return iUserRepository.findById(id);
    }

    @Override
    public String deleteById(int id) {
        if (iUserRepository.findById(id).isPresent()) {
            iUserRepository.deleteById(id);
            return "Employee ID: " + id + " is Deleted!";
        }
        return "Employee not present!";
    }

    @Override
    public String editUser(UserDTO userDTO, int id) {
        if (iUserRepository.findById(id).isPresent()) {
            User user = new User(userDTO, id);
            user.setId(id);
            User string = iUserRepository.save(user);
            return string.toString();
        }
        return null;
    }

    @Override
    public List<User> getUserByCountry(String country) {

        return iUserRepository.findByCountry(country);
    }
    @Override
    public Object sortByCity() {
        return iUserRepository.sortByCity();
    }

    @Override
    public Object sortByName() {
        return iUserRepository.sortByName();
    }
}
