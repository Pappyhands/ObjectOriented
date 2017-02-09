import java.util.*;

public class Sum implements IStatAlg{
    
    // SUM
    @Override
    public List<Double> process(List<Double> list){
        double total = 0;
        
        for(double item: list)
            total += item;
        List<Double> rList = new ArrayList<Double>(); 
        rList.add(total); 
        return (rList);
    }
}