import java.io.File;
import java.util.*;

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

  @Override
  public IGameObject createEnemy()
  {
	  IGameObject m = null;
      try 
      {
          String name = "";
          Scanner f = new Scanner(new File("Enemy.txt"));
          if (f.hasNextLine())
              name = f.nextLine().trim();
              
          Class c = Class.forName(name);  
          m = (IGameObject) c.newInstance();  
      }
      catch (Exception e)
      {
          throw new Error("Unable to create Message instance: "+ e.toString());
      }
      return m;	  
  }

  @Override
  public IGameObject createHero()
  {
	  IGameObject m = null;
      try 
      {
          String name = "";
          Scanner f = new Scanner(new File("Hero.txt"));
          if (f.hasNextLine())
              name = f.nextLine().trim();
              
          Class c = Class.forName(name);  
          m = (IGameObject) c.newInstance();  
      }
      catch (Exception e)
      {
          throw new Error("Unable to create Message instance" + e.toString());
      }
      return m;	 	  
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
	  IGameView m = null;
      try 
      {
          String name = "";
          Scanner f = new Scanner(new File("StatusView.txt"));
          if (f.hasNextLine())
              name = f.nextLine().trim();
              
          Class c = Class.forName(name);  
          m = (IGameView) c.newInstance();  
          m.setObject(objects);
      }
      catch (Exception e)
      {
          throw new Error("Unable to create Message instance" + e.toString());
      }
      return m;	 
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
}
