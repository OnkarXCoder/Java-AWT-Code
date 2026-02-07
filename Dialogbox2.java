import java.awt.*;
public class Dialogbox2 extends Dialog
{
	 public Dialogbox2(Frame parent,String title)
	 {
	 super(parent,title,false);
	 setLayout(new FlowLayout());
	 setSize(400,200);
	 Label l1=new Label("Username");
	 Label l2=new Label("Password");
	 TextField t1=new TextField();
	 TextField t2=new TextField();
     Button b1=new Button("Submit");
	 add(l1);
	 add(l2);
	 add(t1);
	 add(t2);
	 add(b1);
	 l1.setBounds(50,50,70,30);
	 l2.setBounds(50,90,70,30);
	 t1.setBounds(100,50,200,30);
	 t2.setBounds(100,90,200,30);
	 b1.setBounds(120,130,150,90);
	 }
	  public static void main(String args[])
	 {
	 Frame f=new Frame();
	 Dialogbox2 m=new Dialogbox2(f,"Hello");
	 m.setVisible(true);
	 }
}