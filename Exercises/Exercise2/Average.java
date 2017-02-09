import java.util.*;

public class Average implements IStatAlg{
    
    // Average
    @Override
    public List<Double> process(List<Double> list){
        List<Double> rList = new ArrayList<Double>();
        
        Sum s = new Sum();
        rList.add(s.process(list).get(0)/list.size());
        
        return rList;
    }
    
}