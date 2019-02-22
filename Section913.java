package chapter9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Section913 {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.#");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns in the array: ");
        int rowMatrix = input.nextInt();
        int colMatrix = input.nextInt();
                
        double[][] arr = new double[rowMatrix][colMatrix];
        
        System.out.println("Enter the array: ");
        for (int i=0; i<arr.length; i++)
            for (int j =0; j<arr[i].length; j++)
                arr[i][j] = input.nextDouble();
        
        Location locItem = new Location();
        locItem = locateLargest(arr);
        
        System.out.print("The location of the largest element is : ");  
        System.out.println(df.format(locItem.maxValue) + " at (" + locItem.row + "," + locItem.column + ")");
    }
    
    public static Location locateLargest(double[][] a){
        
        Location locate = new Location();
        locate.row = 0;
        locate.column = 0;
        locate.maxValue = 0;                
        
        for (int i=0; i<a.length; i++)
            for (int j =0; j<a[i].length; j++)
                if (a[i][j] >= locate.maxValue){
                    locate.maxValue = a[i][j];
                    locate.row = i;
                    locate.column = j;
                }
        return locate;        
    }    
}
