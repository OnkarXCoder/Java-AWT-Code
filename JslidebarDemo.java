import javax.swing.*;
import java.awt.*;
class JslidebarDemo extends JFrame
{
JslidebarDemo()
  {
   Container ct=getContentPane();
   JSlider slid=new JSlider(JSlider.HORIZONTAL,0,50,50);
   JPanel pa=new JPanel();
   pa.add(slid);
   ct.add(pa);
  }
  public static void main(String ar[])
  {
  JslidebarDemo f=new JslidebarDemo();
  f.pack();
  f.setTitle("Demonstrating JSlider");
  f.setVisible(true);
  }
}