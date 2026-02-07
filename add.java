import java.awt.*;
public class add
{
public static void main(String args[])
{
Frame f=new Frame();
f.setSize(600,600);
f.setLayout(null);
f.setVisible(true);
Label l1=new Label("No1");
Label l2=new Label("No2");
Label l3=new Label("Res");
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
l2.setBounds(100,150,50,50);
l3.setBounds(100,200,50,50);
t1.setBounds(152,100,100,30);
t2.setBounds(152,150,100,30);
t3.setBounds(152,200,100,30);
Button b1=new Button("Add");
Button b2=new Button("Sub");
Button b3=new Button("Mul");
Button b4=new Button("Div");
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);

b1.setBounds(150,300,50,30);
b2.setBounds(210,300,50,30);
b3.setBounds(280,300,50,30);
b4.setBounds(360,300,50,30);

}
}