import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class windowDemo1 extends Frame implements WindowListener
{
  windowDemo1()
  {
   setTitle("Window Listener");
   setBounds(100,200,200,200);
   setVisible(true);
   setSize(400,500);
   addWindowListener(this);
  }
  public void windowClosing(WindowEvent e)
  {
  System.out.println("System Closeing");
  dispose();
  System.exit(0);
  }
  public void windowOpened(WindowEvent e)
  {
  }
  public void windowClosed(WindowEvent e)
  {
  }
  public void windowActivated(WindowEvent e)
  {
  }
  public void windowDeactivated(WindowEvent e)
  {
  }
  public void windowIconified(WindowEvent e)
  {
  }
  public void windowDeiconified(WindowEvent e)
  {
  }
  public static void main(String args[])
  {
  new windowDemo1();
  }
}