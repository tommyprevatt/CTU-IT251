package it251_sales_tracker_ip4;
import java.text.DecimalFormat;

public class Services extends Accounts {
    double numberHours;
    double ratePerHour;
    int servicesID;
    double sales;
    
    public Services(String accountName, double numberHours, double ratePerHour) {
        super(accountName);
        servicesID = getAccountID();
        this.numberHours= numberHours;
        this.ratePerHour = ratePerHour;
    }
    
    private int getAccountID(){
        return super.accountID;
    }    
    
    public double getNumberHours(){
        return numberHours;
    }
    
    public void setNumberHours(double numberHours){
        this.numberHours = numberHours;
    }
    
    public double getRatePerHour(){
        return ratePerHour;
    }
    
    public void setRatePerHour(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }
    
    @Override
    public double computeSales(){
        sales = numberHours*ratePerHour;
        return sales;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("The account name is: " + accountName + "\n"+
                "The account ID is: " + servicesID+ "\n" +
                "The ammount of hours worked is "+df.format(numberHours)+" and the rate per hour is $"+df.format(ratePerHour)+".\n"+
                "The total sales is: "+df.format(sales));
    }
}
