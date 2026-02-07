import java.awt.*;
class textarea extends Frame
{
public textarea()
{
setTitle("eFrame");
setLayout(null);
setSize(600,600);
setVisible(true);
setBackground(Color.PINK);
TextField t1=new TextField();
add(t1);
t1.setBounds(100,180,400,30);
t1.setForeground(Color.GREEN);
TextArea t2=new TextArea(10,100);
add(t2);
t2.setBounds(200,300,200,200);
t2.setForeground(Color.RED);
}
public static void main(String args[])
{
textarea f=new textarea();
}
}