package com.bridgelabz.user_regd.repository;

import com.bridgelabz.user_regd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user e, country ed WHERE e.id = ed.id AND ed.countrys = :country",nativeQuery = true)
    List<User> findByCountry(String country);

    @Query(value = "SELECT * FROM addressbook.person ORDER BY city ASC", nativeQuery = true)
    List<User> sortByCity();

    @Query(value = "SELECT * FROM addressbook.person ORDER BY name ASC", nativeQuery = true)
    List<User> sortByName();
}
