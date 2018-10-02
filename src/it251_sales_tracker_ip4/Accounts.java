package it251_sales_tracker_ip4;


public abstract class Accounts {
    static int accountID;
    String accountName;
    
    
    //the only parameter needed here is the account name as the account ID will be 
    //generated automaticalls. 
    public Accounts(String accountName){
        this.accountName=accountName;
   
    //this calls the method to generate the account ID automatically
    generateAccountID();
    }
    
    public Accounts(){
        
    }
    
    //generates the account ID
    public static int generateAccountID(){
        accountID = accountID + 1;
        return accountID;
        
    }
    
    public abstract double computeSales();
    
    
    //this is the overridden toString method. 
    @Override
    public String toString(){
        return String.format(accountID + " " + accountName);
        
    }
    
    
    
   
}
