package com.bridgelabz.user_regd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class UserRegdApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserRegdApplication.class, args);
        System.out.println("Hello Person");
        log.info("Hello Jeevan");
    }

}
