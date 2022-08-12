package com.team3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong; // unsure as to whether this is to be required

import com.team3.rest.*;

@RestController
public class SprintController {
    @Autowired
    private RentalRepository rentalRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private UserRepository userRepository;

    public SprintController(RentalRepository rentalRepository, AddressRepository addressRepository) {
        this.rentalRepository = rentalRepository;
        this.addressRepository = addressRepository;
    }

    @CrossOrigin
    @GetMapping(value="/users/{userName}", produces = "application/json")
    public List<User> getUser(@RequestParam(value = "userName", defaultValue = "") String userName) {
        return userRepository.findByUserName(userName);
    }

    @GetMapping("/search/rental/rentalManager/{rentalManager}")
    public List<Rental> searchRentalByRentalManager(@RequestParam(value = "rentalManager") Long user_id) {
        return rentalRepository.findByUserId(user_id);
    }

    @GetMapping("/search/rental/rentalStatus/{rentalStatus}")
    public List<Rental> searchRentalByRentalStatus(@RequestParam(value = "rentalStatus") String rentalStatus) {
        return rentalRepository.findByRentalStatus(rentalStatus);
    }

    @GetMapping("/search/rental/rentalType/{rentalType}")
    public List<Rental> searchRentalByRentalType(@RequestParam(value = "rentalType") String rentalType) {
        return rentalRepository.findByRentalType(rentalType);
    }

    @GetMapping("/search/rental/rentalScore/{rentalScore}")
    public List<Rental> searchRentalByRentalScore(@RequestParam(value = "rentalScore") String rentalScore) {
        return rentalRepository.findByRentalScore(rentalScore);
    }

    @GetMapping("/search/rental/rentalPrice/{rentalPrice}")
    public List<Rental> searchRentalByRentalPrice(@RequestParam(value = "rentalPrice") double rentalPrice) {
        return rentalRepository.findByRentalPrice(rentalPrice);
    }

    @GetMapping("/search/rental/rentalAddress/{rentalAddress}")
    public List<Rental> searchRentalByRentalAddress(@RequestParam(value = "rentalAddress") Address rentalAddress) {
        return rentalRepository.findByRentalAddress(rentalAddress);
    }

    @GetMapping("/search/address/street/{street}")
    public List<Address> searchAddressByStreet(@RequestParam(value = "street") String street) {
        return addressRepository.findByStreet(street);
    }

    @GetMapping("/search/address/city/{city}")
    public List<Address> searchAddressByCity(@RequestParam(value = "city") String city) {
        return addressRepository.findByCity(city);
    }

    @GetMapping("/search/address/province/{province}")
    public List<Address> searchAddressByProvince(@RequestParam(value = "province") String province) {
        return addressRepository.findByProvince(province);
    }

    @GetMapping("/search/address/postalCode/{postalCode}")
    public List<Address> searchAddressByPostalCode(@RequestParam(value = "postalCode") String postalCode) {
        return addressRepository.findByPostalCode(postalCode);
    }

    @GetMapping("/search/address/country/{country}")
    public List<Address> searchAddressByCountry(@RequestParam(value = "country") String country) {
        return addressRepository.findByCountry(country);
    }

}
