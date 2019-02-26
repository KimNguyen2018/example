
package oopdenmo;
public class Laptop {
    /* States */
    double price;
    int CPU;
    int RAM;
    String name;
    
    // default constructor
    
    public Laptop (){
        //System.out.println("Default Contructor");
        
        /*case 1
        price = 0.0;
        CPU = 0;
        RAM = 0;
        name ="";
        */
        // case 2:
        this(0.0, 0, 0, "");
    }
    // create constructor with tham so
    public Laptop(double price, int CPU, int RAM, String name ){
        this.price = price;
        this.CPU = CPU;
        this.RAM = RAM;
        this.name = name;
        // tu khoa this.price nay means bien price belong to class, k0 phai la tham so of constructor
    }
    /* Behaviors */
    
    double discount() {
        double discountedprice = price * 0.5;
        return discountedprice;
    }
    
    double discount1(int quantity, boolean isStudent) {
        double disprice = 0;
        if (quantity > 2) {
               disprice = price *0.4;
        }
        else {
                disprice = price*0.5;
        }
        if (isStudent){
            disprice = disprice - 2;
        }
        return disprice;
    }
    
    // variable length list
    void supportedOS (String ...os){
        for ( int i =0; i<os.length; i++){
            System.out.println(os[i]);
        }
    }
    // the same as void supportedOS (String[] os) 
    void supportedOS_case2(String...os){
        for (String spOS: os){
            System.out.println(spOS);
        }
    }
    void run() {
        /* print out all variables */
        System.out.println(name +"|" + CPU + "|" + RAM + "|" + price);
    }
    void start() {
        System.out.println("Start ....");
    }
    void shutdown() {
        System.out.println("Shut Down");
    }
    void restart() {
        System.out.println("Restart my computer");
    }
}   
