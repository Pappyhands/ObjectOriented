import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class MainFrame extends JFrame
{
  public static void main(String args[])
  {
    JFrame frame = new MainFrame();
    frame.setVisible(true);
  }

  public MainFrame()
  {
    super("Game Engine Example");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int interval = 100;

    // model
    List<IGameObject> objects = new ArrayList<IGameObject>();

    // Hero is always at spot #1, enemies are 4 & 5, statusView
						                                    //y  , x  , w  , h   dX,dY, object #
    objects.add(Factory.getInstance().createHero(0, 00, 120, 120, 5, 5, 1)); // always make hero first o read list!
    objects.add(Factory.getInstance().createEnemy(300, 300, 40, 40, 5, 5, 4));
    objects.add(Factory.getInstance().createEnemy(300, 300, 40, 40, 5, 5, 5));


    // view
    IGameView view = Factory.getInstance().createMainView(objects);
    IGameView statusView = Factory.getInstance().createStatusView(objects, 8); // 8th object from txt file is the view controller
    List<IGameView> views = new ArrayList<IGameView>();
    views.add(view);
    views.add(statusView);

    // controller
    IGameController controller = Factory.getInstance().createController(interval, objects, views);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(view.getJPanel(), BorderLayout.CENTER);
    getContentPane().add(statusView.getJPanel(), BorderLayout.SOUTH);

    controller.startGame();
  }
}
