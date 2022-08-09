package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.Address;
import com.team3.rest.AddressRepository;

@ExtendWith(MockitoExtension.class)
public class AddressRepositoryTest {

    @Mock
    private AddressRepository addressRepository = Mockito.mock(AddressRepository.class);

    @Test
    public void test() {
    }

    @Test
    public void testFindAll() {
        List<Address> addresses = addressRepository.findAll();
        assertNotNull(addresses);
    }

}
