import java.awt.*;
public class mylabel2
{
public static void main(String args[])
{
Frame f=new Frame();
f.setLayout(null);
f.setSize(600,500);
f.setVisible(true);
Label l1 =new Label("Principal");
Label l2 =new Label("1000");
Label l3 =new Label("Rate");
Label l4 =new Label("5.5");
Label l5 =new Label("Year");
Label l6 =new Label("2");
Label l7 =new Label("Calculate");
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(l6);
f.add(l7);
l1.setBounds(100,100,50,50);
l2.setBounds(200,100,50,50);
l3.setBounds(100,150,50,50);
l4.setBounds(200,150,50,50);
l5.setBounds(100,200,50,50);
l6.setBounds(200,200,50,50);
l7.setBounds(100,250,60,60);
}
}