package chapter11;

public class Person {       
    
    String name;
    String address;
    String phone;
    String email;
    
    public Person(){};
    
    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String toString(){        
        return ("Name: " + this.name + 
                "\nAddress: " + this.address + 
               "\nTelephone: " + this.phone + 
                "\nEmail Address: " + this.email);
    }    
}
