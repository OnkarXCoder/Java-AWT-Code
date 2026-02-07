import java.awt.*;
import java.awt.event.*;
public class FocusEventDemo implements FocusListener
{
	TextField t1,t2;
	Frame f;
	FocusEventDemo()
	{
		f = new Frame("TextEventDemo");
		t1 = new TextField(25);
		t2 = new TextField(25);
		f.setLayout(new FlowLayout());
		f.add(t1);
		f.add(t2);
		t1.addFocusListener(this);
		f.setSize(340,200);
		f.setVisible(true);
	}
	public void focusGained(FocusEvent te)
	{
		f.setBackground(Color.RED);
	}
	public void focusLost(FocusEvent te)
	{
		f.setBackground(Color.GREEN);
	}
	public static void main(String args[])
	{
		new FocusEventDemo();
	}
}