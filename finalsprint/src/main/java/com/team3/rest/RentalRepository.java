package com.team3.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "rental", path = "rental")
public interface RentalRepository extends JpaRepository<Rental, Long> {

    List<Rental> findByUserId(@Param("userId") Long userId);
    
    List<Rental> findByRentalStatus(@Param("rentalStatus") String rentalStatus);
    
    List<Rental> findByRentalType(@Param("rentalType") String rentalType);
    
    List<Rental> findByRentalScore(@Param("rentalScore") String rentalScore);
    
    List<Rental> findByRentalPrice(@Param("rentalPrice") double rentalPrice); 
    
    Rental findByAddressId(@Param("addressId") Long addressId); 
    
}
