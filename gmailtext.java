import java.awt.*;
public class gmailtext extends Frame
{
   public gmailtext()
   {
    setLayout(null);
    setSize(500,500);
    setVisible(true);
    setTitle("Aframe");
	Label l1=new Label("From");
    Label l2=new Label("To");
    Label l3=new Label("CC");
	Label l4=new Label("Bcc");
	Label l6=new Label("Composed Email");
    TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();

    TextArea t12=new TextArea("Subject");
    Button b1=new Button("submit");
    add(l1);	
	add(l2);	
    add(t1);	
    add(t2);	
    add(t3);
	add(t4);
	add(t5);
    add(t12);
    add(b1);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l6);
    l1.setBounds(100,50,40,40);
	l2.setBounds(100,100,40,40);
	l3.setBounds(100,150,40,40);
	l4.setBounds(100,200,40,40);
    l6.setBounds(100,350,150,40);
    t1.setBounds(250,50,180,30);
	t2.setBounds(250,100,180,30);
	t3.setBounds(250,150,180,30);
	t4.setBounds(250,200,180,30);
	t5.setBounds(250,350,180,30);
	t12.setBounds(250,280,200,60);
    b1.setBounds(250,400,80,20);
   }
	public static void main(String args[])
	{
		gmailtext g=new gmailtext();
	}
}