s a sample Salesforce Apex class that can be used to implement the given user story:

```apex
public class CarMortgageLoanApplicationController {
    
    public LoanApplication__c loanApplication { get; set; }
    
    public CarMortgageLoanApplicationController() {
        loanApplication = new LoanApplication__c();
    }
    
    public void saveLoanApplication() {
        // Perform validation on the loan application form fields
        
        // Save the loan application record
        insert loanApplication;
        
        // Send confirmation message or email to the customer
        sendConfirmationEmail();
    }
    
    private void sendConfirmationEmail() {
        // Code to send confirmation email to the customer
    }
    
}
