public class FactoryMain
{
    public static void main(String[] args)
    {
        IBodyPartFactory factory = CustomHeadFactory.getInstance();
        MrPotatoHead fred = new MrPotatoHead(22, 12, 
                factory.createHead(),
                factory.createEyes(), 
                factory.createNose(), 
                factory.createMouth());
        fred.draw();
        
        double num = RandomSingleton.getInstance().getRand().nextInt(10);
        System.out.println(num);
    }
}
