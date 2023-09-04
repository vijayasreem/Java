@Repository
package com.Technical.userstories.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageLoanRepository extends JpaRepository<MortgageLoan, Long> {

    // To receive and store car mortgage loan application data from customers.
    void saveMortgageLoanData(MortgageLoan mortgageLoan);

    // To validate the accuracy and completeness of the application data.
    boolean validateMortgageLoanData(MortgageLoan mortgageLoan);

    // To send a confirmation message to the customer upon successful submission of the application.
    void sendConfirmationMessage(MortgageLoan mortgageLoan);

    // To retrieve the car mortgage loan application data from the database.
    MortgageLoan getMortgageLoanData(Long id);
}