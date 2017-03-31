import java.util.*;

// Standard Message Parser
public class MessageParser implements IMessageParser{
    
    // Creates List to hold each individual word, creates the message variable
    private List<String> m_words = new ArrayList<String>();
    private String m_msg = "";
    
    // Constructor
    public MessageParser(String msg){
        m_msg = msg;
    }
    
    // Takes the message string, converts it into a character array and then returns said array's length as an INT
    @Override
    public int getCharCount(){
        return m_msg.toCharArray().length;
    }
    
    // Splits the message into an ArrayList using the spaces as the cutting point, returns the size of said list as an INT
    @Override
    public int getWordCount(){
        m_words = new ArrayList<String>(Arrays.asList(m_msg.split(" ")));
        return m_words.size();
    }
    
    // Converts message into a character array and then returns the value at index 'i'
    @Override
    public char getChar(int i){
        char[] chars= m_msg.toCharArray();
        return chars[i];
    }
    
    // Converts message into a character array and then returns the value at index 'i'
    @Override
    public String getWord(int i){
        m_words = new ArrayList<String>(Arrays.asList(m_msg.split(" ")));
        return m_words.get(i);
    }
}