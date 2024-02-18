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
                                    @RequestParam String customerName,
                                    @RequestParam String applicationForm,
                                    @RequestParam String loanOffer,
                                    @RequestParam String acceptedLoanOffer,
                                    @RequestParam String approvedLoanAmount,
                                    @RequestParam String customerAccountNumber,
                                    @RequestParam String bankIFSCCode) {
        return generateLoanService.generateLoan(customerId, customerName,
                applicationForm, loanOffer, acceptedLoanOffer, approvedLoanAmount,
                customerAccountNumber, bankIFSCCode);
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

    @GetMapping("/customer-account-number/{customerAccountNumber}")
    public Optional<GenerateLoan> getLoanByCustomerAccountNumber(@PathVariable String customerAccountNumber) {
        return generateLoanService.getLoanByCustomerAccountNumber(customerAccountNumber);
    }

    @GetMapping("/bank-ifsc-code/{bankIFSCCode}")
    public Optional<GenerateLoan> getLoanByBankIFSCCode(@PathVariable String bankIFSCCode) {
        return generateLoanService.getLoanByBankIFSCCode(bankIFSCCode);
    }
}