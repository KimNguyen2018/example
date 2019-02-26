package chapter13;
public class Triangle extends GeometricObject {
    private double side1, side2, side3;
    private double height;
    
    public Triangle(){};
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
       
    
    public double getArea(){
        return (height* side3/2);
    }
      
    @Override
    public double getPerimeter() {
      return (side1 + side2 + side3);  
    }
    
}
