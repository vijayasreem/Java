re some sample unit tests for the given class:

```apex
@isTest
private class CarMortgageLoanApplicationControllerTest {
    
    @isTest
    static void saveLoanApplication_ValidFields_Success() {
        // Create a new instance of the controller
        CarMortgageLoanApplicationController controller = new CarMortgageLoanApplicationController();
        
        // Populate valid loan application fields
        controller.loanApplication.FirstName__c = 'John';
        controller.loanApplication.LastName__c = 'Doe';
        controller.loanApplication.Email__c = 'john.doe@example.com';
        controller.loanApplication.LoanAmount__c = 10000;
        
        // Call the saveLoanApplication method
        Test.startTest();
        controller.saveLoanApplication();
        Test.stopTest();
        
        // Retrieve the saved loan application record
        LoanApplication__c savedLoanApplication = [SELECT Id, Status__c FROM LoanApplication__c WHERE Id = :controller.loanApplication.Id];
        
        // Assert that the loan application was saved successfully
        System.assertEquals('Submitted', savedLoanApplication.Status__c);
    }
    
    @isTest
    static void saveLoanApplication_InvalidFields_Error() {
        // Create a new instance of the controller
        CarMortgageLoanApplicationController controller = new CarMortgageLoanApplicationController();
        
        // Populate invalid loan application fields
        controller.loanApplication.FirstName__c = 'John';
        controller.loanApplication.LastName__c = 'Doe';
        controller.loanApplication.Email__c = 'invalid_email';
        controller.loanApplication.LoanAmount__c = -10000;
        
        // Call the saveLoanApplication method
        Test.startTest();
        controller.saveLoanApplication();
        Test.stopTest();
        
        // Retrieve the saved loan application record
        LoanApplication__c savedLoanApplication = [SELECT Id, Status__c FROM LoanApplication__c WHERE Id = :controller.loanApplication.Id];
        
        // Assert that the loan application was not saved
        System.assertEquals(null, savedLoanApplication);
    }
    
}
