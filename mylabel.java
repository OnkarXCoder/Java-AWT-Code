import java.awt.*;
public class mylabel
{
public static void main(String args[])
{
Frame f=new Frame();
f.setLayout(null);
f.setSize(600,500);
f.setVisible(true);
Label l1 =new Label("Java");
Label l2 =new Label("C++");
Label l3 =new Label("C");
f.add(l1);
f.add(l2);
f.add(l3);
l1.setBounds(100,100,50,50);
l2.setBounds(150,100,50,50);
l3.setBounds(200,100,50,50);
}
}