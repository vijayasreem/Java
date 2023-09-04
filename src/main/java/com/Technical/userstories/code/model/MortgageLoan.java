// Generated Spring boot Entity/Model

package com.Technical.userstories.code.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MortgageLoan {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String carModel;
    private double loanAmount;
    private String loanTerm;
    private String paymentMode;

    public MortgageLoan() {
    }

    public MortgageLoan(String name, String address, String phoneNumber, String carModel, double loanAmount, String loanTerm, String paymentMode) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.carModel = carModel;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.paymentMode = paymentMode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

}