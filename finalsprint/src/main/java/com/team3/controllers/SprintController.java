package com.team3.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @CrossOrigin
    @PostMapping(value="/users/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> addUser(@RequestBody User newUser) {
        User user = userRepository.save(newUser);
        if(user == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(user);
    }

    @CrossOrigin
    @GetMapping("/search/rental/rentalType/{rentalType}")
    public List<Rental> searchRentalByRentalType(@RequestParam(value = "rentalType") String rentalType) {
        return rentalRepository.findByRentalType(rentalType);
    }

    @CrossOrigin
    @GetMapping("/search/rental/city/{city}")
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

    @CrossOrigin
    @GetMapping("/search/rental/province/{province}")
    public List<Rental> searchRentalByRentalAddressProvince(@RequestParam(value = "province") String province) {
        ArrayList<Rental> rentals = new ArrayList<Rental>();
        List<Address> addressList = addressRepository.findByProvince(province);
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

    @CrossOrigin
    @GetMapping("/search/rental/street/{street}")
    public List<Rental> searchRentalByRentalAddressStreet(@RequestParam(value = "street") String street) {
        ArrayList<Rental> rentals = new ArrayList<Rental>();
        List<Address> addressList = addressRepository.findByStreet(street);
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
}
