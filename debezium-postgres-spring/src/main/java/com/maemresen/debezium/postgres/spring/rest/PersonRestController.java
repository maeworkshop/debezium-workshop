package com.maemresen.debezium.postgres.spring.rest;

import com.maemresen.debezium.postgres.spring.entity.Person;
import com.maemresen.debezium.postgres.spring.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("api/person")
@RestController
public class PersonRestController {

    private final PersonService personService;

    @GetMapping("/random")
    public ResponseEntity<Person> random() {
        return ResponseEntity.ok(personService.createAndSaveRandomPerson());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> all() {
        return ResponseEntity.ok(personService.findAll());
    }
}
