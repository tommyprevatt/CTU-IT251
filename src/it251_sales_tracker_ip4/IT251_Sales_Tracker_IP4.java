package it251_sales_tracker_ip4;

import javax.swing.JOptionPane;

public class IT251_Sales_Tracker_IP4 {

    public static void main(String[] args) {
        //This lines asks the user how many accounts there are to enter. 
        
        int totalReps = Integer.parseInt(JOptionPane.showInputDialog("How sales associates are entering data?"));
        int repsInc = 1;
        String s[] = new String[totalReps];
        double totalPaper = 0;
        double totalService = 0;
        double totalSupplies = 0;
        for (int r = 0; r<totalReps; r++){
            s[r]=JOptionPane.showInputDialog("What is sales associate number "+(r+1)+"'s name?");
            String totalString = JOptionPane.showInputDialog("How many accounts would you like to enter for "+s[r]+"?");
            int total = Integer.parseInt(totalString);

            /*
            This creats an array for the super Accounts class. 
            I will then put the subclass objects into it during each iteration of 
            the following loop. 
            */
            Accounts a[] = new Accounts[total];
            double repPaper = 0;
            double repService = 0;
            double repSupplies = 0;
            //starts a for loop and loops for each account the user said there would be
            for (int i = 0; i<total; i++){
            
                /*
                This creates an opject to provide the user with selections in a 
                JOptionPane dialog box. Then the corresponding if statement is chosen 
                based on the user sellection. A new Accounts object with a 
                subclass reference is created and inserted into the corresponding index.
                */
                Object[] accountType = {"Paper", "Services", " Supplies"};
                int num = JOptionPane.showOptionDialog(null,
                    "What type of account would you like to input data for?",
                    "Choose an account type",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    accountType,
                    accountType[0]);
                if (num == 0){
                    String paperName = JOptionPane.showInputDialog("What is the account name?");
                    double paperSold = Double.parseDouble(JOptionPane.showInputDialog("How many pounds of paper sold to this account?"));
                    double paperPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the price per pound?"));
                    a[i] = new Paper(paperName, paperSold, paperPrice);
                    repPaper = repPaper + a[i].computeSales();
                }
                if (num == 1){
                    String servicesName = JOptionPane.showInputDialog("What is the account name?");
                    Double servicesHours = Double.parseDouble(JOptionPane.showInputDialog("How many hours worked?"));
                    Double servicesRate = Double.parseDouble(JOptionPane.showInputDialog("What is the rate per hour?"));
                    a[i] = new Services(servicesName, servicesHours, servicesRate);
                    
                    repService = repService + a[i].computeSales();
                }
                if (num ==2){
                    String suppliesName = JOptionPane.showInputDialog("What is the account name?");
                    double office = Double.parseDouble(JOptionPane.showInputDialog("What is the dollar amount of office supply sales?"));
                    double books = Double.parseDouble(JOptionPane.showInputDialog("What is the dollar amount of book sales?"));
                    double apparel = Double.parseDouble(JOptionPane.showInputDialog("What is the dollar amount of apparel sales?"));
                    a[i] = new Supplies(suppliesName, office, books, apparel);
                    repSupplies = repSupplies + a[i].computeSales();
                }
            }

            totalPaper = totalPaper + repPaper;
            totalService = totalService + repService;
            totalSupplies = totalSupplies + repSupplies;
            System.out.println();
            System.out.println(s[r]+"'s total paper sales is: $"+repPaper);
            System.out.println(s[r]+"'s total service sales is: $"+repService);
            System.out.println(s[r]+"'s total supply sales is: $"+repSupplies);
        }
        
        /*
        This next section prints the total sales across all associates. 
        */
        double allSalesTotals = totalPaper + totalSupplies + totalService;
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("The total sales across all accounts and sales associates is: $"+allSalesTotals);
    }
    
}
