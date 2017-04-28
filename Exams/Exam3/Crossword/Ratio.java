import java.util.*;


// THIS IS THE ONE NEW CLASS I ADDED TO THE PROGRAM
public class Ratio implements IWordPicker
{
    @Override
    public boolean approveWord(String word)
    {
        char[] ary = word.toCharArray();
        int check = (ary.length / 3) * 2;
        int count = 0;
        
        //a e i o u y
    
        for(char c : ary){
            
            if(!isVowel(c)){
                count++;
            }
        }
        
        if (count >= check){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
        {    
            return true;
        }    
        else
        {
            return false;
        }    
    }
}