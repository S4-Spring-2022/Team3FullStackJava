package com.team3.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong; // unsure as to whether this is to be required

import com.team3.rest.*;

@RestController
public class SprintController {

    private RentalRepository rentalRepository;

    @GetMapping("/search/rental/rentalManager/{rentalManager}")
    public List<Rental> searchRentalByRentalManager(@RequestParam(value = "rentalManager") User rentalManager) {
        return rentalRepository.findByRentalManager(rentalManager);
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


    
}
