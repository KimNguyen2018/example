
package demo;
import java.util.Scanner; 
public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello");
        String name = "Kim Nguyen";
        String bookName = "Java Co Ban";
        char letter = 'A';
        byte b = 2;
        short s = 128;
        int age = 20;
        long l = 1024L;
        float price = 29.9F;
        double PI = 3.14444D;
        System.out.println(letter);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(price);
        System.out.println(PI);
        System.out.println(name);
        System.out.println(bookName);
        int phone = 8_999_333_44; // Java 7.0 or up : will support "_" as same as 899933344
     
        long CMND = 123_456_789L;
        double pr= 12.12345D;
        int a = 5;
        int c = 10;
        System.out.println("a + c = " + (a+c));
        int d = ++c; // gia tri of c duoc tang len 1 va sau do gan vao d 
        int e = --a;
        int f = d--; // gia tri of d se duoc gan vao f va sau do' d giam di 1
        System.out.println(d);        
        System.out.println(e);
        int m = 1;
        int n = 2;
        System.out.println(m==n);
        System.out.println(m>n);
        System.out.println(m!=n);
        
        // in out with Scanner
        //java.util.Scanner ssc= new java.util.Scanner(System.in);
        // the same as below:
        Scanner sc = new Scanner(System.in);
        // in: want to let user know that system will get data from user inputting
        System.out.println("Nhap Ten:   ");
        String ten = sc.nextLine();
        // ten se duoc gan cho du lieu from user nhap ten
        System.out.println("Ten moi nhap " + ten);
        
                
                ;
        
    }
    
}
