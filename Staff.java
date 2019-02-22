package chapter11;
public class Staff extends Employee{
    String title;
    
    public Staff(){};
    
    public Staff(String title){
        this.title = title;
    }
    
    public String toString(){        
        return ("Name: " + this.name + 
                "\nTitle: " + this.title);
    }    
    
    
}