package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.User;
import com.team3.rest.Person;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User();
        assertNotNull(user);
    }

    @Test
    public void testId() {
        User user = new User();
        user.setId(1);
        assertEquals(1, user.getId());
    }

    @Test
    public void testUsername() {
        User user = new User();
        user.setUserName("test");
        assertEquals("test", user.getUserName());
    }

    @Test
    public void testPassword() {
        User user = new User();
        user.setPassword("test");
        assertEquals("test", user.getPassword());
    }

    @Test
    public void testPerson() {
        User user = new User();
        user.setPerson(new Person());
        assertNotNull(user.getPerson());
    }

    
}
