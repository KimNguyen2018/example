/* Author: Kim Ngoc Nguyen */

package chapter7;

public class Section729 {
        
    public static void main(String[] args) {
        
        
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
             
        int total = 0;
        int count =0;
        for (int p1 = 0; p1<=51; p1++)
            for (int p2 = p1+1; p2<=51; p2++)
                for (int p3 = p2+ 1; p3<=51; p3++)
                    for (int p4 = p3+1; p4<=51; p4++){
                      total = cards[p1] + cards[p2] + cards[p3] + cards[p4];  
                      if (total == 24) count ++;
                    }  
        
        System.out.print("The number of picks that yields the sum of 24 is: ");        
        System.out.format("%,8d%n", count);
    }
}