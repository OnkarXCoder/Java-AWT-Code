import java.awt.*;
import java.awt.event.*;
public class MouseDemo1 extends Frame implements MouseListener
{
   TextField t1;
   Frame f;
   MouseDemo1()
   {
   setTitle("Window Listener");
   setVisible(true);
   setSize(400,500);
   setLayout(null);
   t1=new TextField();
   add(t1);
   t1.setBounds(50,50,150,20);
   t1.addMouseListener(this);
   }                                                                           
   public void mouseClicked(MouseEvent me)
   {
    t1.setText("Mouse Clicked");
   }
   public void mousePressed(MouseEvent me)
   {
    t1.setText("Mouse Pressed");
   }
   
   public void mouseReleased(MouseEvent me)
   {
    t1.setText("Mouse Released");
   }
   public void mouseEntered(MouseEvent me)
   {
    t1.setText("Mouse Pressed");
   }
   public void mouseExited(MouseEvent me)
   {
    t1.setText("Mouse Exited");
   }
   public static void main(String args[])
   {
   MouseDemo1 m1=new MouseDemo1();
   }
}