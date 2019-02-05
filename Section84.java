
package chapter8;

import java.text.DecimalFormat;

public class Section84 {
    public static void main(String[] args) {
        final int WD = 7;
        final int E = 8;        
        
        int[][] matrix = new int[E][WD];                
        
        // create the matrix with random values
        System.out.println("\t\t" + "Su " + "M  " + "T  "+ "W  "+ "Th  " + "F  " + "Sa");
        for (int row=0; row<E; row++){
            System.out.print("Employee " + row+ "      ");
            for (int col = 0; col<WD; col++ ){
                matrix[row][col] = (int)(Math.random()*10);                 
                if (col == WD-1)
                    System.out.println(matrix[row][col]);
                else
                    System.out.print(matrix[row][col] + "  ");
            }            
        }
        
        // Calculate hours.
        int[] employee = sumHours(matrix, E);        
        
        int[] iName = new int[E];
        for (int i=0; i<E; i++) iName[i] = i;
        
        // sort employee.
        sortHours(E, employee, iName);        
        
        // Display:
        System.out.println();
        for (int i=0; i<E; i++)
            System.out.println("Employee " + iName[i]+ " :\t " + employee[i]);
            
    }    
    
    public static int[] sumHours(int[][] m, int empNum){
        int sum = 0;
        int[] emp = new int[empNum];
        int row =0; int col=0;
        for (row =0; row <empNum; row++){
            for (col = 0; col< 7; col++)
                sum += m[row][col];
            emp[row] = sum;
            sum =0;
        }
       return emp; 
    }
    
    public static void sortHours(int empNum, int[] hourArr, int[] nameArr){
        int temp1, temp2;        
        for (int i= 0; i< empNum; i++)
           for (int j= i+1; j<= 7 ; j++)
                if (hourArr[i] <= hourArr[j]){
                    temp1 = hourArr[i];
                    temp2 = nameArr[i]; 
                    hourArr[i] = hourArr[j];
                    nameArr[i] = nameArr[j];
                    hourArr[j] = temp1;
                    nameArr[j] = temp2;               
                }            
    }    
}