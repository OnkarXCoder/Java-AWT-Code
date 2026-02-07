import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class windowDemo extends Frame implements WindowListener
{
  windowDemo()
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
  System.out.println("System Opened");
  }
  public void windowClosed(WindowEvent e)
  {
  System.out.println("System Closed");
  }
  public void windowActivated(WindowEvent e)
  {
  System.out.println("System Activated");
  }
  public void windowDeactivated(WindowEvent e)
  {
  System.out.println("System Deactivated");
  }
  public void windowIconified(WindowEvent e)
  {
  System.out.println("System Iconified");
  }
  public void windowDeiconified(WindowEvent e)
  {
  System.out.println("System DeIconified");
  }
  public static void main(String args[])
  {
  new windowDemo();
  }
}