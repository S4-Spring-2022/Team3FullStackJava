package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.team3.rest.User;

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
        user.setPersonId(1L);
        assertNotNull(user.getPersonId());
    }

    
}
