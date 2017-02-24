import java.util.*;
public class Mean implements IGrader{
    
    protected int[] m_grades;
    protected IFilter m_filter;
    
    public Mean(int[] grades, IFilter filter)
    {
        m_filter = filter;
        if (filter != null)
            m_grades = filter.filter(grades);
        else
            m_grades = grades;
        
    }
    
    @Override
    public double grade()
    {
        return average();
    }
    
    protected double average()
    {
        double sum = 0.0;
        for (int i : m_grades)
            sum += i;
        return sum/m_grades.length;
    }
}