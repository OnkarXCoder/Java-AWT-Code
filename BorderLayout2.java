import java.awt.*;
import java.awt.event.*;
public class BorderLayout2
{
  public BorderLayout2()
  {
  Frame f=new Frame("Menudemo");
  f.setLayout(new BorderLayout(10,10));
  TextField b1=new TextField();
  TextField b2=new TextField();
  TextField b3=new TextField();
  TextField b4=new TextField();
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
  BorderLayout2 f1=new BorderLayout2();
  }
}