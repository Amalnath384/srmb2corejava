package Day15;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
public class Window extends Frame{  
    Window(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
public static void main(String[] args) {  
    new Window();  
} 
}

