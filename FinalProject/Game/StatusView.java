import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;

class StatusView extends JPanel implements IGameView
{
  private JLabel m_status = new JLabel();
  private List<IGameObject> m_objects;
  private int m_seconds = 0;
  public StatusView(List<IGameObject> objects)
  {
    m_objects = objects;
    setLayout(new BorderLayout());
    m_status.setText("");
    add(m_status, BorderLayout.CENTER);
  }

  @Override
  public void tick()
  {
    m_seconds++;
    if (m_objects.size()> 1)
    {
        m_status.setText(String.format("You have been alive for %s (s).", m_seconds));
    }
  }

  @Override
  public JPanel getJPanel()
  {
    return this;
  }
}
