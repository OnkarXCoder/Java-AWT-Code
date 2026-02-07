import java.awt.event.*;
import java.awt.*;
class EventDemo23 extends Frame implements ItemListener
{
	Frame f;
	Checkbox c1;
	Checkbox c2;
	Checkbox c3;
	Checkbox c4;
	EventDemo23()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		CheckboxGroup cbg = new CheckboxGroup();
		c1 = new Checkbox("RED",cbg,false);
		c2 = new Checkbox("BLUE",cbg,false);
		c3 = new Checkbox("YELLOW",cbg,false);
		c4 = new Checkbox("GREEN",cbg,false);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		c1.setBounds(50,50,100,30);
		c2.setBounds(150,50,100,30);
		c3.setBounds(250,50,100,30);
		c4.setBounds(350,50,100,30);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(c1.getState()==true)
		{
			f.setBackground(Color.RED);
		}
		if(c2.getState()==true)
		{
			f.setBackground(Color.BLUE);
		}
		if(c3.getState()==true)
		{
			f.setBackground(Color.YELLOW);
		}
		if(c4.getState()==true)
		{
			f.setBackground(Color.GREEN);
		}
	}
	public static void main(String args[])
	{
		new EventDemo23();
	}
}