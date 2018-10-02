package it251_sales_tracker_ip4;
import java.text.DecimalFormat;

public class Supplies extends Accounts{
    double books;
    double office;
    double apparel;
    int suppliesID;
    double sales;

    public Supplies(String accountName, double office, double books, double apparel) {
        super(accountName);
        suppliesID = getAccountID();
        this.office = office;
        this.books = books;
        this.apparel = apparel;
        
    }
    private int getAccountID(){
        return super.accountID;
    }
    
    public double getOffice(){
        return office;
    }
    
    public void setOfice(double office){
        this.office = office;
    }
    
    public double getBooks(){
        return books;
    }
    
    public void setBooks(double books){
        this.books = books;
    }
    
    public double getApparel(){
        return apparel;
    }
    
    public void setApparel(double apparel){
        this.apparel = apparel;
    }
    
    @Override
    public double computeSales(){
        sales = office+books+apparel;
        return sales;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("The account name is: " + accountName + "\n"+
                "The account ID is: " + suppliesID+ "\n" +
                "The dollar ammount of office supplies sold is: $"+df.format(office)+".\n"+
                "The dollar ammount of book sales is: $"+df.format(books)+".\n"+
                "The dollar ammount of apparel sales is: $"+df.format(apparel)+".\n"+
                "The total sales is: "+df.format(sales));
    }
}
