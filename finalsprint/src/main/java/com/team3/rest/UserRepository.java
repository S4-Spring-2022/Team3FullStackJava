package com.team3.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(@Param("userName") String userName);

    // List<User> findByFirstName(@Param("firstName") String firstName);

    // List<User> findByLastName(@Param("lastName") String lastName);

    // List<User> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    // List<User> findByEmail(@Param("email") String email);

    // List<User> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);


    
}
