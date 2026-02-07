import java.awt.*;
public class choicedemo extends Frame
{
	choicedemo()
	{
	setVisible(true);
	setSize(500,500);
    setVisible(true);
    setTitle("Aframe");
	Choice c=new Choice();
	c.add("CO");
	c.add("CM");
	c.add("ME");
	c.add("CE");
	c.add("EJ");
	add(c);
	c.setBounds(100,100,50,60);
	}
	public static void main(String args[])
	{
	choicedemo c=new choicedemo();
	}
}