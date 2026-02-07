import java.awt.*;
public class textbox2
{
public static void main(String args[])
{
Frame f=new Frame();
f.setLayout(null);
f.setSize(1200,1200);
f.setVisible(true);
Label l1 =new Label("No1");
Label l2 =new Label("No2");
Label l3 =new Label("Res");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
l1.setBounds(100,100,50,50);
t1.setBounds(200,110,125,20);
l2.setBounds(100,150,50,50);
t2.setBounds(200,160,125,20);
l3.setBounds(100,200,50,50);
t3.setBounds(200,210,125,20);
}
}