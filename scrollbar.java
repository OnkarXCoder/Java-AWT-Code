import java.awt.*;
public class scrollbar extends Frame
{
  scrollbar()
  {
   setLayout(null);
   setVisible(true);
   setTitle("Scroll Bar");
   setSize(600,600);
   Scrollbar s=new Scrollbar();
   Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL);
   Scrollbar s2=new Scrollbar(Scrollbar.VERTICAL,0,5,0,100);

   add(s);
   add(s1);
   add(s2);
   s.setBounds(300,100,20,300);
   s1.setBounds(100,50,300,20);
   s2.setBounds(100,50,20,300);
  }
  public static void main(String args[])
  {
	 scrollbar s=new scrollbar();	 
  }
}