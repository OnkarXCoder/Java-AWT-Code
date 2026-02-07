import javax.swing.*;
public class ProgressBarDemo extends JFrame
{
   JProgressBar jb;
   int i=0,num=0;
   ProgressBarDemo()
   {
       jb=new JProgressBar(JProgressBar.VERTICAL,0,2000);
	   jb.setBounds(40,40,30,160);
	   jb.setValue(0);
	   jb.setStringPainted(true);
	   add(jb);
	   setSize(260,150);
	   setLayout(null);
   }
    public void iterate()
	{
	while(i<=2000)
	{
	jb.setValue(i);
	i=i+20;
			try
			{
			Thread.sleep(160);
			}
			catch(Exception e)
			{
			
			}
	
	}
	
	}
	public static void main(String ar[])
	{
	 ProgressBarDemo p=new ProgressBarDemo();
	 p.setVisible(true);
	 p.iterate();
	}
	
}