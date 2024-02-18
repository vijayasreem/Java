package com.Technical.userstories.code.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GenerateLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerId;
    private String customerName;
    private String applicationForm;
    private String loanOffer;
    private String acceptedLoanOffer;
    private String approvedLoanAmount;
    private String customerAccountNumber;
    private String bankIFSCCode;

    public GenerateLoan() {
    }

    public GenerateLoan(Long id, String customerId, String customerName, String applicationForm, String loanOffer, String acceptedLoanOffer, String approvedLoanAmount, String customerAccountNumber, String bankIFSCCode) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.applicationForm = applicationForm;
        this.loanOffer = loanOffer;
        this.acceptedLoanOffer = acceptedLoanOffer;
        this.approvedLoanAmount = approvedLoanAmount;
        this.customerAccountNumber = customerAccountNumber;
        this.bankIFSCCode = bankIFSCCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getApplicationForm() {
        return applicationForm;
    }

    public void setApplicationForm(String applicationForm) {
        this.applicationForm = applicationForm;
    }

    public String getLoanOffer() {
        return loanOffer;
    }

    public void setLoanOffer(String loanOffer) {
        this.loanOffer = loanOffer;
    }

    public String getAcceptedLoanOffer() {
        return acceptedLoanOffer;
    }

    public void setAcceptedLoanOffer(String acceptedLoanOffer) {
        this.acceptedLoanOffer = acceptedLoanOffer;
    }

    public String getApprovedLoanAmount() {
        return approvedLoanAmount;
    }

    public void setApprovedLoanAmount(String approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }

    public String getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber(String customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getBankIFSCCode() {
        return bankIFSCCode;
    }

    public void setBankIFSCCode(String bankIFSCCode) {
        this.bankIFSCCode = bankIFSCCode;
    }
}