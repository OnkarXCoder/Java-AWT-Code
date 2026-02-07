import javax.swing.*;
import java.awt.*;
public class Radiodemo extends JFrame
{
  Radiodemo()
  {
   setLayout(new FlowLayout());
   setSize(400,400);
   setVisible(true);
   ButtonGroup bg=new ButtonGroup();
   JRadioButton r1=new JRadioButton("Java",false);
   JRadioButton r2=new JRadioButton("C");
   JRadioButton r3=new JRadioButton("C++",false);
   add(r1);
   add(r2);
   add(r3);
   bg.add(r1);
   bg.add(r2);
   bg.add(r3);
  }
  public static void main(String args[])
  {
  Radiodemo r= new Radiodemo();
  }
}