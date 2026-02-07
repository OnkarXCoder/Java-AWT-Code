import java.awt.*;
import java.awt.event.*;
public class keyDemo implements KeyListener
{
	String msg="";
    Frame f;
	TextField t1;
	keyDemo()
	{
		f=new Frame();
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		t1=new TextField();
		f.add(t1);
		t1.setBounds(100,100,200,30);
		f.addKeyListener(this);
		
	}
	public void keyReleased(KeyEvent k)
	{
		t1.setText("hf");
	}
	public void keyTyped(KeyEvent k)
	{
		
		t1.setText("hg");
	}
	public void keyPressed(KeyEvent k)
	{
	int key=k.getKeyCode();
		switch(key)
		{
		 case KeyEvent.VK_F1:
		 msg+="F1";
		 break;
		
		}
	}
	public static void main(String args[])
	{
	 keyDemo k=new keyDemo();
	}
}