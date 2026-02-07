import javax.swing.*;
class Toolstip extends JFrame
{
 Toolstip()
 {
	 JFrame f=new JFrame();
 JPasswordField val=new JPasswordField();
 val.setBounds(100,100,100,30);
 val.setToolTipText("Enter your Password");
 JLabel l1=new JLabel("Password");
 l1.setBounds(20,100,80,30);
 f.add(val);
 f.add(l1);
 f.setLayout(null);
 f.setSize(300,300);
 f.setVisible(true);
 }
 public static void main(String a[])
 {
	 Toolstip g=new Toolstip();
 }
}