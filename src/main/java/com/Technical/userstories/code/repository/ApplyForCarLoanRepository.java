package com.Technical.userstories.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyForCarLoanRepository extends JpaRepository<ApplyForCarLoan, Long> {
    
    // Get the application form for the loan
    public ApplyForCarLoan getApplicationForm();

    // Get the list of documents required for the application
    public List<Document> getDocumentsRequired();

    // Get the loan offer details with all the terms and conditions
    public LoanOffer getLoanOffer();

    // Accept the loan offer electronically
    public void acceptLoanOfferElectronically();

    // Accept the loan offer by signing physical documents
    public void acceptLoanOfferBySigning();

    // Get the approved loan amount
    public double getApprovedLoanAmount();
}