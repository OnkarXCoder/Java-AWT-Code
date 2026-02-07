import java.awt.*;
class Button1 extends Frame
{
public Button1()
{
setTitle("eFrame");
setLayout(null);
setSize(600,600);
setVisible(true);
setBackground(Color.PINK);
Button b1=new Button("1");
add(b1);
b1.setBounds(100,100,50,50);
b1.setBackground(Color.RED);
TextField t1=new TextField();
add(t1);
t1.setBounds(100,180,50,50);
t1.setBackground(Color.GREEN);
}




public static void main(String args[])
{
Button1 f=new Button1();
}
}