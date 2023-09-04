package com.Technical.userstories.code.service;

import com.Technical.userstories.code.model.GenerateLoan;
import com.Technical.userstories.code.repository.GenerateLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenerateLoanService {

    @Autowired
    GenerateLoanRepository generateLoanRepository;

    public GenerateLoan generateLoan(String customerId, String applicationForm, String loanOffer, String acceptedLoanOffer, String approvedLoanAmount){
        GenerateLoan generateLoan = new GenerateLoan();
        generateLoan.setCustomerId(customerId);
        generateLoan.setApplicationForm(applicationForm);
        generateLoan.setLoanOffer(loanOffer);
        generateLoan.setAcceptedLoanOffer(acceptedLoanOffer);
        generateLoan.setApprovedLoanAmount(approvedLoanAmount);
        return generateLoanRepository.save(generateLoan);
    }

    public Optional<GenerateLoan> getLoanByCustomerId(String customerId) {
        return generateLoanRepository.findByCustomerId(customerId);
    }

    public Optional<GenerateLoan> getLoanByApplicationForm(String applicationForm) {
        return generateLoanRepository.findByApplicationForm(applicationForm);
    }

    public Optional<GenerateLoan> getLoanByLoanOffer(String loanOffer) {
        return generateLoanRepository.findByLoanOffer(loanOffer);
    }

    public Optional<GenerateLoan> getLoanByAcceptedLoanOffer(String acceptedLoanOffer) {
        return generateLoanRepository.findByAcceptedLoanOffer(acceptedLoanOffer);
    }

    public Optional<GenerateLoan> getLoanByApprovedLoanAmount(String approvedLoanAmount) {
        return generateLoanRepository.findByApprovedLoanAmount(approvedLoanAmount);
    }

}