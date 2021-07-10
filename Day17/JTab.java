package Day17;

import javax.swing.*;  
public class JTab {  
JFrame f;  
JTab(){  
    f=new JFrame();  
    JTextArea ta=new JTextArea(200,200);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
    JPanel p2=new JPanel();  
      
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("Home",p1);  
    tp.add("profile",p2);  
     
    f.add(tp);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new JTab();  
}}  