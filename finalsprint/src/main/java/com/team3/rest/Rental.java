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

    private Long userId;
    private String rentalStatus;
    private String rentalType;
    private LocalDate rentalListDate;
    private String rentalScore;
    private double rentalPrice;
    private String rentalDescription;
    private Long addressId;

    public Rental() {
    }

    public Rental(Long user_id, String rentalStatus, String rentalType, LocalDate rentalListDate,
            String rentalScore, double rentalPrice, String rentalDescription, Long address_id) {
        this.userId = user_id;
        this.rentalStatus = rentalStatus;
        this.rentalType = rentalType;
        this.rentalListDate = rentalListDate;
        this.rentalScore = rentalScore;
        this.rentalPrice = rentalPrice;
        this.rentalDescription = rentalDescription;
        this.addressId = address_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long user_id) {
        this.userId = user_id;
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

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long address_id) {
        this.addressId = address_id;
    }

    public String toString() {
        return "Rental [id=" + id + ", rentalManager=" + userId + ", rentalStatus=" + rentalStatus
                + ", rentalType=" + rentalType + ", rentalListDate=" + rentalListDate + ", rentalScore=" + rentalScore
                + ", rentalPrice=" + rentalPrice + ", rentalDescription=" + rentalDescription + ", rentalAddress="
                + addressId + "]";
    }

}
