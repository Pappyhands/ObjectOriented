import java.util.*;

public class PickerFactory
{
    private static PickerFactory m_instance;
    public static PickerFactory getInstance()
    {
        if (m_instance == null)
            m_instance = new PickerFactory();
        return m_instance;
    }
    private PickerFactory() {}
    
    // THIS IS THE METHOD I CHANGED IN ONE TO MAKE IT HAVE A 50% CHANCE OF PICKING EITHER PICKING STRATEGIES
    public IWordPicker makePicker()
    {
        Random rand = new Random();

        int  n = rand.nextInt(2) + 1;
        
        if(n == 1){    
            return new LengthPicker();
        }else{
            return new Ratio();
        }
    }
}