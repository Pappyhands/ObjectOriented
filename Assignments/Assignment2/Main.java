public class Main{
    public static void main(String[] args){
        
        IDecision next = Builder.getInstance().buildWizard();
        // System.out.println(next);
        do
        {
            next = next.ask();
        } while (next != null);
    }
}