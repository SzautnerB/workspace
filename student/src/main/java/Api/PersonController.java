package Api;

import model.Person;
import service.PersonService;

public class PersonController {
    private final PersonService personService;
    
    
    public PersonController(PersonService personService){
        this.personService=personService;
    }

public void insertPerson(Person person){
    personService.addPerson(person);
}
}
