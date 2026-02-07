import java.awt.*;
import java.awt.event.*;
public class GridLayout2
{
  public GridLayout2()
  {
  Frame f=new Frame("Menudemo");
  f.setLayout(new GridLayout(4,1,5,5));
  Button b1=new Button("Button 1");
  Button b2=new Button("Button 2");
  Button b3=new Button("Button 3");
  Button b4=new Button("Button 4");
  Button b5=new Button("Button 5");
  Button b6=new Button("Button 6");
  TextField t1=new TextField();
  TextField t2=new TextField();
  TextField t3=new TextField();
  TextField t4=new TextField();
  TextField t5=new TextField();
  TextField t6=new TextField();
  f.setVisible(true);
  f.setSize(600,500);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.add(b6);
  f.add(t1);
  f.add(t2);
  f.add(t3);
  f.add(t4);
  f.add(t5);
  f.add(t6);

  }
  public static void main(String args[])
  {
  GridLayout2 f1=new GridLayout2();
  }
}