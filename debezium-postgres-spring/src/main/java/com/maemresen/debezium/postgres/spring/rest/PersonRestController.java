package com.maemresen.debezium.postgres.spring.rest;

import com.maemresen.debezium.postgres.spring.entity.Person;
import com.maemresen.debezium.postgres.spring.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("api/person")
@RestController
public class PersonRestController {

    private final PersonRepository personRepository;

    @GetMapping("/random")
    public ResponseEntity<Person> random() {
        final String randomFirstName = "Maemre" + Math.random();
        final String randomLastName = "Sen" + Math.random();
        return ResponseEntity.ok(personRepository.save(new Person(null, randomFirstName, randomLastName)));
    }
}
