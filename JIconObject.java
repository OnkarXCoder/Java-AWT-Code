import javax.swing.*;
import java.awt.*;
public class JIconObject extends JFrame
{
   JIconObject()
   {
    setLayout(new FlowLayout());
	setSize(400,400);
	setVisible(true);
	ImageIcon i=new ImageIcon("C:\\e-logo\\hanuman.jpg");
	JButton b1=new JButton("",i);
	add(b1);
	b1.setBounds(10,20,400,400);
   }
   public static void main(String a[])
   {
    JIconObject g=new JIconObject();
   }
} 