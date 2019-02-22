
/* Authour: Kim Ngoc Nguyen */

package chapter9;

import java.text.DecimalFormat;
import java.time.Instant;
import java.util.Date;

public class Section97 {
    public static void main(String[] args) {
        DecimalFormat dfAmount = new DecimalFormat("$0,000.00");
        DecimalFormat dfRate = new DecimalFormat("0.00");
        Account acc = new Account(1122, 20000);        
        
        acc.getAnnualInterestRate(0.045);        
        acc.withdraw(2500);
        acc.deposit(3000);        
        
        
        // print out the balance;
        double bl = acc.Balance(20000) + acc.deposit(3000) - acc.withdraw(2500);
        System.out.println("The balance : " + dfAmount.format(bl));
        
        // print out the monthly interest.
        acc.getMonthlyInterest(bl, 0.045);       
        System.out.println("The monthly Interest: " + dfRate.format(acc.getMonthlyInterest(bl, 0.045)));                
        
        // print out the date when this account was created.        
        acc.initDate();
                
    }
    
}
