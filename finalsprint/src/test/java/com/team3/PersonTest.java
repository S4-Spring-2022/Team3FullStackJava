package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.Address;
import com.team3.rest.Person;
import com.team3.rest.PersonRepository;

public class PersonTest {

    @Test
    public void testUser() {
        Person person = new Person();
        assertNotNull(person);
    }

    @Test
    public void testId() {
        Person person = new Person();
        person.setId(1);
        assertEquals(1, person.getId());
    }

    @Test
    public void testFirstName() {
        Person person = new Person();
        person.setFirstName("John");
        assertEquals("John", person.getFirstName());
    }

    @Test
    public void testLastName() {
        Person person = new Person();
        person.setLastName("Doe");
        assertEquals("Doe", person.getLastName());
    }

    @Test
    public void testEmail() {
        Person person = new Person();
        person.setEmail("john_doe@email.com");
        assertEquals("john_doe@email.com", person.getEmail());
    }

    @Test
    public void testPhone() {
        Person person = new Person();
        person.setPhone("+1-709-777-1234");
        assertEquals("+1-709-777-1234", person.getPhone());
    }
        
    @Test
    public void testAddress() {
        Person person = new Person();
        person.setAddressId(1L);
        assertNotNull(person.getAddressId());
    }
 
}
