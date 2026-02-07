import java.awt.*;
public class MenuBar
{
	 public  MenuBar()
	 {
	 Frame f= new Frame("MenuDemo");
	 f.setLayout(null);
	 f.setSize(600,500);
	 f.setVisible(true);
	 MenuBar mb = new MenuBar();
	 Menu m1=new Menu("File");
	 Menu m2=new Menu("Edit");
	 Menu m3=new Menu("Search");
	 Menu m4=new Menu("Visit");
	 Menu m5=new Menu("Exit");
	 f.setMenuBar(mb);
	mb.add(m1);
	mb.add(m2);
	mb.add(m3);
	mb.add(m4);
	mb.add(m5);
	 }
	 public static void main(String args[])
	 {
	 MenuBar m=new MenuBar();
	 }
}