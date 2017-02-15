import java.util.*;
import java.io.*;


public class RBIHTMLRptB extends RBITextRpt{
    
    // Constructor
    public RBIHTMLRptB(String dataFile, String reportFile){
        super(dataFile,reportFile); // Using HomeRunHTMLRpt's constructor
        
    }
    
   // Generates a output, formatting data into a HTML file.
    @Override
    public void generateReport(List<DataPair> data) throws IOException{
      
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(m_reportFile))) {
            // Adding HTMl tags
             bw.write(String.format("<html>\n<body>\n<table>\n"));
             
            for(DataPair i : data)
                bw.write(String.format("<tr><td>%s</td><td>%s</td></tr>\n", i.getName(), i.getStat()));
			System.out.println("Data Generated."); // <-- Confirmation that method ran
			
			bw.write(String.format("</html>\n</body>\n</table>\n"));
			
		} catch (IOException e) {
		    
			e.printStackTrace();
			
		}
    }
}