package chapter9;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate =0;
    private Date dateCreated;
    
    // no-arg constructor
    Account(){}
    
    // constructor that creates an account with id and balance;
    Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
    }
    
    // accessor method  and mutator method
    public void Id(int newId){
        id = newId;
    };
       
    double Balance(double newBalance){                
        return newBalance;
    };
    
    public void getAnnualInterestRate(double rate){
        annualInterestRate = rate;
    };
     void initDate(){   
        dateCreated = new Date();
        System.out.println("Date that creates the account: " + dateCreated.toString());
    }

    double getMonthlyInterestRate(double newRate){
       annualInterestRate = newRate;
       return((annualInterestRate / 12)/100); 
    }
    
    double getMonthlyInterest(double newBalance, double Rate){
       double interest;
       balance = newBalance;
       interest = balance * getMonthlyInterestRate(Rate);
       return interest;
    }
    
        double withdraw(double amount){
        return amount;
    }
    
    double deposit(double amount){
        return amount;
    }

    
    
}
