import java.awt.*;
import java.awt.event.*;
public class MouseDemo2 extends Frame implements MouseListener
{
   TextField t1;
   Frame f;
   MouseDemo2()
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
    t1.setBackground(Color.GREEN);
   }
   public void mousePressed(MouseEvent me)
   {
    t1.setBackground(Color.BLUE);
   }
   
   public void mouseReleased(MouseEvent me)
   {
    t1.setBackground(Color.PINK);
   }
   public void mouseEntered(MouseEvent me)
   {
    t1.setBackground(Color.ORANGE);
   }
   public void mouseExited(MouseEvent me)
   {
    t1.setBackground(Color.RED);
   }
   public static void main(String args[])
   {
   MouseDemo2 m1=new MouseDemo2();
   }
}