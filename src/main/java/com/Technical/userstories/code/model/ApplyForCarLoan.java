package com.Technical.userstories.code.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplyForCarLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Application form
    private String loanApplicationForm;

    // List of documents required for application
    private List<Document> documentsRequired;

    // Loan offer details
    private LoanOffer loanOffer;

    // Approved Loan Amount
    private double approvedLoanAmount;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanApplicationForm() {
        return loanApplicationForm;
    }

    public void setLoanApplicationForm(String loanApplicationForm) {
        this.loanApplicationForm = loanApplicationForm;
    }

    public List<Document> getDocumentsRequired() {
        return documentsRequired;
    }

    public void setDocumentsRequired(List<Document> documentsRequired) {
        this.documentsRequired = documentsRequired;
    }

    public LoanOffer getLoanOffer() {
        return loanOffer;
    }

    public void setLoanOffer(LoanOffer loanOffer) {
        this.loanOffer = loanOffer;
    }

    public double getApprovedLoanAmount() {
        return approvedLoanAmount;
    }

    public void setApprovedLoanAmount(double approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }

}