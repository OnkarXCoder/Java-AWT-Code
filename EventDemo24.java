import java.awt.event.*;
import java.awt.*;
class EventDemo24 extends Frame implements ItemListener
{
	Frame f;
	Choice c;
	TextField t1;
	EventDemo24()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		c = new Choice();
		t1 = new TextField();
		c.add("English");
		c.add("Maths");
		c.add("Science");
		c.add("History");
		c.add("Geography");
		f.add(c);
		f.add(t1);
		c.setBounds(100,100,200,30);
		t1.setBounds(100,200,200,30);
		c.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String str = c.getSelectedItem();
		t1.setText(str);
	}
	public static void main(String args[])
	{
		new EventDemo24();
	}
}