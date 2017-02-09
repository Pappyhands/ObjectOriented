import java.util.*;

public class Main{
    public static void main(String[] args){
        Main tester  = new Main();
        tester.test();
    }
    
    public void test(){
        List<Double> list = new ArrayList<Double>(){{ 
            add(1.0); 
            add(2.0);
            add(3.0);
            add(4.0);
            add(5.0);
        }};
        
        Sum sum = new Sum();
        System.out.println("Sum: " + sum.process(list).get(0));
     
        
        Average a = new Average();
        System.out.println("Average: "+a.process(list).get(0));
        
        MultiplyByTwo m2 = new MultiplyByTwo();
        System.out.println("List *2: ");
        for(double item : m2.process(list))
            System.out.println(item);
            
        CompositeAlg compAlg = new CompositeAlg();
        compAlg.addAlg(sum);
        compAlg.addAlg(m2);
        
        
        
        for(double item : compAlg.process(list))
            System.out.println(item);
        
    }
}