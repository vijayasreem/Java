package com.Technical.userstories.code.service;

import com.Technical.userstories.code.model.MortgageLoan;
import com.Technical.userstories.code.repository.MortgageLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MortgageLoanService {

    @Autowired
    MortgageLoanRepository mortgageLoanRepository;

    // To receive and store car mortgage loan application data from customers.
    public MortgageLoan saveMortgageLoanData(MortgageLoan mortgageLoan) {
        if (validateMortgageLoanData(mortgageLoan)) {
            MortgageLoan savedMortgageLoan = mortgageLoanRepository.save(mortgageLoan);
            sendConfirmationMessage(savedMortgageLoan);
            return savedMortgageLoan;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid mortgage loan data");
        }
    }

    // To validate the accuracy and completeness of the application data.
    public boolean validateMortgageLoanData(MortgageLoan mortgageLoan) {
        // Business logic to validate mortgage loan data
        // Add your validation logic here
        return true;
    }

    // To send a confirmation message to the customer upon successful submission of the application.
    public void sendConfirmationMessage(MortgageLoan mortgageLoan) {
        // Send confirmation message logic
        // Add your logic to send confirmation message to the customer
    }

    // To retrieve the car mortgage loan application data from the database.
    public MortgageLoan getMortgageLoanData(Long id) {
        return mortgageLoanRepository.findById(id).orElse(null);
    }

}