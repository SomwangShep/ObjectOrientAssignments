public class Hero3 extends GameObject
{
  private int m_ticks = 0;
  private java.util.Random m_rand = new java.util.Random();
  private static int sp = 20;//speed
  
  public Hero3()
  {
    super("./Buterfly.png", 50, 200, 45, 45, sp-5, sp);
  }
  
  public Hero3(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Buterfly.png", x, y, w, h, 0, 0);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    m_x += m_dX;
    m_y += m_dY;

    if (m_x > maxw)
      m_x = 0;
    else if (m_x < 0)
      m_x = maxw;

    if (m_y > maxh)
      m_y = 0;
    else if (m_y < 0)
      m_y = maxh;
  }

  @Override
  public void keyPressed(char ch)
  {
    System.out.println(ch);
    if (ch == 'a')
    {
      m_dX = -sp;
      m_dY = 0;
    }
    else if (ch == 's')
    {
      m_dX = sp;
      m_dY = 0;
    }
    else if (ch == 'w')
    {
      m_dX = 0;
      m_dY = -sp;
    }
    else if (ch == 'z')
    {
      m_dX = 0;
      m_dY = sp;
    }
    else
    {
      m_dX = 0;
      m_dY = 0;
    }
  }

}
