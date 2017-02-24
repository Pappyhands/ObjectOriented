public class CustomHeadFactory implements IBodyPartFactory
{
    private static CustomHeadFactory m_instance;
    
    public static CustomHeadFactory getInstance()
    {
        if (m_instance == null)
            m_instance = new CustomHeadFactory();
        return m_instance;
    }
    /*IBodyPartFactory factory = CustomHeadFactory.getInstance();*/
    
    private CustomHeadFactory(){}
    
    @Override
    public IBodyPart createEyes()
    {   
        int num = RandomSingleton.getInstance().getRand().nextInt(2);
        switch (num){
            case 0:
                return new BigEyes();
            case 1:
                return new SmallEyes();
            default:
                return null;
        }
    }

    @Override
    public IBodyPart createNose()
    {
        return new SimpleNose();
    }

    @Override
    public IBodyPart createMouth()
    {
        int num = RandomSingleton.getInstance().getRand().nextInt(2);
        switch(num){
            case 0:
                return new Happy();
            case 1:
                return new Sad();
            default:
                return null;
        }
    }

    @Override
    public IBodyPart createHead()
    {
        int num = RandomSingleton.getInstance().getRand().nextInt(3);
        switch (num){
            case 0:
                return new NoHead();
            case 1:
                return new SquareHead();
            case 2:
                return new AngleHead();
            default:
                return null;
        }
    }

}
