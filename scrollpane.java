import javax.swing.*;
import java.awt.*;
class scrollpane extends JFrame
{
  public static void main(String arg[])
  {
	  JFrame f=new JFrame();
  f.setLayout(new BorderLayout());
  f.setSize(400,400);
  f.setVisible(true);
  JPanel jp =new JPanel();
  jp.setLayout(new GridLayout(10,10));
  int b=0;
  for(int i=0;i<10;i++)
  {
  for(int j=0;j<10;j++)
  {
  jp.add(new JButton("Button "+b));
  ++b;
  }
  }
  int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
  int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
  JScrollPane jsp = new JScrollPane(jp,v,h);
  f.add(jsp,BorderLayout.CENTER);
  }
}