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
    
    Person person1 = 
    new Person("John", "Doe", "john_doe@email.com", "+1 709 777-1234", 
    new Address("123 Main Street", "St. Jphn's", "NL", "12345", "Canada"));
    Person person2 = 
    new Person("Jane", "Dock", "jane_doe@email.com", "+1 709 777-5678", 
    new Address("456 Main Street", "St. Jphn's", "NL", "A1B 1A1", "Canada"));
    Person person3 = 
    new Person("Joe", "Doe", "joe_doe@email.com", "+1 709 777-9012", 
    new Address("789 Main Street", "St. Jphn's", "NL", "A1C 1A1", "Canada"));
    Person person4 = 
    new Person("Jack", "Doe", "jack_doe@email.com", "+1 709 777-3456", 
    new Address("012 Main Street", "St. Jphn's", "NL", "A1D 1A1", "Canada"));

    
    List<Person> personList = List.of(person1, person2, person3, person4);

    @Test
    public void testFindByFirstName() {

        Mockito.when(personRepository.findByFirstName("John")).thenReturn(personList);
        List<Person> foundPerson = personRepository.findByFirstName("John");
        assertEquals(person1, foundPerson.get(0));
    }

    @Test
    public void testFindByLastName() {

        Mockito.when(personRepository.findByLastName("Dock")).thenReturn(personList);
        List<Person> foundPerson = personRepository.findByLastName("Dock");
        assertEquals(person2, foundPerson.get(1));
    }

    @Test
    public void testFindByEmail() {

        Mockito.when(personRepository.findByEmail("joe_doe@email.com")).thenReturn(personList);
        List<Person> foundPerson = personRepository.findByEmail("joe_doe@email.com");
        assertEquals(person3, foundPerson.get(2));
    }

    @Test
    public void testFindByPhone() {

        Mockito.when(personRepository.findByPhone("+1 709 777-9012")).thenReturn(personList);
        List<Person> foundPerson = personRepository.findByPhone("+1 709 777-9012");
        assertEquals(person4, foundPerson.get(3));
    }
}

