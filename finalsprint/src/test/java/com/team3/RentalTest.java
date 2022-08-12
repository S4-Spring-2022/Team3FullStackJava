package com.team3;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.team3.rest.Rental;
import com.team3.rest.User;
import com.team3.rest.Address;

public class RentalTest {

    @Test
    public void testRental() {
        Rental rental = new Rental();
        assertNotNull(rental);
    }

    @Test
    public void testId() {
        Rental rental = new Rental();
        rental.setId(1);
        assertEquals(1, rental.getId());
    }

    @Test
    public void testUserId() {
        Rental rental = new Rental();
        rental.setUserId(1L);
        assertNotNull(rental.getUserId());
    }

    @Test
    public void testRentalStatus() {
        Rental rental = new Rental();
        rental.setRentalStatus("test");
        assertEquals("test", rental.getRentalStatus());
    }

    @Test
    public void testRentalType() {
        Rental rental = new Rental();
        rental.setRentalType("test");
        assertEquals("test", rental.getRentalType());
    }

    @Test
    public void testRentalListDate() {
        Rental rental = new Rental();
        rental.setRentalListDate(LocalDate.now());
        assertEquals(LocalDate.now(), rental.getRentalListDate());
    }

    @Test
    public void testRentalScore() {
        Rental rental = new Rental();
        rental.setRentalScore("test");
        assertEquals("test", rental.getRentalScore());
    }

    @Test
    public void testRentalPrice() {
        Rental rental = new Rental();
        rental.setRentalPrice(150.0);
        assertEquals(150.0, rental.getRentalPrice());
    }

    @Test
    public void testRentalDescription() {
        Rental rental = new Rental();
        rental.setRentalDescription("test");
        assertEquals("test", rental.getRentalDescription());
    }

    @Test
    public void testRentalAddress() {
        Rental rental = new Rental();
        rental.setRentalAddress(1L);
        assertNotNull(rental.getRentalAddress());
    }
    
}
