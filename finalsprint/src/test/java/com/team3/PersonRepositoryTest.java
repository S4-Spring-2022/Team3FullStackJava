package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.Address;
import com.team3.rest.Person;
import com.team3.rest.PersonRepository;

@ExtendWith(MockitoExtension.class)
public class PersonRepositoryTest {

    @Mock
    private PersonRepository personRepository;
    
    @Test
    public void testPersonRepository() {
        Person person = new Person();
        
        person.setId(1L);
        person.setFirstName("John");
        person.setFirstName("Doe");
        person.setEmail("john_doe@email.com");
        person.setPhone("+1 (709) 777-1234");
        person.setAddress(new Address("123 Main Street", "St. John's", "NL", "A1N 1A1", "Canada"));

        List<Person> personList = List.of(person);

        Mockito.when(personRepository.findByFirstName("John")).thenReturn(personList);
        List<Person> foundPerson = personRepository.findByFirstName("John");
        assertEquals(person, foundPerson.get(0));
        
    }
}

