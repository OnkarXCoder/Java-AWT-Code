import java.awt.*;
import java.awt.MenuBar;
public class Menu3
{
	 Menu3()
	 {
	 Frame f= new Frame("MenuDemo");
	 f.setLayout(null);
	 f.setSize(600,500);
	 f.setVisible(true);
	 MenuBar mb= new MenuBar();
	 f.setMenuBar(mb);
	 Menu m1=new Menu("Cities");
	 Menu m2=new Menu("States");
	 MenuItem m3=new MenuItem("Solapur");
	 MenuItem m4=new MenuItem("Pune");
	 MenuItem m5=new MenuItem("Andrapradesh");
     MenuItem m6=new MenuItem("Tamilnadu");
	 MenuItem m7=new MenuItem("Kashmir");
	 MenuItem m8=new MenuItem("kholapur");
	 MenuItem m9=new MenuItem("Nagpur");
	mb.add(m1);
	mb.add(m2);
	m1.add(m3);
	m1.add(m4);
	m1.add(m8);
	m1.add(m9);
	m2.add(m5);
	m2.add(m6);
	m2.add(m7);
	
	 }
	 public static void main(String args[])
	 {
	 Menu3 m=new Menu3();
	 }
}