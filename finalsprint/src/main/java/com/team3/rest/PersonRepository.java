package com.team3.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByFirstName(@Param("firstName") String firstName);
    
    Person findByLastName(@Param("lastName") String lastName);
    
    Person findByEmail(@Param("email") String email);
    
    Person findByPhone(@Param("phone") String phone);
    
    Person findByAddress(@Param("address") String address);
    
}
