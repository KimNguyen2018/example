
package chapter8;

import java.text.DecimalFormat;

public class Section82 {
    public static void main(String[] args) {
        final int N = 5;
        double[][] matrix = new double[N][N];
        DecimalFormat df = new DecimalFormat("#0.00");
        
        // create the matrix with random values
        for (int row=0; row<N; row++){
            for (int col = 0; col<N; col++ ){
                matrix[row][col] = Math.random()*10; 
                if (col==N-1)
                    System.out.println(df.format(matrix[row][col]));
                else
                    System.out.print(df.format(matrix[row][col]) + "  ");
            }
        }
                
        // sum all elements on the major diagonal
        double total= sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is: " + df.format(total));   
    }
    
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int row =0; row<m.length; row++)
            for (int col = 0; col<m.length; col++)
                if (row==col) sum = sum + m[row][col];
       return sum; 
    }
}

