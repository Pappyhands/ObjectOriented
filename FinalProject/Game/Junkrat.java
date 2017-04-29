public class Junkrat extends GameObject
{
  private int m_ticks = 0;

  public Junkrat(int x, int y, int w, int h, int dX, int dY)
  {
    super("./heros/junkrat.png", x, y, w, h, 0, 0);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    m_ticks++;

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
      m_dX = -5;
      m_dY = 0;
    }
    else if (ch == 'd')
    {
      m_dX = 5;
      m_dY = 0;
    }
    else if (ch == 'w')
    {
      m_dX = 0;
      m_dY = -5;
    }
    else if (ch == 's')
    {
      m_dX = 0;
      m_dY = 5;
    }
    else
    {
      m_dX = 0;
      m_dY = 0;
    }
  }

}
