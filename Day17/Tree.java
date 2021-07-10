package Day17;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;


public class Tree extends JFrame
{
    private JTree tree;
    public Tree()
    {
        
        DefaultMutableTreeNode sports = new DefaultMutableTreeNode("Sports");
       
        DefaultMutableTreeNode cricket = new DefaultMutableTreeNode("Cricket");
        DefaultMutableTreeNode football = new DefaultMutableTreeNode("Football");
        DefaultMutableTreeNode batsman = new DefaultMutableTreeNode("Batsman");
        DefaultMutableTreeNode bowler = new DefaultMutableTreeNode("Bowler");
        DefaultMutableTreeNode Attack = new DefaultMutableTreeNode("Attack");
        DefaultMutableTreeNode Defend = new DefaultMutableTreeNode("Defender");
        DefaultMutableTreeNode Midfield = new DefaultMutableTreeNode("Midfielder");
        DefaultMutableTreeNode Goalkeeper = new DefaultMutableTreeNode("GoalKeeper");
       
        sports.add(cricket);
        cricket.add(batsman);
        cricket.add(bowler);
        sports.add(football);
        football.add(Attack);
        football.add(Defend);
        football.add(Midfield);
        football.add(Goalkeeper);
         
        
        tree = new JTree(sports);
        add(tree);
         
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tree");       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tree();
            }
        });
    }       
}