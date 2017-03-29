public class WordReverse implements ICrypto{
    
    // Creating the 3 elements of a singleton
    public static WordReverse m_instance;
    
    public static ICrypto getInstance(){
        if (m_instance == null)
            m_instance = new WordReverse();
        return m_instance;
    }
    
    private WordReverse(){}
    
    public String encrypt(String message){
        String Msg = "";
        int size = Factory.getInstance().createParser(message).getWordCount();
        
        for(int i = 0; i < size; i++){
            Msg += Factory.getInstance().createParser(message).getWord(i);
            if (i != size-1)
                Msg += " ";
        }
        
        String newMsg = "";
        
        for(String word : Msg.split(" ")) {
            newMsg += new StringBuilder(word).reverse().toString();
            newMsg += " ";
        }
        
        return newMsg;
    }
    
    public String decrypt(String message){
        String Msg = "";
        int size = Factory.getInstance().createParser(message).getWordCount();
        
        for(int i = 0; i < size; i++){
            Msg += Factory.getInstance().createParser(message).getWord(i);
            if (i != size-1)
                Msg += " ";
        }
        
        String newMsg = "";
        
        for(String word : Msg.split(" ")) {
            newMsg += new StringBuilder(word).reverse().toString();
            newMsg += " ";
        }
        
        return newMsg;
    }
}