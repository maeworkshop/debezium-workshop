package com.maemresen.debezium.postgres.spring.repository;


import com.maemresen.debezium.postgres.spring.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
