
public class Enemy2 extends GameObject
{
  public Enemy2()
  {
     super("./Devil2.png", 80, 50, 50, 50, 5, 55);
  }	
  
  public Enemy2(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Devil2.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
	  	m_x = m_x + m_dX;
	    m_y = m_y + m_dY;
	    
	    if (m_x > maxw)
	      m_x = 0;
	    else if (m_x < 0)
	      m_x = maxw;

	    if (m_y > maxh || m_y<0)
	    	m_dY *= -1;    

  }

}
