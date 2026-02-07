import java.awt.*;
public class Dialogbox1 extends Dialog
{
	 public Dialogbox1(Frame parent,String title)
	 {
	 super(parent,title,false);
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