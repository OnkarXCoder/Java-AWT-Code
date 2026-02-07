import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeDemo
{
  JTree tree;
  JFrame f;
  JTreeDemo()
  {
  f=new JFrame();
  f.setLayout(new BorderLayout());
  //Create top node of tree
  DefaultMutableTreeNode top=new DefaultMutableTreeNode("Options");
  DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
  top.add(a);
  DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
  top.add(b);
  //Create a Subtree of A
  DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
  a.add(a1);
  DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
  a.add(a2);
  DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
  b.add(b1);
  DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
  b.add(b2);
  DefaultMutableTreeNode b3=new DefaultMutableTreeNode("B3");
  b.add(b3);
  tree=new JTree(top);
  JScrollPane jsp=new JScrollPane(tree);
  f.add(jsp,BorderLayout.CENTER);
  f.setSize(500,500);
  f.setVisible(true);
  }
  public static void main(String a[])
  {
  JTreeDemo t=new JTreeDemo();
  }
}