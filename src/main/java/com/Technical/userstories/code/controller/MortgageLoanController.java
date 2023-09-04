package com.Technical.userstories.code.controller;

import com.Technical.userstories.code.model.MortgageLoan;
import com.Technical.userstories.code.service.MortgageLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mortgage-loan")
public class MortgageLoanController {

    @Autowired
    MortgageLoanService mortgageLoanService;

    // API to receive and store car mortgage loan application data from customers.
    @PostMapping
    public ResponseEntity<MortgageLoan> saveMortgageLoanData(@RequestBody MortgageLoan mortgageLoan) {
        boolean isValidData = mortgageLoanService.validateMortgageLoanData(mortgageLoan);
        if(isValidData) {
            MortgageLoan savedMortgageLoan = mortgageLoanService.saveMortgageLoanData(mortgageLoan);
            mortgageLoanService.sendConfirmationMessage(savedMortgageLoan);
            return new ResponseEntity<>(savedMortgageLoan, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    // API to retrieve the car mortgage loan application data from the database.
    @GetMapping("/{id}")
    public ResponseEntity<MortgageLoan> getMortgageLoanData(@PathVariable Long id) {
        MortgageLoan mortgageLoan = mortgageLoanService.getMortgageLoanData(id);
        if (mortgageLoan != null) {
            return new ResponseEntity<>(mortgageLoan, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}