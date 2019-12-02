/**
Author: Kim Nguyen
*/
package chapter10;
public class Account {
    private int id; 
    private double balance =0, withdraw = 0, deposit= 0;    
    
    
    public Account(){};
    
    public Account(int idAc, double balc){            
            id = idAc;
            balance = balc;
    };
    
   
    public int getId(int currId){
        id = currId;
        return id;
    }
            
    public double getBalance(double balc) {
        balance = balc;
        return balance;
    }
            
    public double Deposit(double amount){
        return (amount);   
    }
    
    double Withdraw(double amount){
        return (amount);
    }
    
}
