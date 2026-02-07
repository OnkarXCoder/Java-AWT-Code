import java.awt.*;
import java.awt.event.*;
public class FlowLayout2
{
  public FlowLayout2()
  {
  Frame f=new Frame("Menudemo");
  f.setLayout(new BorderLayout(5,5));
  Button b1=new Button("Button 1");
  Button b2=new Button("Button 2");
  Button b3=new Button("Button 3");
  Button b4=new Button("Button 4");
  Button b5=new Button("Button 5");
  f.setVisible(true);
  f.setSize(600,500);
  f.add(b1,BorderLayout.NORTH);
  f.add(b2,BorderLayout.SOUTH);
  f.add(b3,BorderLayout.WEST);
  f.add(b4,BorderLayout.EAST);
  f.add(b5,BorderLayout.CENTER);
  }
  public static void main(String args[])
  {
  FlowLayout2 f1=new FlowLayout2();
  }
}