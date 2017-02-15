import java.util.*;
import java.io.*;


public class RBIHTMLRptA extends HomeRunHTMLRpt{
    
    // Constructor
    public RBIHTMLRptA(String dataFile, String reportFile){
        super(dataFile,reportFile); // Using HomeRunHTMLRpt's constructor
        
    }
    
    // Grabs the Player's name and RBIs
    @Override
    public List<DataPair> loadData() throws IOException{
        
        // Opens File using the filename and creates an ArrayList of DataPairs
      	File dataFile = new File(m_dataFile);
        List<DataPair> l = new ArrayList();
            
            // Goes through everything in the file
            try (BufferedReader br = new BufferedReader(new FileReader(dataFile))) {
           
			String line;
			DataPair pair;
			
			// While there's another line in the file (if not the loop breaks)
            while ((line = br.readLine()) != null) {
                
                // Splitting each line into an string array thus breaking up all parts of the data
                String[] items = line.split(",");
                List<String> itemList = Arrays.asList(items);
				
				// If a Player has no data then it defaults to 0
				if(itemList.size() == 3)
				    pair = new DataPair(itemList.get(0),Integer.parseInt(itemList.get(2)));
				else
				    pair = new DataPair(itemList.get(0),0);
                
                l.add(pair);
            }
            // System.out.println(stringBuffer);
		} catch (IOException e) {
			e.printStackTrace();
		}

        return l;
    }
}