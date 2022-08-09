package com.team3.rest;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Rental {
    @Id
    @SequenceGenerator(name = "rental_seq", sequenceName = "rental_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rental_seq")
    private Long id;

    @OneToOne // unsure if this disqualifies the user from managing multiple rentals??
    private User rentalManager;
    private String rentalStatus;
    private String rentalType;
    private LocalDate rentalListDate;
    private String rentalScore;
    private double rentalPrice;
    private String rentalDescription;
    @OneToOne
    private Address rentalAddress;

    public Rental() {
    }

    public Rental(User rentalManager, String rentalStatus, String rentalType, LocalDate rentalListDate,
            String rentalScore, double rentalPrice, String rentalDescription, Address rentalAddress) {
        this.rentalManager = rentalManager;
        this.rentalStatus = rentalStatus;
        this.rentalType = rentalType;
        this.rentalListDate = rentalListDate;
        this.rentalScore = rentalScore;
        this.rentalPrice = rentalPrice;
        this.rentalDescription = rentalDescription;
        this.rentalAddress = rentalAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getRentalManager() {
        return rentalManager;
    }

    public void setRentalManager(User rentalManager) {
        this.rentalManager = rentalManager;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public LocalDate getRentalListDate() {
        return rentalListDate;
    }

    public void setRentalListDate(LocalDate rentalListDate) {
        this.rentalListDate = rentalListDate;
    }

    public String getRentalScore() {
        return rentalScore;
    }

    public void setRentalScore(String rentalScore) {
        this.rentalScore = rentalScore;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getRentalDescription() {
        return rentalDescription;
    }

    public void setRentalDescription(String rentalDescription) {
        this.rentalDescription = rentalDescription;
    }

    public Address getRentalAddress() {
        return rentalAddress;
    }

    public void setRentalAddress(Address rentalAddress) {
        this.rentalAddress = rentalAddress;
    }

    public String toString() {
        return "Rental [id=" + id + ", rentalManager=" + rentalManager + ", rentalStatus=" + rentalStatus
                + ", rentalType=" + rentalType + ", rentalListDate=" + rentalListDate + ", rentalScore=" + rentalScore
                + ", rentalPrice=" + rentalPrice + ", rentalDescription=" + rentalDescription + ", rentalAddress="
                + rentalAddress + "]";
    }

}
