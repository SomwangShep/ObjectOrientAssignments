import java.util.*;

public interface IFactory
{
  public IGameObject createEnemy();
  public IGameObject createHero();
  public IGameView createMainView(List<IGameObject> objects);
  public IGameView createStatusView(List<IGameObject> objects);
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views);
}
