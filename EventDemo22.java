import java.awt.*;
import java.awt.event.*;
class EventDemo22 implements ItemListener
{
  Checkbox c1,c2,c3,c4;
  TextField t1,t2,t3;
	  EventDemo22()
	  {
	   Frame f=new Frame();
	   f.setLayout(null);
	   f.setSize(500,500);
	   f.setVisible(true);
	   CheckboxGroup cbg=new CheckboxGroup();
	   c1=new Checkbox("Add",true,cbg);
	   c2=new Checkbox("Sub",false,cbg);
	   c3=new Checkbox("Mul",false,cbg);
	   c4=new Checkbox("Div",false,cbg);
	   t1=new TextField();
	   t2=new TextField();
	   t3=new TextField();
	   f.add(c1);
	   f.add(c2);
	   f.add(c3);
	   f.add(c4);
	   f.add(t1);
	   f.add(t2);
	   f.add(t3);
	   c1.setBounds(150,50,50,30);
	   c2.setBounds(200,50,50,30);
	   c3.setBounds(250,50,50,30);
	   c4.setBounds(300,50,50,30);
	   t3.setBounds(200,250,100,30);
	   t1.setBounds(100,150,80,30);
	   t2.setBounds(240,150,80,30);
	   c1.addItemListener(this);
	   c2.addItemListener(this);
	   c3.addItemListener(this);
	   c4.addItemListener(this);
	   c5.addItemListener(this);
	  }
	  public void itemStateChanged(ItemEvent e)
	  {
         double n1,n2,n3=0;
		 n1=Double.parseDouble(t1.getText());
		 n2=Double.parseDouble(t2.getText());
	    if(c1.getState()==true)
         {
		 n3=n1+n2;
		 }
		  if(c2.getState()==true)
         {
		 n3=n1-n2;
		 }
		 if(c3.getState()==true)
         {
		n3=n1*n2;
		 } 
		 if(c4.getState()==true)
         {
		 n3=n1/n2;
		 }
		 
		 t3.setText(" "+n3);
	  }
	  public static void main(String args[])
	  {
		  new EventDemo22();
	  }
}