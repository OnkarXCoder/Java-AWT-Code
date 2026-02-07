import java.awt.*;
import java.awt.event.*;
public class FlowLayout1
{
  public FlowLayout1()
  {
  Frame f=new Frame("Menudemo");
  f.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
  Button b1=new Button("Button 1");
  Button b2=new Button("Button 2");
  Button b3=new Button("Button 3");
  Button b4=new Button("Button 4");
  Button b5=new Button("Button 5");
  Button b6=new Button("Button 6");
  Button b7=new Button("Button 7");
  Button b8=new Button("Button 8");
  Button b9=new Button("Button 9");
  Button b10=new Button("Button 10");
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
  f.add(b9,FlowLayout.LEFT);
  f.add(b10,FlowLayout.RIGHT);
  }
  public static void main(String args[])
  {
  FlowLayout1 f1=new FlowLayout1();
  }
}