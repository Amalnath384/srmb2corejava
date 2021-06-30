package Day8;

import java.util.*;

public class Concate {
	 public static void main(String args[]) {
		  
	     
	      LinkedList<Integer> con = new LinkedList<Integer>();
	  
	     
	      con.add(10);
	      con.add(20);
	      con.add(30);
	      con.add(40);
	      con.add(50);
	      System.out.println(con);
	      
	      LinkedList<Integer> con1 = new LinkedList<Integer>();
		  
		     
	      con1.add(60);
	      con1.add(70);
	      con1.add(80);
	      con1.add(90);
	      con1.add(100);
	      
	      System.out.println(con1);
	  
	      LinkedList<Integer> newcon = new LinkedList<Integer>();
	      newcon.addAll(con);
	      newcon.addAll(con1);
	      
	      System.out.println(newcon);
	      
	      
	      
}
}
