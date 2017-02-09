import java.util.*;

public class MultiplyByTwo implements IStatAlg{
    
    // Multiply by two
    @Override
    public List<Double> process(List<Double> list){
        List<Double> rList = new ArrayList<Double>();
        
        for(double item : list)
            rList.add(item * 2);
        
        return rList;
    }
    
}