package name.alexkosarev.sandbox.services;

import java.util.Arrays;
import java.util.Collection;
import name.alexkosarev.sandbox.entities.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Сервис для работы с людьми.
 * 
 * @author Alexander Kosarev
 */
@RestController
@RequestMapping("person")
public class PersonService {
    
    @GetMapping(value = "{id}", produces = "application/vnd.person.v1+json")
    public ResponseEntity<Person> findOne(@PathVariable int id) {
        return ResponseEntity.ok(new Person(id, "John Doe", "john.doe@example.com"));
    }

    /**
     * Получения списка людей.
     * 
     * @return 
     */
    @GetMapping(produces = "application/vnd.person.v1+json")
    public ResponseEntity<Collection<Person>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new Person(1, "John Doe", "john.doe@example.com"), new Person(2, "Jim Beam", "jim.beam@example.com")));
    }
}
