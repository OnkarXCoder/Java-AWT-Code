import java.awt.*;
import java.awt.event.*;
class EventDemo21 implements ItemListener
{
  Checkbox c1,c2,c3,c4,c5;
  TextField t1;

	  EventDemo21()
	  {
		  Frame f=new Frame();
	   f.setLayout(null);
	   f.setSize(500,500);
	   f.setVisible(true);
	   CheckboxGroup cbg=new CheckboxGroup();

	   c1=new Checkbox("C",true,cbg);
	   c2=new Checkbox("C++",false,cbg);
	   c3=new Checkbox("Java",false,cbg);
	   c4=new Checkbox("SQL",false,cbg);
	   c5=new Checkbox("PhP",false,cbg);
	   t1=new TextField();
	   f.add(c1);
	   f.add(c2);
	   f.add(c3);
	   f.add(c4);
	   f.add(c5);
	   f.add(t1);
	   c1.setBounds(150,50,50,30);
	   c2.setBounds(200,50,50,30);
	   c3.setBounds(250,50,50,30);
	   c4.setBounds(300,50,50,30);
	   c5.setBounds(350,50,50,30);
	   t1.setBounds(200,250,100,30);
	   c1.addItemListener(this);
	   c2.addItemListener(this);
	   c3.addItemListener(this);
	   c4.addItemListener(this);
	   c5.addItemListener(this);
	  }
	  public void itemStateChanged(ItemEvent e)
	  {
		  String msg=new String();
	   if(c1.getState()==true)
         {
		 msg+=" "+c1.getLabel();
		 }
		  if(c2.getState()==true)
         {
		 msg+=" "+c2.getLabel();
		 }
		 if(c3.getState()==true)
         {
		 msg+=" "+c3.getLabel();
		 } 
		 if(c4.getState()==true)
         {
		 msg+=" "+c4.getLabel();
		 }
		  if(c5.getState()==true)
         {
		 msg+=" "+c5.getLabel();
		 }
		 t1.setText(" "+msg);
	  }
	  public static void main(String args[])
	  {
		  new EventDemo21();
	  }
}