package com.team3;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.RentalRepository;
import com.team3.rest.Address;
import com.team3.rest.Person;
import com.team3.rest.User;
import com.team3.rest.Rental;

@ExtendWith(MockitoExtension.class)
public class RentalRepositoryTest {
    
    @Mock
    private RentalRepository rentalRepository = Mockito.mock(RentalRepository.class);

    // Address addressUnderTest = new Address("some street", "some city", "some province", "some postal code",
    //         "some country");
    // Person personUnderTest1 = new Person("John", "Doe", "4567891321", "thisemail@emil.com", addressUnderTest);
    User userUnderTest1 = new User("user1", "password", 1L);
    Rental rentalUnderTest1 = new Rental(1L, "active", "Single", LocalDate.now(), "8", 200.00, "Scenic Hideaway for a weekend getaway", 1L);
    List<Rental> rentals = List.of(rentalUnderTest1);

    @Test
    public void testFindByUserIdr() {
        
        Mockito.when(rentalRepository.findByUserId(1L)).thenReturn(rentals);
        List<Rental> rental = rentalRepository.findByUserId(1L);
        assertEquals(rentalUnderTest1, rental.get(0));
        
    }

    @Test
    public void testFindByRentalStatus() {
        
        Mockito.when(rentalRepository.findByRentalStatus("active")).thenReturn(rentals);
        List<Rental> rental = rentalRepository.findByRentalStatus("active");
        assertEquals(rentalUnderTest1, rental.get(0));
        
    }

    @Test
    public void testFindByRentalType() {
        
        Mockito.when(rentalRepository.findByRentalType("Single")).thenReturn(rentals);
        List<Rental> rental = rentalRepository.findByRentalType("Single");
        assertEquals(rentalUnderTest1, rental.get(0));
        
    }

    @Test
    public void findByRentalScore() {
        
        Mockito.when(rentalRepository.findByRentalScore("8")).thenReturn(rentals);
        List<Rental> rental = rentalRepository.findByRentalScore("8");
        assertEquals(rentalUnderTest1, rental.get(0));
        
    }
}
