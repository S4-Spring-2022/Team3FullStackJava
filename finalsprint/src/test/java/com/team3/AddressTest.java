package com.team3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.Address;

public class AddressTest {

    @Test
    public void testAddress() {
        Address address = new Address();
        assertNotNull(address);
    }

    @Test
    public void testStreet() {
        Address address = new Address();
        address.setStreet("street test");
        assertEquals("street test", address.getStreet());
    }

    @Test
    public void testCity() {
        Address address = new Address();
        address.setCity("city test");
        assertEquals("city test", address.getCity());
    }

    @Test
    public void testProvince() {
        Address address = new Address();
        address.setProvince("province test");
        assertEquals("province test", address.getProvince());
    }

    @Test
    public void testPostalCode() {
        Address address = new Address();
        address.setPostalCode("postal code test");
        assertEquals("postal code test", address.getPostalCode());
    }

    @Test
    public void testCountry() {
        Address address = new Address();
        address.setCountry("country test");
        assertEquals("country test", address.getCountry());
    }
}
