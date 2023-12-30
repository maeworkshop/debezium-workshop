package com.maemresen.debezium.postgres.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DebeziumPostgresSpringApp {

    public static void main(String[] args) {
        SpringApplication.run(DebeziumPostgresSpringApp.class, args);
    }
}
