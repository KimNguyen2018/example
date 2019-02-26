
package oopdenmo;
public class OOPDenmo {
    
    public static void main(String[] args) {
        // create a new object named ibm
        
        // Object 1 
        Laptop ibm = new Laptop(); // create default constructor;
        // or
        Laptop ibm2 = new Laptop(23.5, 2, 3, "IBM computer");
        
        // access variables and functions of this class laptop
        
        // variables
        ibm.name = "IBM Computer";
        ibm.CPU = 2;
        ibm.RAM = 3;
        ibm.price = 23.5;
        
        double disprice = ibm.discount();
        System.out.println("price discounted : " + disprice );
        double price1 = ibm.discount1(4, true);
        System.out.println("price1: " + price1);
        
        // behaviors - functions
        ibm.supportedOS("Window", "Linux", "Unit");
        
        // if using void SupportedOS (String [] os ) in laptop class :
        // cannot use: ibm.supportedOS("Window", "Linux", "Unit");
        // String[] os = {"Window", "Linux", "Unit"} has to be used before printing out.
        
        System.out.println("second way ");
        
        String[] os = {"Window", "Linux", "Unit"};
        ibm.supportedOS(os);
        ibm.supportedOS_case2(os);
        
        ibm.start();
        ibm.run();
        ibm.restart();
        ibm.shutdown();
        System.out.println("--------------------------");
        
        // Object 2
        Laptop macBook = new Laptop();
        macBook.name = "Macbook";
        macBook.CPU = 3;
        macBook.RAM = 4;
        macBook.price = 45.5;
        
        macBook.start();
        macBook.run();
        macBook.restart();
        macBook.shutdown();
    }
        
              
    
}
