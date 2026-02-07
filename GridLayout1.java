import java.awt.*;
import java.awt.event.*;
public class GridLayout1
{
  public GridLayout1()
  {
  Frame f=new Frame("Menudemo");
  f.setLayout(new GridLayout(4,1,5,5));
  Button b1=new Button("Button 1");
  Button b2=new Button("Button 2");
  Button b3=new Button("Button 3");
  Button b4=new Button("Button 4");
  Button b5=new Button("Button 5");
  Button b6=new Button("Button 6");
  Button b7=new Button("Button 7");
  Button b8=new Button("Button 8");
  
  f.setVisible(true);
  f.setSize(600,500);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.add(b6);
  f.add(b7);
  f.add(b8);
  }
  public static void main(String args[])
  {
  GridLayout1 f1=new GridLayout1();
  }
}