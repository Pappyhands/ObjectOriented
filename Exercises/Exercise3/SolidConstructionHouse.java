import java.util.*;

public class SolidConstructionHouse extends House{
    
    public SolidConstructionHouse(double length, double width){
        super(length,width); // Using House's constructor
    }
    
    // Calculates estimated cost of house by multiplying sq footage by 97 then an increased 25%.
    @Override
    public double estimate(){
        // Ask Mark (?)
        try{
            return (super.estimate()) * 1.25; //Uses House's estimate method than multiples by 1.25 to get an amount 25% larger.
        } catch(Exception e) {
            System.err.println("Error!");
           return 0;
           
        }
    }
}