package com.Technical.userstories.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GenerateLoanRepository extends JpaRepository<GenerateLoan, Long> {

    @Query(value = "SELECT * FROM generate_loan WHERE customer_id = ?1", nativeQuery = true)
    GenerateLoan findByCustomerId(String customerId);

    @Query(value = "SELECT * FROM generate_loan WHERE application_form = ?1", nativeQuery = true)
    GenerateLoan findByApplicationForm(String applicationForm);

    @Query(value = "SELECT * FROM generate_loan WHERE loan_offer = ?1", nativeQuery = true)
    GenerateLoan findByLoanOffer(String loanOffer);

    @Query(value = "SELECT * FROM generate_loan WHERE accepted_loan_offer = ?1", nativeQuery = true)
    GenerateLoan findByAcceptedLoanOffer(String acceptedLoanOffer);

    @Query(value = "SELECT * FROM generate_loan WHERE approved_loan_amount = ?1", nativeQuery = true)
    GenerateLoan findByApprovedLoanAmount(String approvedLoanAmount);
}