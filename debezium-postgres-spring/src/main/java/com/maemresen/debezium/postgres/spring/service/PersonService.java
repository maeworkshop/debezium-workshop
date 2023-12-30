package com.maemresen.debezium.postgres.spring.service;

import com.maemresen.debezium.postgres.spring.entity.Person;
import com.maemresen.debezium.postgres.spring.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public Person createAndSaveRandomPerson() {
        final String randomFirstName = "Maemre" + Math.random();
        final String randomLastName = "Sen" + Math.random();
        final Person person = new Person(null, randomFirstName, randomLastName);
        return save(person);
    }

    private Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
