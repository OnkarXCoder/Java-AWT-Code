import java.awt.*;
public class textbox
{
public static void main(String args[])
{
Frame f=new Frame();
f.setLayout(null);
f.setSize(1200,1200);
f.setVisible(true);
Label l1 =new Label("Amount");
Label l2 =new Label("Year");
Label l3 =new Label("Rate");
Label l4 =new Label("sinterest");
Label l5 =new Label("cinterest");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
TextField t5=new TextField();

f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(t4);
f.add(t5);
l1.setBounds(100,100,50,50);
t1.setBounds(200,110,125,20);
l2.setBounds(100,150,50,50);
t2.setBounds(200,160,125,20);
l3.setBounds(100,200,50,50);
t3.setBounds(200,210,125,20);
l4.setBounds(100,250,50,50);
t4.setBounds(200,260,125,20);
l5.setBounds(100,300,50,50);
t5.setBounds(200,310,125,20);

}
}