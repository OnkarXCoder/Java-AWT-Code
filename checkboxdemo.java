import java.awt.*;
public class checkboxdemo extends Frame
{
  checkboxdemo()
  {
    setLayout(null);
    setSize(500,500);
    setVisible(true);
    setTitle("Aframe");
	Checkbox c1 =new Checkbox("CO");
	Checkbox c2 =new Checkbox("ME");
	Checkbox c3 =new Checkbox("CE");
	Checkbox c4 =new Checkbox("DS");
	Checkbox c5 =new Checkbox("EJ");
	Checkbox c6 =new Checkbox("EE");
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	add(c5);
	add(c6);
	add(c1);

    c1.setBounds(100,50,30,40);
	c2.setBounds(100,100,30,40);
    c3.setBounds(100,150,30,40);
    c4.setBounds(100,200,30,40);
    c5.setBounds(100,250,30,40);
    c6.setBounds(100,300,30,40);

  }
  public static void main(String args[])
  {
  checkboxdemo ch=new checkboxdemo();
  }
}