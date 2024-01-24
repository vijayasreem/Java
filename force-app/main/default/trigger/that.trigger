
trigger AccountHistoryTrigger on Account (after update) {
    // Check if the account number has been updated
    Set<String> updatedAccountNumbers = new Set<String>();
    for (Account acc : Trigger.new) {
        if (acc.AccountNumber != null && Trigger.oldMap.get(acc.Id).AccountNumber != acc.AccountNumber) {
            updatedAccountNumbers.add(acc.AccountNumber);
        }
    }
    
    // Fetch transaction history for updated account numbers
    if (!updatedAccountNumbers.isEmpty()) {
        List<AccountHistory__c> accountHistories = [
            SELECT AccountNumber__c, TransactionDate__c, Amount__c, Description__c
            FROM AccountHistory__c
            WHERE AccountNumber__c IN :updatedAccountNumbers
            ORDER BY TransactionDate__c DESC
        ];
        
        // Prepare the response
        Map<String, List<Map<String, Object>>> accountHistoryMap = new Map<String, List<Map<String, Object>>>();
        for (AccountHistory__c history : accountHistories) {
            if (!accountHistoryMap.containsKey(history.AccountNumber__c)) {
                accountHistoryMap.put(history.AccountNumber__c, new List<Map<String, Object>>());
            }
            Map<String, Object> transactionData = new Map<String, Object>{
                'TransactionDate' => history.TransactionDate__c,
                'Amount' => history.Amount__c,
                'Description' => history.Description__c
            };
            accountHistoryMap.get(history.AccountNumber__c).add(transactionData);
        }
        
        // Update the accounts with transaction history
        for (Account acc : Trigger.new) {
            if (accountHistoryMap.containsKey(acc.AccountNumber)) {
                acc.TransactionHistory__c = JSON.serialize(accountHistoryMap.get(acc.AccountNumber));
            }
        }
    }
}
