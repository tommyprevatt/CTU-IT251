package it251_sales_tracker_ip4;
import java.text.DecimalFormat;

public class Paper extends Accounts{

    double paperSold;
    double pricePerPound;
    int paperID;
    double sales;
    
    //consructor 
    public Paper(String accountName, double paperSold, double pricePerPound) {
        super(accountName);
        paperID = getAccountID();
        this.paperSold = paperSold;
        this.pricePerPound = pricePerPound;
    }
    
    private int getAccountID(){
        return super.accountID;
    }
    
   public double getPaperSold(){
       return paperSold;
   } 
   
   public void setPaperSold(double paperSold){
       this.paperSold = paperSold;
   }
   
   public double getPricePerPound(){
       return pricePerPound;
   }
   
   public void setpPricePerPound(double pricePerPound){
       this.pricePerPound = pricePerPound;    
   }
   
   
    @Override
    public double computeSales(){
        sales = paperSold*pricePerPound;
        return sales;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("The account name is: " + accountName + "\n"+
                "The account ID is: " + paperID+ "\n" +
                "The ammount of paper sold is "+df.format(paperSold)+" and the price per pound is $"+df.format(pricePerPound)+".\n"+
                "The total sales is: "+df.format(sales));
    }
    
}
