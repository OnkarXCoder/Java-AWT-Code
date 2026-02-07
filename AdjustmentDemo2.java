import java.awt.*;
import java.awt.event.*;
public class AdjustmentDemo2 extends Frame implements AdjustmentListener
{
	Frame f;
	Scrollbar sb1;
	Scrollbar sb2;
	Scrollbar sb3;
	TextField t1;
	TextField t2;
	TextField t3;
	AdjustmentDemo2()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(800,500);
		f.setVisible(true);
		sb1 = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sb3 = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		f.add(sb1);
		f.add(sb2);
		f.add(sb3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		sb1.setBounds(50,200,200,30);
		sb2.setBounds(50,300,200,30);
		sb3.setBounds(50,400,200,30);
		t1.setBounds(300,200,200,30);
		t2.setBounds(300,300,200,30);
		t3.setBounds(300,400,200,30);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r,b,g;
		r = sb1.getValue();
		b = sb2.getValue();
		g = sb3.getValue();
		t1.setText(""+r);
		t2.setText(""+b);
		t3.setText(""+g);
		f.setBackground(new Color(r,b,g));
	}
	public static void main(String args[])
	{
		AdjustmentDemo2 obj = new AdjustmentDemo2();
	}
}