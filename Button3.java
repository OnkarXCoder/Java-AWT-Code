import java.awt.*;
public class Button3
{
public static void main(String args[])
{
Frame f=new Frame();
f.setSize(600,600);
f.setLayout(null);
f.setVisible(true);
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("4");
Button b5=new Button("5");
Button b6=new Button("6");
Button b7=new Button("7");
Button b8=new Button("8");
Button b9=new Button("9");
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
b1.setBounds(100,100,50,50);
b2.setBounds(151,100,50,50);
b3.setBounds(201,100,50,50);
b4.setBounds(100,150,50,50);
b5.setBounds(151,150,50,50);
b6.setBounds(201,150,50,50);
b7.setBounds(100,200,50,50);
b8.setBounds(151,200,50,50);
b9.setBounds(201,200,50,50);


}
}