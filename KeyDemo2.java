import java.awt.*;
import java.awt.event.*;
public class KeyDemo2 extends Frame implements KeyListener
{
	String msg = "";
	Frame f;
	TextField t1;
	KeyDemo2()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		t1 = new TextField();
		f.add(t1);
		t1.setBounds(100,100,200,30);
		f.addKeyListener(this);
		t1.setEchoChar('*');
	}
	public void keyReleased(KeyEvent k)
	{
		t1.setText(msg);
	}
	public void keyTyped(KeyEvent k)
	{
		msg+=k.getKeyChar();
	}
	public void keyPressed(KeyEvent k)
	{
		int key = k.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_F1:
			msg+="F1";
			break;
			case KeyEvent.VK_F2:
			msg+="F2";
			break;
			case KeyEvent.VK_F3:
			msg+="F3";
			break;
			case KeyEvent.VK_F4:
			msg+="F4";
			break;
			case KeyEvent.VK_RIGHT:
			msg+="RIGHT";
			break;
			case KeyEvent.VK_LEFT:
			msg+="LEFT";
			break;
			case KeyEvent.VK_UP:
			msg+="UP";
			break;
			case KeyEvent.VK_DOWN:
			msg+="DOWN";
			break;
		}
	}
	public static void main(String args[])
	{
		KeyDemo2 obj = new KeyDemo2();
	}
}