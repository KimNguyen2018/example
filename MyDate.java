package chapter11;
public class MyDate {
    int year, month, day;
    
    public MyDate(){};
    
    public MyDate(int year, int month, int day){
        this.year= year;
        this.month = month;
        this.day = day;                 
    }
    
    public void setYear(int newYear){
        this.year = newYear;        
    }
    
    public void setMonth(int newMonth){
        this.month = newMonth;                
    }
    
    public void setDay(int newDay){
        this.day = newDay;        
    }
    
    public int getYear(){
        return year;        
    }
    
    public int getMonth(){
        return month;                
    }
    
    public int getDay(){
        return day;        
    }
}
