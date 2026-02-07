import java.awt.event.*;
import java.awt.*;
public class ButtonEvent5 extends Frame implements ActionListener
{
   Frame f;
   Button b1;
   TextField t1,t2,t3,t4,t5,t6,t7;
   Label l1,l2,l3,l4,l5,l6;
   
   ButtonEvent5()
   {
     
	 f=new Frame();
	 f.setLayout(null);
	 f.setSize(500,500);
	 f.setVisible(true);
	 l1=new Label("Subject1");
	 l2=new Label("Subject2");
	 l3=new Label("Subject3");
	 l4=new Label("Subject4");
	 l5=new Label("Subject5");
	 l6=new Label("Subject6");  
	 t1=new TextField();
	 t2=new TextField();
	 t3=new TextField();
	 t4=new TextField();
	 t5=new TextField();
	 t6=new TextField();
	 t7=new TextField();
	 b1=new Button("Submit");
	 f.add(b1);
	 f.add(t1);
	 f.add(t2);
	 f.add(l1);
	 f.add(l2);
	 f.add(l3);
	 f.add(t3);
	 f.add(l4);
	 f.add(t4);
	 f.add(l5);
	 f.add(t5);
	 f.add(l6);
	 f.add(t6);
	 f.add(t7);
	 t1.setBounds(180,80,80,20);
	 l1.setBounds(100,80,80,20);
	 l2.setBounds(100,120,80,20);
	 t2.setBounds(180,120,80,20);
	 l3.setBounds(100,160,80,20);
	 t3.setBounds(180,160,80,20);
	 l4.setBounds(100,200,80,20);
	 t4.setBounds(180,200,80,20);
	 l5.setBounds(100,250,80,20);
	 t5.setBounds(180,250,80,20);
	 l6.setBounds(100,300,80,20);
	 t6.setBounds(180,300,80,20);
	 t7.setBounds(180,350,80,20);
	 b1.setBounds(120,400,50,30);
	 b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
	 double s1,s2,s3,s4,s5,s6,to,pe;
	 s1=Double.parseDouble(t1.getText());
	 s2=Double.parseDouble(t2.getText());
	 s3=Double.parseDouble(t3.getText());
	 s4=Double.parseDouble(t4.getText());
	 s5=Double.parseDouble(t5.getText());
	 s6=Double.parseDouble(t6.getText());
     to=s1+s2+s3+s4+s5+s6;
	 pe=to/6;
	 if(e.getSource()== b1)
	 {
		if(to>40)
		{
		t7.setText("Pass");
		t7.setForeground(Color.GREEN);
		}
		else
		{
		t7.setText("Fail");
		t7.setForeground(Color.RED);
		}
	 }
	 
	}
	public static void main(String args[])
	{
	   new ButtonEvent5();
	}
}