package chapter7;

import java.util.Scanner;

public class Section712 {    
    
    public static void main(String[] args) {
        
        // for user
        int[] numArray = new int[10];
        int [] countNum = new int[10];
        int randNum;
        
        numArray= reverse(numArray);                                  
                
        for (int i : countNum) countNum[i] = 0;        
        
        for (int i=0; i<100; i++){
            randNum = (int)(Math.random()*100);
            if (randNum >=0 && randNum <=100){
                System.out.print(randNum + " ");
                if (i%10==0) System.out.println(randNum);
                for (int j=0; j<10; j++)
                    if (randNum == numArray[j])
                    countNum[j] = countNum[j] + 1;
            }            
        }        
        System.out.println();
        for (int i =0; i<10; i++ )
            System.out.println("The number of " + numArray[i]+ " is : " + countNum[i] + "s");    
    }   
    
    public static int[] reverse(int[] arr){
        Scanner input = new Scanner(System.in);                
        int[] numReturn = new int[arr.length];        
        int num;
        
        for (int i=0; i< arr.length; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            num = input.nextInt();
            numReturn[i] = num;            
        }
        return numReturn;
    }
}
    