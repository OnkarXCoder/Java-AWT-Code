import java.awt.*;
public class checkboxgroup extends Frame
{
  checkboxgroup()
  {
    setLayout(null);
    setSize(500,500);
    setVisible(true);
    setTitle("Aframe");
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox c1 =new Checkbox("Male",false,cbg);
	Checkbox c2 =new Checkbox("Female",false,cbg);
	add(c1);
	add(c2);
    c1.setBounds(100,50,50,40);
	c2.setBounds(100,100,50,40);
    
}
  public static void main(String args[])
  {
  checkboxgroup ch=new checkboxgroup();
  }
}