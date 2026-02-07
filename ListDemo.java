import java.awt.*;
public class ListDemo extends Frame
{
  ListDemo()
  {
    setVisible(true);
	setSize(600,500);
    setVisible(true);
	setLayout(null);
    setTitle("Aframe");
	List li=new List(2,true);
	li.add("Sunday");
	li.add("Monday");
	li.add("Tuesday");
	li.add("Wednesday");
	li.add("Thurday");
	li.add("Friday");
	li.add("Saturday");
    add(li);
    li.setBounds(100,100,100,60);
  }
  public static void main(String args[])
  {
   ListDemo l=new ListDemo();
  }
}