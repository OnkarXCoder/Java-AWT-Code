import java.awt.*;
import java.awt.MenuBar;
public class Menu4
{
	 public  Menu4()
	 {
	 Frame f= new Frame("MenuDemo");
	 f.setLayout(null);
	 f.setSize(600,500);
	 f.setVisible(true);
	 MenuBar mb = new MenuBar();
	 	 f.setMenuBar(mb);
	 Menu m1=new Menu("Weeks");
	 Menu m2=new Menu("Days");
	 MenuItem i1=new MenuItem("January");
	 MenuItem i2=new MenuItem("February");
	 MenuItem i3=new MenuItem("March");
	 MenuItem i4=new MenuItem("April");
	 MenuItem i5=new MenuItem("May");
	 MenuItem i6=new MenuItem("June");
	 MenuItem i7=new MenuItem("July");
	 MenuItem i8=new MenuItem("Augest");
	 MenuItem i9=new MenuItem("September");
	 MenuItem i10=new MenuItem("October");
	 MenuItem i11=new MenuItem("November");
	 MenuItem i12=new MenuItem("December");
	 MenuItem i13=new MenuItem("Sunday");
	 MenuItem i14=new MenuItem("Monday");
	 MenuItem i15=new MenuItem("Tuesday");
	 MenuItem i16=new MenuItem("Wednesday");
	 MenuItem i17=new MenuItem("Thursday");
	 MenuItem i18=new MenuItem("Friday");
	 MenuItem i19=new MenuItem("Saturday");
	mb.add(m1);
	mb.add(m2);
	m1.add(i1);
	m1.add(i2);
	m1.add(i3);
	m1.add(i4);
	m1.add(i5);
	m1.add(i6);
	m1.add(i7);
	m1.add(i8);
	m1.add(i9);
	m1.add(i10);
	m1.add(i11);
	m1.add(i12);
	m2.add(i13);
	m2.add(i14);
	m2.add(i15);
	m2.add(i16);
	m2.add(i17);
	m2.add(i18);
	m2.add(i19);

	 }
	 public static void main(String args[])
	 {
	 Menu4 m=new Menu4();
	 }
}