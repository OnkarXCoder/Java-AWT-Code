import java.awt.*;
public class formdemo1 extends Frame
{
  formdemo1()
  {
  setLayout(null);
  setSize(600,600);
  setVisible(true);
  setTitle("Registration form");
  Label l1=new Label("Name");
  Label l2=new Label("Age");
  Label l3=new Label("Email");
  Label l4=new Label("Gendor");
  Label l5=new Label("State");
  Label l6=new Label("Address");
  Label l7=new Label("Contact");
  Label l8=new Label("Subject");
  TextField t1=new TextField(); 
  TextField t2=new TextField(); 
  TextField t3=new TextField(); 
  TextField t4=new TextField(); 
  Button b1=new Button("Submit");
  Checkbox sub1=new Checkbox("Maths");
  Checkbox sub2=new Checkbox("English");
  Checkbox sub3=new Checkbox("Marathi");
  Checkbox sub4=new Checkbox("Hindi");
 
  CheckboxGroup cbg=new CheckboxGroup();
  Checkbox c1 =new Checkbox("Male",false,cbg);
  Checkbox c2 =new Checkbox("Female",false,cbg);
  Choice c=new Choice();
  c.add("Delhi");
  c.add("Mahrashtra");
  c.add("Uttarpradesh");
  c.add("Tamilnadu");
  c.add("Telengana");
  c.add("Andra-Pradesh");
  TextArea t12=new TextArea();
   add(l1); 
   add(l2);  
   add(l3);  
   add(l4);  
   add(l5);  
   add(l6);  
   add(l7);  
   add(t1);  
   add(t2);  
   add(t3);  
   add(t4);  
   add(c1);  
   add(c2);  
   add(c);  
   add(t12);
   add(b1); 
   add(l8);
   add(sub1);
   add(sub2);
   add(sub3);
   add(sub4);

   l1.setBounds(30,80,50,50);
   l2.setBounds(30,150,50,50);
   l3.setBounds(30,200,50,50);
   l4.setBounds(30,250,50,50);
   l5.setBounds(30,300,50,50);
   l6.setBounds(30,350,50,50);
   l7.setBounds(30,440,50,50);
   t1.setBounds(100,95,160,20);
   t2.setBounds(100,165,160,20);
   t3.setBounds(100,215,160,20);
   t4.setBounds(100,450,160,20);
   c1.setBounds(100,250,50,50);
   c2.setBounds(160,250,50,50);
   c.setBounds(100,315,160,20);
   t12.setBounds(100,365,160,60);
   l8.setBounds(30,115,50,50);
  }
  public static void main(String args[])
  {
	  formdemo1 f=new formdemo1();
  }
}