package chapter11;
public class Student  extends Person {
    final String[] STATUS_NAMES = {"freshman", "sophomore", "junior", "senior"};
    
    String stStatus;
    
    public Student(){};     
    
    public Student(String st){
        if (STATUS_NAMES.equals(st)) 
            stStatus = st; 
        else
            System.out.println("Wrong status");
    }
    public String toString(){        
        return ("Name: " + this.name + "\nStatus: " + this.stStatus + "\nAddress: " + this.address + 
               "\nTelephone: " + this.phone + "\nEmail Address: " + this.email);
    }    
    
}
