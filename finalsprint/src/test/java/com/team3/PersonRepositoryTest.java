package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
        person.setAddress(new Address("123 Main Street", "St. John's", "NL", "A1A 1A1", "Canada"));

        List<Person> personList = List.of(person);

        Mockito.when(personRepository.findByFirstName("John")).thenReturn(personList);
        List<Person> foundPerson = personRepository.findByFirstName("John");
        assertEquals(person, foundPerson.get(0));


        Person person2 = new Person();

        person2.setId(2L);
        person2.setFirstName("Jane");
        person2.setLastName("Doe");
        person2.setEmail("jane_doe@email.com");
        person2.setPhone("+1 (709) 777-5678");
        person2.setAddress(new Address("456 Main Street", "St. John's", "NL", "A1B 1A1", "Canada"));
        
        // add person to list
        personList.add(person2);

        Mockito.when(personRepository.findByFirstName("Jane")).thenReturn(personList);
        foundPerson = personRepository.findByFirstName("Jane");
        assertEquals(person2, foundPerson.get(1));


        Person person3 = new Person();

        person3.setId(3L);
        person3.setFirstName("Joe");
        person3.setLastName("Doe");
        person3.setEmail("joe_doe@email.com");
        person3.setPhone("+1 (709) 777-9012");
        person3.setAddress(new Address("789 Main Street", "St. John's", "NL", "A1C 1A1", "Canada"));

        Mockito.when(personRepository.findByFirstName("Joe")).thenReturn(personList);
        foundPerson = personRepository.findByFirstName("Joe");
        assertEquals(person3, foundPerson.get(2));


        Person person4 = new Person();

        person4.setId(4L);
        person4.setFirstName("Mo");
        person4.setLastName("Doe");
        person4.setEmail("mo_doe@email.com");
        person4.setPhone("+1 (709) 777-3456");
        person4.setAddress(new Address("012 Main Street", "St. John's", "NL", "A1D 1A1", "Canada"));

        Mockito.when(personRepository.findByFirstName("Mo")).thenReturn(personList);
        foundPerson = personRepository.findByFirstName("Mo");
        assertEquals(person4, foundPerson.get(3));


        // print person list
        for (Person p : personList) {
            System.out.println(p);
        }
    }
}

