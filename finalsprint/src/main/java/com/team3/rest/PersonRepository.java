package com.team3.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByFirstName(@Param("firstName") String firstName);
    
    List<Person> findByLastName(@Param("lastName") String lastName);
    
    List<Person> findByEmail(@Param("email") String email);
    
    List<Person> findByPhone(@Param("phone") String phone);
    
    List<Person> findByAddressId(@Param("addressId") Long addressId);
    
}
