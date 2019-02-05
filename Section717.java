
/* Author: Kim Ngoc Nguyen */

package chapter7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Section717 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       // Enter number of students
       System.out.print("Enter the number of students: ");
       int numSt = input.nextInt();
             
       // Enter name of each student       
       String[] nameSt= new String[numSt];
       
        for (int i = 0; i < numSt; i++ ){                  
            System.out.print(i+1 + ". " + "Name of student: "); 
            nameSt[i] = input.next();
        }
        System.out.println("");
        
        // Enter score of each student.
        int[] score = new int[numSt];
        for (int i = 0; i < numSt; i++ ){
            System.out.print(i+1 + ". " + nameSt[i] + "'s score: ");
            score[i] = input.nextInt();
       }
        
       // Sort name by score.
              
       sortScore(numSt, score, nameSt);
       
        System.out.println("\n List of student names in descreasing order of score: ");
       for (int i= 0; i<numSt; i++)
           System.out.println( i+1 + ". " + nameSt[i]);           
    }
    
    public static void sortScore(int num, int[] scoreArray, String[] nameArray){
        int temp1, temp;
        String temp2;
        for (int i= 0; i< num; i++){
           for (int j= i+1; j< num ; j++){
                if (scoreArray[i] <= scoreArray[j]){
                    temp1 = scoreArray[i];
                    temp2 = nameArray[i]; 
                    scoreArray[i] = scoreArray[j];
                    nameArray[i] = nameArray[j];
                    scoreArray[j] = temp1;
                    nameArray[j] = temp2;               
                } 
                else
                    if (scoreArray[i] == scoreArray[j]){                       
                        compareName(nameArray[i], nameArray[j]);                        
                    }
           }
        }   
    }
    
    public static void compareName(String name1, String name2){                
        String name;
        if (name1.compareTo(name2)>0) { 
            name = name1;
            name1 = name2;
            name2 = name;            
        }            
    }
}
