import java.awt.*;
import java.awt.event.*;
class EventDemo16 extends Frame implements ItemListener
{
  List li;
  TextField t1;
  Frame f;
  EventDemo16()
  {
   f=new Frame();
   f.setLayout(null);
   f.setSize(500,400);
   f.setVisible(true);
   li=new List();
   li.add("Solapur");
   li.add("Pune");
   li.add("Mumbai");
   li.add("Latur");
   li.add("Sangli");
   t1=new TextField();
   f.add(li);
   f.add(t1);
   li.addItemListener(this);
   li.setBounds(200,100,140,50);
   t1.setBounds(200,160,80,40);
  }
  public void itemStateChanged(ItemEvent e)
  {
   String str=li.getSelectedItem();
   t1.setText(""+str);
  }
  public static void main(String args[])
  {
   new EventDemo16(); 
  }
}