import java.util.*;
import java.util.List;
import java.io.*;

public class Factory implements IFactory
{
  private static IFactory m_instance;
  public static IFactory getInstance()
  {
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }
  private Factory() {}

  private List<String> names = new ArrayList<String>();

  // reads text file
  public void readFile(String file_name){
    try{
      String data = "";
      Scanner f = new Scanner(new File(file_name));
      while (f.hasNextLine()){
        data += f.nextLine().trim() + ",";
      }

        for (String x: data.split(",")) {
          names.add(x);
      }
    }catch(Exception e){
      throw new Error("Unable to read file.");
    }
  }
  @Override
  public IGameObject createEnemy(int x, int y, int w, int h, int dX, int dY, int whichOne)
  {
    IGameObject o = null;
    try{
      System.out.println(names);
      Class c = Class.forName(names.get(whichOne));
      o =  (IGameObject)c.getConstructor(int.class,int.class,int.class,int.class,int.class,int.class).newInstance(x,y,w,h,dX,dY);
    }catch(Exception e){
      throw new Error("Unable to create instance.");
    }
    return o;
    // return new Ball(x, y, w, h, dX, dY);
  }

  @Override
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY, int whichOne)
  {
    readFile("Behavior.txt");
    IGameObject o = null;
    try{
      System.out.println(names);
      Class c = Class.forName(names.get(whichOne));
      o =  (IGameObject)c.getConstructor(int.class,int.class,int.class,int.class,int.class,int.class).newInstance(x,y,w,h,dX,dY);
    }catch(Exception e){
      throw new Error("Unable to create instance.");
    }
    return o;
    // return new Hero(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
    return new StatusView(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
}
