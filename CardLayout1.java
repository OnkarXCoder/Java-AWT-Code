import java.awt.*;
public class CardLayout1 extends Frame
{
  public CardLayout1
  {
   Frame f=new Frame();
   f.setTitle("CardLayout")
   f.setSize(300,200);
   f.setVisible(true);
   f.setLayout(new CardLayout());
   Button b1=new Button("First");
   Button b2=new Button("Second");
   Button b3=new Button("Third");
   f.add(b1,"card1");
   f.add(b2,"card2");
   f.add(b3,"card3");
  }
  public static void main(String args[])
  {
  CardLayout1 c=new CardLayout1();
  }
} 