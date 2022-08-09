package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.UserRepository;
import com.team3.rest.User;
import com.team3.rest.Person;
import com.team3.rest.Address;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UserRepositoryTest {

    @Mock
    private UserRepository userRepository = Mockito.mock(UserRepository.class);

    // a lot of inter-dependance on other classes, but User is the result of multiple levels of aggregation
    Address addressUnderTest = new Address("some street", "some city", "some province", "some postal code",
            "some country");
    Person personUnderTest1 = new Person("John", "Doe", "anemail@email.com", "1234567890", addressUnderTest);
    Person personUnderTest2 = new Person("Jane", "Doe", "anotheremail@email.com", "0987654321", addressUnderTest);
    User userUnderTest1 = new User("user1", "password", personUnderTest1);
    User userUnderTest2 = new User("user2", "password", personUnderTest2);
    List<User> users = List.of(userUnderTest1, userUnderTest2);
    List<User> users2 = List.of(userUnderTest2);
    List<User> users3 = List.of(userUnderTest1);

    @Test
    public void testFindByUserName() {
        
        Mockito.when(userRepository.findByUserName("user1")).thenReturn(users3);
        List<User> user = userRepository.findByUserName("user1");
        assertEquals(userUnderTest1, user.get(0));

    }

}
