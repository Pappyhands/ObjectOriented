public abstract class AbstractOrderAlg implements IDiffAlg{
    @Override
    public int difference(String seq1, String seq2){
        char[] word1 = seq1.toCharArray();
        char[] word2 = seq2.toCharArray();
        
        int penalty = 0;
        int count = 0;
        
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
        
        for(int i = 0; i < word1.length; i++){
            // System.out.println(word1[i] + " " + word2[i]);
            if (word1[i] != word2[i]){
                    penalty += getPenalty(word1[i]);
            }
       
        }
        return penalty;
    }
    
    abstract protected int getPenalty(char ch1);
}