import java.awt.*;
import java.awt.event.*;
public class AdjustmentDemo1 extends Frame implements AdjustmentListener
{
	Frame f;
	Scrollbar sb,sb1,sb2;
	AdjustmentDemo1()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(500,800);
		f.setVisible(true);
		sb = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sb1= new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sb2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		f.add(sb);
		f.add(sb1);
		f.add(sb2);
		sb.setBounds(50,200,200,30);
		sb1.setBounds(50,300,200,30);
		sb2.setBounds(50,400,200,30);
		sb.addAdjustmentListener(this);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r,g,b;
		r=sb.getValue();
		b=sb1.getValue();
		g=sb2.getValue();
		f.setBackground(new Color(r,b,g));
	}
	public static void main(String args[])
	{
		AdjustmentDemo1 obj = new AdjustmentDemo1();
	}
}