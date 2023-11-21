package com.codegym.casemodule4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication @EnableWebSecurity
public class CaseModule4Application {

    public static void main(String[] args) {
        SpringApplication.run(CaseModule4Application.class, args);
    }

}
