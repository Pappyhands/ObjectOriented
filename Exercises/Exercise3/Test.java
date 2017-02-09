import java.util.*;

public class Test{
    
    public static void main(String[] args){
        Test tester  = new Test();
        tester.test();
    }
    
    public void test(){
        House h = new House(4.0,4.0);
        System.out.println("Regular House cost " + h.estimate());
        
        SolidConstructionHouse h2 = new SolidConstructionHouse(4.0,4.0);
        System.out.println("Solid Construction House cost " + h2.estimate());
    }
}