package com.team3.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByStreet(@Param("street") String street);

    Address findByCity(@Param("city") String city);

    Address findByProvince(@Param("province") String province);

    Address findByPostalCode(@Param("postalCode") String postalCode);

    Address findByCountry(@Param("country") String country);

}
