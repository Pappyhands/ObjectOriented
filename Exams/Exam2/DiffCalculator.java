import java.util.*;
import java.io.*;

public class DiffCalculator{
    private List<IDiffAlg> m_diffAlgs = new ArrayList();
    
     public void go(String m_file) throws IOException
    {
        m_diffAlgs.add(WeightedOrderAlg.getInstance());
        m_diffAlgs.add(OrderAlg.getInstance());
        m_diffAlgs.add(CountAlg.getInstance());
        
        List<String> l = new ArrayList();
            
            // Goes through everything in the file
            try (BufferedReader br = new BufferedReader(new FileReader(new File(m_file)))) {
           
			String line;
			// While there's another line in the file (if not the loop breaks)
            while ((line = br.readLine()) != null) {
                
                // Splitting each line into an string array thus breaking up all parts of the data
                String[] items = line.split(",");
                l.add(items[0]);
                l.add(items[1]);
            }
            // System.out.println(stringBuffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
// 		m_diffAlgs.get(2).difference("ACTA","AAGT");
		for(int i =0; i<l.size(); i+=2){
		    System.out.println("Word #1: " + l.get(i) + " | Word #2: " + l.get(i+1));
	        for(IDiffAlg dif : m_diffAlgs){
	            System.out.println(dif.getClass().getName() + ": " + dif.difference(l.get(i),l.get(i+1)));
	        }
	        System.out.println();
	    }
    }
    
    // THIS IS BROKEN SOMEWHERE KEEP GETTING OUT OF BOARDS ERROR, NO TIME TO FIX.
    public static void main(String[] args) throws IOException{
        
        
        new DiffCalculator().go("Sequences.txt");
        
    }
}