import java.awt.*;
import java.awt.event.*;
public class AdjustmentDemo extends Frame implements AdjustmentListener
{
	Frame f;
	TextField t1;
	Scrollbar sb;
	AdjustmentDemo()
	{
		f = new Frame();
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		t1 = new TextField();
		sb = new Scrollbar(Scrollbar.VERTICAL,0,1,0,10);
		f.add(sb);
		f.add(t1);
		sb.setBounds(100,100,30,200);
		t1.setBounds(200,100,200,30);
		sb.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		t1.setText(""+ae.getValue());
	}
	public static void main(String args[])
	{
		AdjustmentDemo obj = new AdjustmentDemo();
	}
}