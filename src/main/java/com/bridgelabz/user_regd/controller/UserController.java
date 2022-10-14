package com.bridgelabz.user_regd.controller;


import com.bridgelabz.user_regd.dto.ResponseDTO;
import com.bridgelabz.user_regd.dto.UserDTO;
import com.bridgelabz.user_regd.entity.User;
import com.bridgelabz.user_regd.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserServices iUserServices;

    //adding an employee and saving to DB using post mapping and taking the input by RequestBody
    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> createEmployee(@Valid @RequestBody UserDTO userDTO) {
        User user = iUserServices.addUser(userDTO);
        ResponseDTO responseDTO = new ResponseDTO("Employee added Successfully", user);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    //getting all the employee and showing in a list form from the DB using get mapping
    @GetMapping("/showall")
    public ResponseEntity<ResponseDTO> getAllEmployees() {
        ResponseDTO responseDTO = new ResponseDTO("Employee List shown Bellow", iUserServices.getAddressBook());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //getting the employee with a particular id from the DB and showing using get mapping
    @GetMapping("/show/{id}")
    public ResponseEntity<ResponseDTO> getByEmployee(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("Employee with id " + id + " Shown bellow", iUserServices.getById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //deleting the employee with a particular id from the DB using Delete mapping
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("Employee with id " + id + " Deleted Successfully", iUserServices.deleteById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //getting the employee with a particular id from the DB and updating the data and storing to DB using put mapping
    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO> editEmployee(@Valid @RequestBody UserDTO userDTO, @PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("Employee with id " + id + " Updated Successfully", iUserServices.editUser(userDTO, id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/country/{country}")
    public ResponseEntity<ResponseDTO> getUserByCountry(@PathVariable String country){
        List<User> userList = iUserServices.getUserByCountry(country);
        ResponseDTO responseDTO = new ResponseDTO("employee list gotten successfully",userList);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
    @GetMapping(value = "/sortcity")
    public ResponseEntity<ResponseDTO> sortByCity(){
        ResponseDTO responseDTO = new ResponseDTO("Sorting The records by City", iUserServices.sortByCity());
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
    @GetMapping(value = "/sortname")
    public ResponseEntity<ResponseDTO> sortByName(){
        ResponseDTO responseDTO = new ResponseDTO("Sorting The records by Name", iUserServices.sortByName());
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
}
