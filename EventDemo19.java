import java.awt.*;
import java.awt.event.*;
class EventDemo19 extends Frame implements ItemListener
{
  List li;
  TextField t1,t2;
  Frame f;
  EventDemo19()
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
   t2=new TextField();
   f.add(li);
   f.add(t1);
   f.add(t2);
   li.addItemListener(this);
   li.setBounds(200,100,140,50);
   t1.setBounds(200,160,200,50);
   t2.setBounds(200,240,200,50);
  }
  public void itemStateChanged(ItemEvent e)
  {
  int index[]=li.getSelectedIndexes();
  int count=0;
   String str[]=li.getSelectedItems();
   String  msg=new String();
   for(int i=0;i<index.length;i++)
   {
    msg +=li.getItem(index[i]);
	msg+=" ";
	count++;
   }
   t1.setText(""+msg);
   t2.setText(""+count);
  }
  public static void main(String args[])
  {
   new EventDemo19(); 
  }
}