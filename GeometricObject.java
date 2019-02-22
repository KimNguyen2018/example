package chapter13;
import java.util.Date;
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;
    
    // Construct a default geometric object
    protected GeometricObject(){
        dateCreated = new java.util.Date();        
    }
    
    //return color;
    public String getColor(){
        return color;
    }
    
    // Set a new color
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;               
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + "and filled: " + filled;    
   }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}
