package com.Technical.userstories.code.service;

import com.Technical.userstories.code.model.ApplyForCarLoan;
import com.Technical.userstories.code.model.Document;
import com.Technical.userstories.code.model.LoanOffer;
import com.Technical.userstories.code.repository.ApplyForCarLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyForCarLoanService {

    @Autowired
    private ApplyForCarLoanRepository applyForCarLoanRepository;

    // Get the application form for the loan
    public ApplyForCarLoan getApplicationForm(){
        return applyForCarLoanRepository.getApplicationForm();
    }

    // Get the list of documents required for the application
    public List<Document> getDocumentsRequired(){
        return applyForCarLoanRepository.getDocumentsRequired();
    }

    // Get the loan offer details with all the terms and conditions
    public LoanOffer getLoanOffer(){
        return applyForCarLoanRepository.getLoanOffer();
    }

    // Accept the loan offer electronically
    public void acceptLoanOfferElectronically(){
        applyForCarLoanRepository.acceptLoanOfferElectronically();
    }

    // Accept the loan offer by signing physical documents
    public void acceptLoanOfferBySigning(){
        applyForCarLoanRepository.acceptLoanOfferBySigning();
    }

    // Get the approved loan amount
    public double getApprovedLoanAmount(){
        return applyForCarLoanRepository.getApprovedLoanAmount();
    }

}