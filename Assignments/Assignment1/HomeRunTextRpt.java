import java.util.*;
import java.io.*;


public class HomeRunTextRpt{
    
    protected String m_dataFile;
    protected String m_reportFile;
    
    // Constructor
    public HomeRunTextRpt(String dataFile, String reportFile){
        m_dataFile = dataFile;
        m_reportFile = reportFile;
    }
    
    // Grabs the Player's name and Home Runs
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
				    pair = new DataPair(itemList.get(0),Integer.parseInt(itemList.get(1)));
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
    
    // Generates a output, formatting data into a Text file.
    public void generateReport(List<DataPair> data) throws IOException{
      
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(m_reportFile))) {
            
            for(DataPair i : data)
                bw.write(String.format("%-30s %s\n", i.getName(), i.getStat())); 
                
			System.out.println("Data Generated."); // <-- Confirmation that method ran
			
		} catch (IOException e) {
		    
			e.printStackTrace();
			
		}
    }
}