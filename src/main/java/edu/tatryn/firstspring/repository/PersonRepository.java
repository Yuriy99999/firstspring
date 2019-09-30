package edu.tatryn.firstspring.repository;

import org.springframework.stereotype.Repository;


import edu.tatryn.firstspring.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository <Person, String> {
    Person findByName(String name);
    List<Person> findByAgeAfter(int age);



}

