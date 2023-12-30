package com.maemresen.debezium.postgres.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tableName;

    private String operation;

    private LocalDateTime time;

    private String owner;

    private String value;
}
