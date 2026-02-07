import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeDemo1
{
  JTree tree;
  JFrame f;
  JTreeDemo1()
  {
  f=new JFrame();
  f.setLayout(new BorderLayout());
  //Create top node of tree
  DefaultMutableTreeNode top=new DefaultMutableTreeNode("Options");
  DefaultMutableTreeNode a=new DefaultMutableTreeNode("Colors");
  top.add(a);
  DefaultMutableTreeNode b=new DefaultMutableTreeNode("Cities");
  top.add(b);
  //Create a Subtree of A
  DefaultMutableTreeNode a1=new DefaultMutableTreeNode("Black");
  a.add(a1);
  DefaultMutableTreeNode a2=new DefaultMutableTreeNode("White");
  a.add(a2);
   DefaultMutableTreeNode a3=new DefaultMutableTreeNode("Blue");
  a.add(a3);
   DefaultMutableTreeNode a4=new DefaultMutableTreeNode("Black");
  a.add(a4);
  DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Solapur");
  b.add(b1);
  DefaultMutableTreeNode b2=new DefaultMutableTreeNode("Pune");
  b.add(b2);
  DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Mumbai");
  b.add(b3);
  DefaultMutableTreeNode b4=new DefaultMutableTreeNode("Kholapur");
  b.add(b4);
  DefaultMutableTreeNode b5=new DefaultMutableTreeNode("Ahmadnagar");
  b.add(b5);
  tree=new JTree(top);
  JScrollPane jsp=new JScrollPane(tree);
  f.add(jsp,BorderLayout.CENTER);
  f.setSize(500,500);
  f.setVisible(true);
  }
  public static void main(String a[])
  {
  JTreeDemo1 t=new JTreeDemo1();
  }
}