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
    super("Moving Game");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int interval = 100;

    /*==================== model ===============================*/
    List<IGameObject> objects = new ArrayList<IGameObject>();
    objects.add(Factory.getInstance().createEnemy());
    objects.add(Factory.getInstance().createHero());

    /*===================== view ===============================*/
    IGameView view = Factory.getInstance().createMainView(objects);
    IGameView statusView = Factory.getInstance().createStatusView(objects);
    List<IGameView> views = new ArrayList<IGameView>();
    views.add(view);
    views.add(statusView);   
    
    /*================= controller =============================*/
    String s = statusView.toString().substring(0, 11);
    IGameController controller = Factory.getInstance().createController(interval, objects, views);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(view.getJPanel(), BorderLayout.CENTER);
    
   if (s.equals("StatusView1"))
    	getContentPane().add(statusView.getJPanel(), BorderLayout.SOUTH);
    else
    	getContentPane().add(statusView.getJPanel(), BorderLayout.NORTH);
    
   controller.startGame();
   statusView.setTime(controller);
  }
}
