import javax.swing.*;

import com.sun.prism.paint.Color;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.*;

class StatusView2 extends JPanel implements IGameView
{
  private JLabel m_status = new JLabel();
  private int t = 0;
  
  List<IGameObject> m_objects;
  IGameController controller;

  public StatusView2()
  {
    setLayout(new BorderLayout());
    m_status.setText("");
    add(m_status, BorderLayout.CENTER);
  }
  public void setObject(List<IGameObject> objects )
  {
	  m_objects = objects;
  }
  
  public void setTime(IGameController controller)
  {
	  this.controller = controller;
  }
  
  public StatusView2(List<IGameObject> objects)
  {
    m_objects = objects;
    setLayout(new BorderLayout());
    m_status.setText("");
    add(m_status, BorderLayout.CENTER);
  }

  @Override
  public void tick()
  {
	  String s = "";
	  int sec = 0;
	  t = t + 1;
	  sec = 10-(t/10);
	  
	   if ((
			   Math.abs(
					   (m_objects.get(0).getX()+m_objects.get(0).getW()/2)-
					   (m_objects.get(1).getX()+m_objects.get(1).getW()/2)
				)<=m_objects.get(0).getW()/2
			   &&
			   Math.abs(
					   (m_objects.get(0).getY()+m_objects.get(0).getH()/2)-
					   (m_objects.get(1).getY()+m_objects.get(1).getH()/2)
				)<=m_objects.get(0).getH()/2
		) || sec == 0)
	   {
		   if (sec == 0)
			   s  = "<font color='cyan'>- Game Over</font><font color='yellow'> - You Win!!</font>";
		   else
			   s  = "<font color='cyan'>- Game Over</font><font color='orange'> - You Lose!!</font>";
		   controller.stopGame();
	   }
		    	  	  
	    if (m_objects.size()> 1)
	    {
	    	m_status.setText(String.format("<html><span style='background-color: #009911;'>Time remaining: <font color='red'>%d</font> %s</span></html>",sec,s));
	    	m_status.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 20));
	    }      
  }

  @Override
  public JPanel getJPanel()
  {
    return this;
  }

}
