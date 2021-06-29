package appl;
import java.applet.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//<applet code="AppletExam"width=200 height=300>


public class apple extends Applet {
	public void paint(Graphics g){
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));  
	   g.drawString(dtf.format(now),50, 100);
	}	

}
