import java.util.*;
public class CountAlg implements IDiffAlg{
    
    public static CountAlg m_instance;
    
    public static CountAlg getInstance(){
        if(m_instance == null)
            m_instance = new CountAlg();
            
        return m_instance;
    }
    @Override
    public int difference(String seq1, String seq2){
        char[] word1 = seq1.toCharArray();
        char[] word2 = seq2.toCharArray();
        
        int penalty = 0;
        int count = 0;
        
        // MIGHT BE WRONG SOMEWHERE
        
        int[] letterCount1 = {0,  0,  0,  0};
        // Values in Order:   A | G | C | T
        int[] letterCount2 = {0,  0,  0,  0};
        
        for(char c : word1){
            // First Word Letter Count
            if(word1[count] == 'A')
                letterCount1[0] += 1;
            else if(word1[count] == 'G')
                letterCount1[1] += 1;
            else if(word1[count] == 'C')
                letterCount1[2] += 1;
            else if(word1[count] == 'T')
                letterCount1[3] += 1;
                
            // Second Word Letter Count
            if(word2[count] == 'A')
                letterCount2[0] += 1;
            else if(word2[count] == 'G')
                letterCount2[1] += 1;
            else if(word2[count] == 'C')
                letterCount2[2] += 1;
            else if(word2[count] == 'T')
                letterCount2[3] += 1;
            
            count++;
        }
        
        for(int i=0; i<letterCount1.length; i++){
            if(letterCount1[i] == 0 || letterCount2[i] == 0){
                penalty += letterCount1[i] + letterCount2[i];
            }else{
                int greater = 0;
                int lesser = 0;
                // ------
                if(letterCount1[i] > letterCount2[i]){
                    greater = letterCount1[i];
                    lesser = letterCount2[i];
                }else{
                    lesser = letterCount1[i];
                    greater = letterCount2[i];
                    
                }
                        
                penalty += (greater - lesser);
            }
        }
        return penalty;
    }
}