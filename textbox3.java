import java.awt.*;
public class textbox3
{
public static void main(String args[])
{
Frame f=new Frame();
f.setLayout(null);
f.setSize(1200,1200);
f.setVisible(true);
Label l1 =new Label("UserName");
Label l2 =new Label("Password");
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("Login");
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b1);
f.add(b1);
l1.setBounds(100,100,70,50);
t1.setBounds(200,110,125,20);
l2.setBounds(100,150,70,50);
t2.setBounds(200,160,125,20);
b1.setBounds(100,200,50,40);
}
}