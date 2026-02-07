import java.awt.*;
import java.awt.event.*;
public class AdjustmentDemo3 extends Frame implements AdjustmentListener
{
	Frame f;
	Scrollbar sb,sb1,sb2;
	Label l1;
	AdjustmentDemo3()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(500,800);
		f.setVisible(true);
		sb = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sb1= new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		sb2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		l1=new Label("Label");
		f.add(sb);
		f.add(sb1);
		f.add(sb2);
		f.add(l1);
		sb.setBounds(50,200,200,30);
		sb1.setBounds(50,300,200,30);
		sb2.setBounds(50,400,200,30);
		l1.setBounds(50,100,500,30);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,40));
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
		l1.setBackground(new Color(r,b,g));
	}
	public static void main(String args[])
	{
		AdjustmentDemo3 obj = new AdjustmentDemo3();
	}
}