import java.awt.*;
import java.awt.event.*;
public class Motiondemo3 extends Frame implements MouseMotionListener
{
 Frame f;
 TextField t1;
   Motiondemo3()
   {
    f=new Frame();
	f.setLayout(null);
	f.setVisible(true);
	f.setSize(400,500);
	t1=new TextField();
	f.add(t1);
	t1.setBounds(100,50,200,30);
	f.addMouseMotionListener(this);
   }
   public void mouseMoved(MouseEvent m)
   {
    t1.setText("Mouse Moved");
   }
   public void mouseDragged(MouseEvent m)
   {
   t1.setText("Mouse Dragged");
   }
   public static void main(String args[])
   {
   Motiondemo3 m1=new Motiondemo3();
   }
}