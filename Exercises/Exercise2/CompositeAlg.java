import java.util.*;

public class CompositeAlg implements IStatAlg{
    
    private List<IStatAlg> algList = new ArrayList<IStatAlg>();
    
    // Average
    @Override
    public List<Double> process(List<Double> list){
        for(IStatAlg algorithm : algList)
            list = algorithm.process(list);
        
        
        return list;
    }
    
    public void addAlg(IStatAlg alg){
        algList.add(alg);
    }
    
}