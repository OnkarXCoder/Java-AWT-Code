import java.awt.*;
import java.awt.event.*;
public class TextEventDemo1 implements TextListener
{
	Label label1, label2;
	TextField field1;
	Frame f;
	String str;
	TextEventDemo1()
	{
		f = new Frame("TextEventDemo");
		label1 = new Label("Enter your name");
		label2 = new Label();
		field1 = new TextField(25);
		f.setLayout(new FlowLayout());
		f.add(label1);
		f.add(field1);
		f.add(label2);
		field1.addTextListener(this);
		f.setSize(340,200);
		f.setVisible(true);
	}
	public void textValueChanged(TextEvent te)
	{
		label2.setText(te.paramString());
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new TextEventDemo1();
	}
}