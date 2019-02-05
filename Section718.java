
/* Author: Kim Ngoc Nguyen */

package chapter7;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Section718 {
        
    public static void main(String[] args) {
        
       final int NUMBERS = 10;        
       DecimalFormat df = new DecimalFormat("0.00");
       Scanner input = new Scanner(System.in);
       
       // Computer reads 10 double numbers
       System.out.println("Computer generates 10 double numbers: ");
       double[] arrayNum = new double[NUMBERS];
              
       for (int i=0; i<NUMBERS; i++){
           arrayNum[i] = Math.random() *100;
           if (i==9) 
               System.out.println(df.format(arrayNum[i]));
           else
               System.out.print(df.format(arrayNum[i]) + " , ");
       } 
       
       bubbleSort(arrayNum, NUMBERS);
       
       System.out.println("List of numbers in order: ");
       for (int i= 0; i< NUMBERS; i++)
           if (i== NUMBERS -1) System.out.println( df.format(arrayNum[i])); 
           else System.out.print(df.format(arrayNum[i]) + " , ");            
    }
    
    public static void bubbleSort(double[] Array, int num){
        double temp1;
        
        for (int i= 0; i< num; i++)
           for (int j= i+1; j< num ; j++)
                if (Array[i] >= Array[j]){
                    temp1 = Array[i];                    
                    Array[i] = Array[j];                    
                    Array[j] = temp1;                    
                }                    
    }        
}
