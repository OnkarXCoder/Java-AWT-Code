import javax.swing.*;
import java.awt.*;
public class Combo extends JFrame
{
  Combo()
  {
   setLayout(new FlowLayout());
   setSize(400,400);
   setVisible(true);
   String str[]={"C","C++","Java","Advance Java"};
   JLabel l1=new JLabel("JTextArea");
   JComboBox r1=new JComboBox(str);
   add(l1);
   add(r1);
  }
  public static void main(String args[])
  {
  Combo r= new Combo();
  }
}