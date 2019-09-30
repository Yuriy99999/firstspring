package edu.tatryn.firstspring.service.person.interfaces;

import edu.tatryn.firstspring.model.Person;
import edu.tatryn.firstspring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


@Service
public class PersonServiceImpl implements IPersonService {
    private static Logger logger = Logger.getLogger(Person.class.getName());


    List<Person> persons = new ArrayList<>(
            Arrays.asList(
                    new Person("Ivan", 20),
                    new Person("Petro", 25),
                    new Person("Sidor", 18)
            )
    );

    @Autowired
    PersonRepository repository;

    @PostConstruct
    void init(){
        repository.deleteAll();
        repository.saveAll(persons);

    }

    @Override
    public List<Person> getAll() {
        logger.info("method getAll was called");
        return repository.findAll();
    }

    @Override
    public Person get(String id) {

        return repository.findById(id).orElse(null);
    }

    @Override
    public Person create(Person person) {

        return repository.save(person);
    }

    @Override
    public Person update(Person person) {
        return repository.save(person);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public Person getByName(String name) {
        return repository.findByName(name);
    }




}
