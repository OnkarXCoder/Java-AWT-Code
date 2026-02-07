import java.awt.*;
import java.awt.MenuBar;
public class Menu1
{
	 public  Menu1()
	 {
	 Frame f= new Frame("MenuDemo");
	 f.setLayout(null);
	 f.setSize(600,500);
	 f.setVisible(true);
	 MenuBar mb = new MenuBar();
	 	 f.setMenuBar(mb);
	 Menu m1=new Menu("File");
	 Menu m2=new Menu("Edit");
	 Menu m3=new Menu("Search");
	 Menu m4=new Menu("Visit");
	 Menu m5=new Menu("Exit");
	mb.add(m1);
	mb.add(m2);
	mb.add(m3);
	mb.add(m4);
	mb.add(m5);
	 }
	 public static void main(String args[])
	 {
	 Menu1 m=new Menu1();
	 }
}