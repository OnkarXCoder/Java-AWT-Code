import java.awt.event.*;
import java.awt.*;
class EventDemo25 extends Frame implements ItemListener
{
	Frame f;
	TextField t1;
	Checkbox c1;
	Checkbox c2;
	Checkbox c3;
	Checkbox c4;
	EventDemo25()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		t1 = new TextField();
		CheckboxGroup cbg = new CheckboxGroup();
		c1 = new Checkbox("UPPER",cbg,false);
		c2 = new Checkbox("LOWER",cbg,false);
		c3 = new Checkbox("LENGTH",cbg,false);
		c4 = new Checkbox("BLANK",cbg,false);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(t1);
		c1.setBounds(100,200,100,30);
		c2.setBounds(220,200,100,30);
		c3.setBounds(320,200,100,30);
		c4.setBounds(420,200,100,30);
		t1.setBounds(150,100,200,30);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String msg = t1.getText();
		if(c1.getState()==true)
		{
			t1.setText(msg.toUpperCase());
		}
		if(c2.getState()==true)
		{
			t1.setText(msg.toLowerCase());
		}
		if(c3.getState()==true)
		{
			t1.setText(""+msg.length());
		}
		if(c4.getState()==true)
		{
			t1.setText("");
		}
	}
	public static void main(String args[])
	{
		new EventDemo25();
	}
}