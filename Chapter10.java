package chapter10;

import java.util.Scanner;

public class Chapter10 {

    public static Scanner input = new Scanner(System.in);

    public static boolean validId, selectOption, isEnough;
    public static int idAcc, choice;

    public static final int NUMBERS_OF_ACCOUNT = 10;

    public static Account[][] atm = new Account[NUMBERS_OF_ACCOUNT][1];

    public static int id, countId;
    public static double currBalance, withdraw =0 , deposit = 0, temp_balc = 100.0;

    public static void main(String[] args) {
        // Create account with intial balance =100;
        for (int i = 0; i < NUMBERS_OF_ACCOUNT; i++){          
                id = i;
                currBalance = 100;
                atm[i][0] = new Account(id, currBalance);            
        }
        countId = 1;
        // Enter an Id;
        idInput();
        // display menu;
        menu();
        // View information of user account        
        viewAccount();
    }

    public static void viewAccount() {
    if (idAcc != countId)
        temp_balc = 100;
        
        switch (choice) {
            case 1: // view Balance;                
                viewBalance();
                menu();
                viewAccount();
                showATMScreen();
                break;
            case 2: // process withdraw
                viewWithDraw();
                menu();
                viewAccount();
                showATMScreen();
                break;
            case 3: // process deposit
                viewDeposit();
                menu();
                viewAccount();
                showATMScreen();
                break;
            case 4: // exit
                 
                showATMScreen();

        }
    }
       
    public static void viewBalance() {        
        id = atm[idAcc][0].getId(idAcc);
        currBalance = atm[idAcc][0].getBalance(temp_balc);
        atm[idAcc][0] = new Account(id, currBalance);        
        System.out.print("The balance is: ");        
        System.out.println(atm[idAcc][0].getBalance(currBalance));
    }

    public static void viewWithDraw() {
        isEnough = false;
        do{
        System.out.print("Enter the amount to withdraw: ");
            withdraw = input.nextDouble();         
            if (withdraw > currBalance)
                System.out.println("Not enough money in account! ");
            else
                isEnough = true;
        }while (!isEnough);
        
        currBalance = currBalance - withdraw;
        temp_balc = currBalance;        
    }
    
    public static void viewDeposit(){
        
        System.out.print("Enter the amount to deposit: ");
        deposit = input.nextDouble(); 
        currBalance = currBalance + deposit;
        temp_balc = currBalance;
    }
    
    public static void idInput() {
        validId = false;        
        //temp_balc = 100;
        id = atm[idAcc][0].getId(idAcc);
        currBalance = atm[idAcc][0].getBalance(temp_balc);        
        atm[idAcc][0] = new Account(id, currBalance);       
        do {
            System.out.print("Enter an Id: ");
            idAcc = input.nextInt();
            if (idAcc < 0 || idAcc > 9) {
                System.out.println("Sorry, wrong Id ! Please enter again.");
            } else {
                countId = idAcc;
                validId = true;
            }
        } while (!validId);
    }

    static void menu() {
        System.out.println("\nMain menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        // enter a choice
        isChoice();
    }

    static void isChoice() {
        selectOption = false;
        do {

            System.out.print("Enter a choice: ");
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Sorry, Wrong option! Please enter again.");
            } else {
                selectOption = true;
            }

        } while (!selectOption);
    }

    static void showATMScreen() {
        for (int clear = 0; clear < 3; clear++) {
            System.out.println("\b");
        }
        idInput();
        menu();
        viewAccount();
    }
}
