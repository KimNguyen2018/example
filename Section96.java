package chapter9;

import java.util.Date;

public class Section96 {
    public static void main(String[] args) {
        
        final int NUMBERS = 100000;
        double[]  numArr = new double[NUMBERS];
        
        for (int i=0; i<numArr.length; i++)
            numArr[i] = Math.random() *100000;
        
        StopWatch timer = new StopWatch();
        
        long start;
        long end;
                
        // sort numbers;
        start = timer.start();
        double temp;
        for (int i=0; i<numArr.length; i++)
            for (int j= i+1; j<numArr.length; j++)
                if (numArr[i] <= numArr[j]){
                    temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
        end = timer.stop();
        System.out.print("The execution time of sorting " + NUMBERS + " numbers is : ");
        System.out.println(timer.getElapsedTime(start, end) + " milliseconds.");
    }
    
}
