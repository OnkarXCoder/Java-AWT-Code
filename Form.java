import javax.swing.*;
import java.awt.*;
public class Form extends JFrame
{
  Form()
  {
  setLayout(null);
  setSize(400,400);
  setVisible(true);
	  JLabel l1=new JLabel("Name");
	  JLabel l2=new JLabel("Address");
	  JLabel l3=new JLabel("Gendor");
	  JLabel l4=new JLabel("State");
	  JLabel l5=new JLabel("Language");
	  JTextField t1=new JTextField();
	  JTextArea t2=new JTextArea();
	  ButtonGroup bg=new ButtonGroup(); 
	  JRadioButton r1=new JRadioButton("Male",false);
	  JRadioButton r2=new JRadioButton("Female");
	  JCheckBox s1=new JCheckBox("C");
	  JCheckBox s2=new JCheckBox("C++");
	  JCheckBox s3=new JCheckBox("Java");
	  String str[] ={"Mahrashtra","UttarPradesh","AndraPradesh","Himalya","Kashmir"};
	  JComboBox c1=new JComboBox(str);
	  JButton b1=new JButton("Submit");
      add(l1);
	  add(l2);
	  add(l3);
	  add(l4);
	  add(l5);
	  add(t1);
	  add(t2);
	  add(r1);
	  add(r2);
	  add(c1);
	  add(s1);
	  add(s2);
	  add(s3);
	  add(b1);
	  bg.add(r1);
	  bg.add(r2);
	  l1.setBounds(10,10,50,50);
	  l2.setBounds(10,60,50,50);
	  l3.setBounds(10,110,50,50);
	  l4.setBounds(10,150,50,50);
	  l5.setBounds(10,200,80,50);
	  t1.setBounds(100,30,100,20); 
      t2.setBounds(100,70,100,40);
	  r1.setBounds(100,120,80,20);
	  r2.setBounds(200,120,80,20);
      c1.setBounds(100,166,100,20);
	  s1.setBounds(100,220,50,20);
	  s2.setBounds(150,220,50,20);
	  s3.setBounds(200,220,80,20);
      b1.setBounds(100,260,80,20);
  }
 public static void main(String args[])
 {
 Form f=new Form();
 }
}