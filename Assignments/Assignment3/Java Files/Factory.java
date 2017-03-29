public class Factory{
    
    // Creating the 3 elements of a singleton
    public static Factory m_instance;
    
    public static Factory getInstance(){
        if (m_instance == null)
            m_instance = new Factory();
        return m_instance;
    }
    
    private Factory(){}
    
    // returns a MessageParser Object
    public IMessageParser createParser(String text){
        return new MessageParser(text);
    }
}