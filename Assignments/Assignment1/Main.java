import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        new Main().go();
    }
    
    public void go() throws IOException
    {
        List<HomeRunTextRpt> reports = new ArrayList<HomeRunTextRpt>();
        reports.add(new HomeRunTextRpt("players.txt", "r1.txt"));
        reports.add(new HomeRunHTMLRpt("players.txt", "r2.html"));
        reports.add(new RBITextRpt("players.txt", "r3.txt"));
        reports.add(new RBIHTMLRptA("players.txt", "r4.html"));
        reports.add(new RBIHTMLRptB("players.txt", "r5.html")); // Mark I changed some of these as to write directly to HTML files for easy viewing/testing.
        makeReports(reports);
    }
    
    private void makeReports(List<HomeRunTextRpt> reports) throws IOException
    {
        for (HomeRunTextRpt rpt : reports)
        {
            List<DataPair> data = rpt.loadData();
            rpt.generateReport(data);
        }
    }
}