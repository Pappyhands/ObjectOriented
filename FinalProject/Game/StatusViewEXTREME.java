import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;

class StatusViewEXTREME extends JPanel implements IGameView
{
  private JLabel m_status = new JLabel();
  private List<IGameObject> m_objects;
  private int m_seconds = 0;
  public StatusViewEXTREME(List<IGameObject> objects)
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
        m_status.setText(String.format("%s MOMENTS OF CRAZZZZZZZZZ1NESS MY DUDES! KEEP IT UP!", m_seconds));
    }
  }

  @Override
  public JPanel getJPanel()
  {
    return this;
  }
}
