public class Enemy1 extends GameObject
{
  private int m_ticks = 0;
  private java.util.Random m_rand = new java.util.Random();
  
  public Enemy1()
  {
    super("./Devil3.png", 350, 10, 70, 70, 0, 0);
  }
  
  public Enemy1(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Devil3.png", x, y, w, h, dX, dY);
  }
  
  @Override
  public void tick(int maxw, int maxh)
  {
		m_ticks++;
		if (m_ticks % 2 == 0)
		{
		   m_x = m_rand.nextInt(maxw);
		   m_y = m_rand.nextInt(maxh);
		}	  
	    m_x = m_x + m_dX;
	    m_y = m_y + m_dY;
	    
	    if (m_x > maxw)
	      m_x = 0;
	    else if (m_x < 0)
	      m_x = maxw;

	    if (m_y > maxh)
	      m_y = 0;
	    else if (m_y < 0)
	      m_y = maxh;

	  }	  

}
