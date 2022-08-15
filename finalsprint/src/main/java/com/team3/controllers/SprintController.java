package com.team3.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public SprintController(RentalRepository rentalRepository, AddressRepository addressRepository, UserRepository userRepository) {
        this.rentalRepository = rentalRepository;
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }

    @CrossOrigin
    @GetMapping(value="/users/{userName}", produces = "application/json")
    public List<User> getUser(@RequestParam(value = "userName", defaultValue = "") String userName) {
        return userRepository.findByUserName(userName);
    }

    // @GetMapping("/search/rental/rentalManager/{rentalManager}")
    // public List<Rental> searchRentalByRentalManager(@RequestParam(value = "rentalManager") Long user_id) {
    //     return rentalRepository.findByUserId(user_id);
    // }

    // @GetMapping("/search/rental/rentalStatus/{rentalStatus}")
    // public List<Rental> searchRentalByRentalStatus(@RequestParam(value = "rentalStatus") String rentalStatus) {
    //     return rentalRepository.findByRentalStatus(rentalStatus);
    // }

    // @GetMapping("/search/rental/rentalType/{rentalType}")
    // public List<Rental> searchRentalByRentalType(@RequestParam(value = "rentalType") String rentalType) {
    //     return rentalRepository.findByRentalType(rentalType);
    // }

    // @GetMapping("/search/rental/rentalScore/{rentalScore}")
    // public List<Rental> searchRentalByRentalScore(@RequestParam(value = "rentalScore") String rentalScore) {
    //     return rentalRepository.findByRentalScore(rentalScore);
    // }

    // @GetMapping("/search/rental/rentalPrice/{rentalPrice}")
    // public List<Rental> searchRentalByRentalPrice(@RequestParam(value = "rentalPrice") double rentalPrice) {
    //     return rentalRepository.findByRentalPrice(rentalPrice);
    // }

    @CrossOrigin
    @GetMapping("/search/rental/rentalAddress/{addressId}")
    public Optional<Address> searchRentalByRentalAddress(@RequestParam(value = "addressId") Long addressId) {
        Rental rental = rentalRepository.findByAddressId(addressId);
        if(!(rental == null)) {
         return addressRepository.findById(addressId);
        }
        return null;
    }

    @CrossOrigin
    @GetMapping("/search/rental/rentalAddress/city/{city}")
    public List<Rental> searchRentalByRentalAddressCity(@RequestParam(value = "city") String city) {
        ArrayList<Rental> rentals = new ArrayList<Rental>();
        List<Address> addressList = addressRepository.findByCity(city);
        if (!addressList.isEmpty()) {
            addressList.forEach(address -> {
                Rental temp = rentalRepository.findByAddressId(address.getId());
                if (temp != null) {
                    rentals.add(temp);
                }

            });
        }
        return rentals;
    }


    // @GetMapping("/search/address/street/{street}")
    // public List<Address> searchAddressByStreet(@RequestParam(value = "street") String street) {
    //     return addressRepository.findByStreet(street);
    // }    

    @CrossOrigin
    @GetMapping("/search/address/city/{city}")
    public List<Address> searchAddressByCity(@RequestParam(value = "city") String city) {
        return addressRepository.findByCity(city);
    }

    // @GetMapping("/search/address/province/{province}")
    // public List<Address> searchAddressByProvince(@RequestParam(value = "province") String province) {
    //     return addressRepository.findByProvince(province);
    // }

    // @GetMapping("/search/address/postalCode/{postalCode}")
    // public List<Address> searchAddressByPostalCode(@RequestParam(value = "postalCode") String postalCode) {
    //     return addressRepository.findByPostalCode(postalCode);
    // }

    // @GetMapping("/search/address/country/{country}")
    // public List<Address> searchAddressByCountry(@RequestParam(value = "country") String country) {
    //     return addressRepository.findByCountry(country);
    // }

}

/**
 * Demo, screen record, show ALL the functionality you want to be considered as part of the grade
 */