public class VowelMash implements ICrypto{
    
    // Creating the 3 elements of a singleton
    public static VowelMash m_instance;
    
    public static ICrypto getInstance(){
        if (m_instance == null)
            m_instance = new VowelMash();
        return m_instance;
    }
    
    private VowelMash(){}
    
    public String encrypt(String message){
        String Msg = "";
        int size = Factory.getInstance().createParser(message).getCharCount();
        
        for(int i = 0; i < size; i++){
            char x = Factory.getInstance().createParser(message).getChar(i);
            
            if (x == 'A'){
                Msg += 'E';
            }
            else if (x == 'E'){
                Msg += 'I';
            }
            else if (x == 'I'){
                Msg += 'O';
            }
            else if (x == 'O'){
                Msg += 'U';
            }
            else if (x == 'U'){
                Msg += 'A';
            }
            else{
                Msg += x;
            }
        }
        
        return Msg;
    }
    
    public String decrypt(String message){
        String Msg = "";
        int size = Factory.getInstance().createParser(message).getCharCount();
        
        for(int i = 0; i < size; i++){
            char x = Factory.getInstance().createParser(message).getChar(i);
            
            if (x == 'E'){
                Msg += 'A';
            }
            else if (x == 'I'){
                Msg += 'E';
            }
            else if (x == 'O'){
                Msg += 'I';
            }
            else if (x == 'U'){
                Msg += 'O';
            }
            else if (x == 'A'){
                Msg += 'U';
            }
            else{
                Msg += x;
            }
        }
        
        return Msg;
    }
}