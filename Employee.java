package chapter11;

import java.text.DecimalFormat;
import java.util.Date;

public class Employee extends Person {
    String office_name;
    double salary;            
    MyDate dateHired = new MyDate();
    
    DecimalFormat df = new DecimalFormat("$#,##0.##");

    public Employee(){};

    public Employee(String office_name, double salary){
        this.office_name = office_name;
        this.salary = salary;        
    }
        
    public MyDate HiredDate(int year, int day, int month){ 
        dateHired.day = day;
        dateHired.month = month;
        dateHired.year = year;
        return (dateHired);
        
    }
    
    public String toString(){             
        return ("Name: " + this.name +                 
                "\nOffice name: " + this.office_name + 
                "\nSalary per year: " + df.format(this.salary));
                
                                
    }
}
