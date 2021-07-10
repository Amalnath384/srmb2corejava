package Day17;

import javax.swing.*; 

public class Table {    
    JFrame f;    
    Table(){    
    f=new JFrame();    
    String data[][]={ {"Amal","Dev","chennai"},    
                       {"Arun","test","banglore"},    
                        {"Bala","marketing","Chennai"}};    
    String column[]={"Name","Des","Location"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new Table();    
}    
}
