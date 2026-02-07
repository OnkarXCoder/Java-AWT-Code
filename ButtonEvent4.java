import java.awt.event.*;
import java.awt.*;
public class ButtonEvent4 extends Frame implements ActionListener
{
   Frame f;
   Label l1,l2;
   Button b1;
   TextField t1,t2,t3;
   ButtonEvent4()
   {
     
	 f=new Frame();
	 f.setLayout(null);
	 f.setSize(500,300);
	 f.setVisible(true);
	 l1=new Label("Enter no");
	 t1=new TextField();
	 t2=new TextField();
	 b1=new Button("Submit");
	 f.add(b1);
	 f.add(t1);
	 f.add(t2);
	 f.add(l1);
	 t1.setBounds(180,80,80,20);
	 l1.setBounds(100,80,80,20);
	 t2.setBounds(180,140,80,20);
	 b1.setBounds(120,200,50,30);
	 b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
	 double num1;
	 num1=Double.parseDouble(t1.getText());
	 if(e.getSource()== b1)
	 {
		if(num1>0)
		{
		t2.setText("Positive");
		t2.setForeground(Color.GREEN);
		}
		else
		{
		t2.setText("Negative");
		t2.setForeground(Color.RED);
		}
	 }
	 
	}
	public static void main(String args[])
	{
	   new ButtonEvent4();
	}
}