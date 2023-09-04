package com.Technical.userstories.code.controller;

import com.Technical.userstories.code.model.GenerateLoan;
import com.Technical.userstories.code.service.GenerateLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/generate-loan")
public class GenerateLoanController {

    @Autowired
    GenerateLoanService generateLoanService;

    @PostMapping
    public GenerateLoan generateLoan(@RequestParam String customerId,
                                    @RequestParam String applicationForm,
                                    @RequestParam String loanOffer,
                                    @RequestParam String acceptedLoanOffer,
                                    @RequestParam String approvedLoanAmount) {
        return generateLoanService.generateLoan(customerId,
                applicationForm, loanOffer, acceptedLoanOffer, approvedLoanAmount);
    }

    @GetMapping("/customer-id/{customerId}")
    public Optional<GenerateLoan> getLoanByCustomerId(@PathVariable String customerId) {
        return generateLoanService.getLoanByCustomerId(customerId);
    }

    @GetMapping("/application-form/{applicationForm}")
    public Optional<GenerateLoan> getLoanByApplicationForm(@PathVariable String applicationForm) {
        return generateLoanService.getLoanByApplicationForm(applicationForm);
    }

    @GetMapping("/loan-offer/{loanOffer}")
    public Optional<GenerateLoan> getLoanByLoanOffer(@PathVariable String loanOffer) {
        return generateLoanService.getLoanByLoanOffer(loanOffer);
    }

    @GetMapping("/accepted-loan-offer/{acceptedLoanOffer}")
    public Optional<GenerateLoan> getLoanByAcceptedLoanOffer(@PathVariable String acceptedLoanOffer) {
        return generateLoanService.getLoanByAcceptedLoanOffer(acceptedLoanOffer);
    }

    @GetMapping("/approved-loan-amount/{approvedLoanAmount}")
    public Optional<GenerateLoan> getLoanByApprovedLoanAmount(@PathVariable String approvedLoanAmount) {
        return generateLoanService.getLoanByApprovedLoanAmount(approvedLoanAmount);
    }

}