import java.awt.*;
public class Dialogbox1 extends Dialog
{
	 Dialogbox1(Frame Parent,String title)
	 {
	 super(parent,title,true);
	 setLayout(new FlowLayout());
	 setSize(300,200);
	 setBackground(Color.YELLOW);
	 Button b=new Button("Cancel");
	 add(b);
	 }
	  public static void main(String args[])
	 {
	 Frame f=new Frame();
	 Dialogbox1 m=new Dialogbox1(f,"Hello");
	 m.setVisible(true);
	 }
}