package chapter13;

import java.util.Scanner;

public class Chapter13 {
    public static void main(String[] args) {
                
        boolean isFilled, isValid;
        String stFilled; 
        //isFilled = true;
        isValid = false;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side 1: ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter side 2: ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter side 3: ");
        double side3 = input.nextDouble();
        
        System.out.print("Enter a height: ");
        double height = input.nextDouble();
        
        System.out.print("Enter color: ");
        String color = input.next();
               
        do{
            System.out.print("Is this triangle filled (Yes / No): ");
            stFilled = input.next();
            stFilled = stFilled.toUpperCase();
            if ( stFilled == "YES" || stFilled =="NO")                     
                isValid =  true;
        } while (isValid);
        
        if (stFilled == "YES")
            isFilled = true;
        else            
            isFilled = false;
        
        
        Triangle triangle  = new Triangle(side1, side2, side3);
        triangle.setHeight(height);
        triangle.setColor(color);        
        
        // Display:
        System.out.println("\nInformation of the triangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        if (isFilled) 
            System.out.println("This triangle is filled by color : " + triangle.getColor());
        else
            System.out.println("This triangle is not filled by color : " + triangle.getColor());
        
    }
    
}
