/** Author: Kim Nguyen
Practise on extending class 
*/
package chapter11;
public class Faculty extends Employee {
    int officeHours;
    String rank;
    
    public Faculty(){};
    
    public Faculty(int officeHours, String rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public String toString(){        
        return ("Name: " + this.name +         
               "\nPosition: " + this.rank + 
                "\nOffice Hours : " + this.officeHours);
    }    
    
}
