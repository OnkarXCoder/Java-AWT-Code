import javax.swing.*;
import java.awt.*;
public class Textfielddemo extends JFrame
{
  Textfielddemo()
  {
   setLayout(new FlowLayout());
   setSize(400,400);
   setVisible(true);
   ButtonGroup bg=new ButtonGroup();
   TextField r1=new TextField("Java");
   add(r1);
  }
  public static void main(String args[])
  {
  Textfielddemo r= new Textfielddemo();
  }
}