/* Author: Kim Ngoc Nguyen */
package chapter9;

import java.text.DecimalFormat;

public class Section92 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0%");
        // create a stock object with the stock symbol ORCL.
        
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        
        // display the price change percentage
        
       stock1.previousClosingPrice = 34.5;
       stock1.currentPrice = 20;
       double percent = stock1.getChangePercent();
        System.out.println("The price change percent: " + df.format(percent));               
    }    
}
