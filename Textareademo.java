import javax.swing.*;
import java.awt.*;
public class Textareademo extends JFrame
{
  Textareademo()
  {
   setLayout(new FlowLayout());
   setSize(400,400);
   setVisible(true);
   Label l1=new Label("JTextArea");
   TextArea r1=new TextArea(10,20);
   add(l1);
   add(r1);
   
  }
  public static void main(String args[])
  {
  Textareademo r= new Textareademo();
  }
}