package com.Technical.userstories.code.controller;

import com.Technical.userstories.code.model.ApplyForCarLoan;
import com.Technical.userstories.code.model.Document;
import com.Technical.userstories.code.model.LoanOffer;
import com.Technical.userstories.code.service.ApplyForCarLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class ApplyForCarLoanController {

    @Autowired
    private ApplyForCarLoanService applyForCarLoanService;

    @GetMapping("/application-form")
    public ApplyForCarLoan getApplicationForm() {
        return applyForCarLoanService.getApplicationForm();
    }

    @GetMapping("/documents-required")
    public List<Document> getDocumentsRequired(){
        return applyForCarLoanService.getDocumentsRequired();
    }

    @GetMapping("/loan-offer")
    public LoanOffer getLoanOffer(){
        return applyForCarLoanService.getLoanOffer();
    }

    @PostMapping("/accept-loan-offer-electronically")
    public void acceptLoanOfferElectronically(){
        applyForCarLoanService.acceptLoanOfferElectronically();
    }

    @PostMapping("/accept-loan-offer-by-signing")
    public void acceptLoanOfferBySigning(@RequestBody Document document){
        applyForCarLoanService.acceptLoanOfferBySigning();
    }

    @GetMapping("/approved-loan-amount")
    public double getApprovedLoanAmount(){
        return applyForCarLoanService.getApprovedLoanAmount();
    }
}