package Day17;

import javax.swing.*;    
public class Jcombo {    
JFrame f;    
Jcombo(){    
    f=new JFrame("Details");    
    String city[]={"chennai","Banglore","Mumbai"};        
    JComboBox cb=new JComboBox(city);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);         
}    
public static void main(String[] args) {    
    new Jcombo();         
}    
}   
