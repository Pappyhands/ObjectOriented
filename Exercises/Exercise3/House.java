import java.util.*;

public class House implements IEstimatable{
    
    private double m_length;
    private double m_width;
    
    public House(double length, double width){
        m_length = length;
        m_width = width;
    }

    // Calculates estimated cost of house by multiplying sq footage by 97.
    @Override
    public double estimate(){
        // Ask Mark (?)
        try{
            return (m_length*m_width) * 97; //Length * Width then 97
        } catch(Exception e) {
            System.err.println("Error!");
           return 0;
           
        }
        
    }
        

    public double getWidth(){
        return m_width;
    }
}