package com.team3.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findByStreet(@Param("street") String street);

    List<Address> findByCity(@Param("city") String city);

    List<Address> findByProvince(@Param("province") String province);

    List<Address> findByPostalCode(@Param("postalCode") String postalCode);

    List<Address> findByCountry(@Param("country") String country);

}
