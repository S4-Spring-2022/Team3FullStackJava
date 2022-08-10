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

    Address address = new Address("123 Main Street", "St. John's", "NL", "A1A 1A1", "Canada");
    Address address2 = new Address("456 Main Street", "Halifax", "NS", "B2B 2B2", "Canada");
    Address address3 = new Address("789 Main Street", "Toronto", "ON", "C3C 3C3", "Canada");
    Address address4 = new Address("012 Main Street", "Mount Pearl", "NL", "D4D 4D4", "Canada");
    Address address5 = new Address("345 Main Street", "Montreal", "QC", "E5E 5E5", "Canada");

    List<Address> addressList = List.of(address);

    @Test
    public void testFindByStreet() {
        Mockito.when(addressRepository.findByStreet("123 Main Street")).thenReturn(addressList);
        List<Address> foundStreet = addressRepository.findByStreet("123 Main Street");
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
        Mockito.when(addressRepository.findByPostalCode("A1A 1A1")).thenReturn(addressList);
        List<Address> foundPostalCode = addressRepository.findByPostalCode("A1A 1A1");
        assertEquals(address, foundPostalCode.get(0));
    }

    @Test
    public void testFindByCountry() {
        Mockito.when(addressRepository.findByCountry("Canada")).thenReturn(addressList);
        List<Address> foundCountry = addressRepository.findByCountry("Canada");
        assertEquals(address, foundCountry.get(0));
    }

}
