import java.awt.*;
import java.awt.event.*;
class EventDemo17 extends Frame implements ItemListener
{
  List li;
  TextField t1;
  Frame f;
  EventDemo17()
  {
   f=new Frame();
   f.setLayout(null);
   f.setSize(500,400);
   f.setVisible(true);
   li=new List(4,true);
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
   t1.setBounds(200,160,200,50);
  }
  public void itemStateChanged(ItemEvent e)
  {
   String str[]=li.getSelectedItems();
   String  msg=new String();
   for(String s:str)
   {
    msg=msg+s;
   }
   t1.setText(""+msg);
  }
  public static void main(String args[])
  {
   new EventDemo17(); 
  }
}