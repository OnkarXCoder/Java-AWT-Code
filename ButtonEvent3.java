import java.awt.event.*;
import java.awt.*;
public class ButtonEvent3 extends Frame implements ActionListener
{
   Frame f;
   Button b1,b2,b3,b4;
   TextField t1,t2,t3;
   ButtonEvent3()
   {
     
	 f=new Frame();
	 f.setLayout(null);
	 f.setSize(500,300);
	 f.setVisible(true);
	 t1=new TextField();
	 t2=new TextField();
	 t3=new TextField();
	 b1=new Button("ADD");
	 b2=new Button("SUB");
	 b3=new Button("MUL");
	 b4=new Button("Div");
	 f.add(b1);
	 f.add(b2);
	 f.add(b3);
	 f.add(b4);
	 f.add(t1);
	 f.add(t2);
	 f.add(t3);
	 t1.setBounds(180,80,80,20);
	 t2.setBounds(180,120,80,20);
	 t3.setBounds(180,160,80,20);
	 b1.setBounds(120,200,50,30);
	 b2.setBounds(200,200,50,30);
	 b3.setBounds(280,200,50,30);
	 b4.setBounds(340,200,50,30);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
	 double num1,num2,res;
	 if(e.getSource()== b1)
	 {
		 num1=Double.parseDouble(t1.getText());
		 num2=Double.parseDouble(t2.getText());
		 res=num1+num2;
		 t3.setText(""+res);
	 }
	 if(e.getSource()== b2)
	 {
		 num1=Double.parseDouble(t1.getText());
		 num2=Double.parseDouble(t2.getText());
		 res=num1-num2;
		 t3.setText(""+res);	 }
	 if(e.getSource()== b3)
	 {
	     num1=Double.parseDouble(t1.getText());
		 num2=Double.parseDouble(t2.getText());
		 res=num1*num2;
		 t3.setText(""+res);
	 }
	 if(e.getSource()== b4)
	 {
	     num1=Double.parseDouble(t1.getText());
		 num2=Double.parseDouble(t2.getText());
		 res=num1/num2;
		 t3.setText(""+res);
	 }
	}
	public static void main(String args[])
	{
	   new ButtonEvent3();
	}
}