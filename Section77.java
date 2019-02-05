package chapter7;

import java.util.Scanner;

public class Section77 {    
    
    public static void main(String[] args) {
        
        int[] iArray = new int[10];
        int randNum;        
        int count0, count1, count2, count3, count4, count5, count6, count7, count8, count9;
        count0 = count1 = count2= count3 = count4 = count5 = count6 = count7 = count8 = count9 = 0;
        
        for (int i=0; i<100; i++){
            randNum = (int)(Math.random()*10);
            if (randNum >=0 && randNum <=9){
                System.out.print(randNum + " ");
                if (i%10==0) System.out.println(randNum);
                switch (randNum){
                    case 0: count0 ++;
                            iArray[0] = count0;
                            break;
                    case 1: count1 ++;
                            iArray[1] = count1;
                            break;
                    case 2: count2 ++;
                            iArray[2] = count2;
                            break;        
                    case 3: count3 ++;
                            iArray[3] = count3;
                            break;        
                    case 4: count4 ++;
                            iArray[4] = count4;
                            break;        
                    case 5: count5 ++;
                            iArray[5] = count5;
                            break;   
                    case 6: count6 ++;
                            iArray[6] = count6;
                            break;        
                    case 7: count7 ++;
                            iArray[7] = count7;
                            break;        
                    case 8: count8 ++;
                            iArray[8] = count8;
                            break;        
                    case 9: count9 ++;
                            iArray[9] = count9;
                            break;        
                }
            }
        }
        // Display:
        
        System.out.println();
        for (int i=0; i<10; i++ )
            System.out.println("The number of " + i+ " is : " + iArray[i] + "s");                    
    }         
}
    