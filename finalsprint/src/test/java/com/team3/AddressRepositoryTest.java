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

    Address address = new Address("123 Main Street", "St. John's", "NL", "A1N 1A1", "Canada");

    List<Address> addressList = List.of(address);

    @Test
    public void testFindByStreet() {
        Mockito.when(addressRepository.findByStreet("55 Main Street")).thenReturn(addressList);
        List<Address> foundStreet = addressRepository.findByStreet("55 Main Street");
        assertEquals(address, foundStreet.get(0));
    }

    @Test
    public void testFindByCity() {
        Mockito.when(addressRepository.findByCity("Halifax")).thenReturn(addressList);
        List<Address> foundCity = addressRepository.findByCity("Halifax");
        assertEquals(address, foundCity.get(0));
    }

    @Test
    public void testFindByProvince() {
        Mockito.when(addressRepository.findByProvince("NS")).thenReturn(addressList);
        List<Address> foundProvince = addressRepository.findByProvince("NS");
        assertEquals(address, foundProvince.get(0));
    }

    @Test
    public void testFindByPostalCode() {
        Mockito.when(addressRepository.findByPostalCode("A0A 0A0")).thenReturn(addressList);
        List<Address> foundPostalCode = addressRepository.findByPostalCode("A0A 0A0");
        assertEquals(address, foundPostalCode.get(0));
    }

    @Test
    public void testFindByCountry() {
        Mockito.when(addressRepository.findByCountry("Canada")).thenReturn(addressList);
        List<Address> foundCountry = addressRepository.findByCountry("Canada");
        assertEquals(address, foundCountry.get(0));
    }

}
