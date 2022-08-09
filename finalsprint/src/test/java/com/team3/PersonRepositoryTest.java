package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

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
        person.setAddress("123 Main Street, New York, NY 10012");

        Mockito.when(personRepository.findById(1L)).thenReturn(person);
        Optional<Person> foundPerson = personRepository.findById(1L);
        assertEquals(person, foundPerson);
        
    
    }
}

