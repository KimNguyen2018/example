package chapter9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Section95 {
    public static void main(String[] args) {
        
        String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                "Jul", "Aug", "Sep", "Oct","Nov", "Dec" };
        
        final long VALUE = 1234567898765L;
        GregorianCal gCalendar = new GregorianCal();        
        
        int currYear;
        int currMonth;
        int currDay;        
      
                       
        currYear = gCalendar.getGregorianCalendarYear();
        currMonth = gCalendar.getGregorianCalendarMonth();
        currDay = gCalendar.getGregorianCalendarDay();
        
        // Dislay the current year, month, day.
        
        System.out.print("Current Date: ");        
        System.out.print(currYear + " ");
        System.out.print(monthNames[currMonth - 1] + " ");
        System.out.println(currDay);
        
        
        // Display the year, month, day with elapsed time value is 1234567898765L
        gCalendar.setElapsedTime(VALUE);                         
        String eDate;
        
        currYear = gCalendar.getGregorianCalendarYear();
        currMonth = gCalendar.getGregorianCalendarMonth();
        currDay = gCalendar.getGregorianCalendarDay();
        
        eDate = currYear + " - " + monthNames[currMonth-1] + " - " + currDay;
        System.out.print("The year month day in Elapsed Time sine Jan 01 1970 : ");
        System.out.println(eDate);
        
    }
    
}
