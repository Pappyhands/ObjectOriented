public class Builder{
    private static Builder m_instance;
    
    public static Builder getInstance(){
        if (m_instance == null)
            m_instance = new Builder();
        return m_instance;
    }
    
    private Builder(){};
    
    private IDecision m_decision = new Decision();
    
    public IDecision buildWizard(){
        
        IDecision snow1 = new Decision("Do you want to buy a snowboard?");
        IDecision snow2 = new Decision("Have you snowboarded before?");
        IDecision snow3 = new Decision("Are you an expert?");
        IDecision snow4 = new Decision("Do you like to go fast?");

        IDecision ski1 = new Decision("Do you want to buy downhill skis?");
        IDecision ski2 = new Decision("Have you gone skiing before?");
        IDecision ski3 = new Decision("Are you an expert?");
        IDecision ski4 = new Decision("Do you like to jump?");
        
        snow1.setYes(snow2);
        snow1.setNo(ski1);
        
        snow2.setYes(snow3);
        snow2.setNoTerminal("Buy the XG100 model.");
        
        snow3.setYes(snow4);
        snow3.setNoTerminal("Buy the XG200 model.");
        
        snow4.setYesTerminal("Buy the XG300 model.");
        snow4.setNoTerminal("Buy the XG200 model.");
        
        ski1.setYes(ski2);
        ski1.setNoTerminal("We recommend trying to ski someday!");
        
        ski2.setYes(ski3);
        ski2.setNoTerminal("Buy the ZR100 model.");
        
        ski3.setYes(ski4);
        ski3.setNoTerminal("Buy the ZR200 model.");
        
        ski4.setYesTerminal("Buy the ZR300 model.");
        ski4.setNoTerminal("Buy the ZR200 model.");
        
        return snow1;
    }
    
}