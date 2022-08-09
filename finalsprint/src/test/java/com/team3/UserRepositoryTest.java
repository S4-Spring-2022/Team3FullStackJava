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

import java.util.List;


@ExtendWith(MockitoExtension.class)
public class UserRepositoryTest {

    @Mock
    private UserRepository userRepository = Mockito.mock(UserRepository.class);
    
    @Test
    public void test() {

        

    }
        
    
}
