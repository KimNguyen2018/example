package chapter9;
import java.util.*;

public class GregorianCal {

int year;
int month;
int day;
    

GregorianCalendar gCal = new GregorianCalendar();

    public int getGregorianCalendarYear(){
        year = gCal.get(Calendar.YEAR);
        return year;
    }
    
    public int getGregorianCalendarMonth(){
        month = gCal.get(Calendar.MONTH);
        return month;
    }
    
    public int getGregorianCalendarDay(){
        day = gCal.get(Calendar.DAY_OF_MONTH);
        return day;
    }
    
    public void setElapsedTime(long value){                
        gCal.setTimeInMillis(value);                        
        gCal.getTimeInMillis();
    }
}
