public class WeightedOrderAlg extends AbstractOrderAlg{
    public static WeightedOrderAlg m_instance;
    
    public static WeightedOrderAlg getInstance(){
        if (m_instance == null)
            m_instance = new WeightedOrderAlg();
        return m_instance;
    }
    
    private WeightedOrderAlg(){}
    
    @Override
    protected int getPenalty(char ch1){
        if(ch1 == 'A'){
            return 1;
        }else if(ch1 == 'G'){
            return 2;
        }else if(ch1 == 'C'){
            return 3;
        }else if(ch1 == 'T'){
            return 4;
        }else{
            return 0;
        }
        
    }
}