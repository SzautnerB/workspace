package Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;
@RestController
public class PersonController {
    private final PersonService personService;
    
    @Autowired
    public PersonController(PersonService personService){
        this.personService=personService;
    }
@PostMapping
public void insertPerson(Person person){
    personService.addPerson(person);
}
}
