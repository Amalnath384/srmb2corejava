package Day12;
import java.util.*;
public class Hashtabl {
	 public static void main(String[] args) {
		 
		    String str;
		 
		    
		    Hashtable<String, String> hashtable = new Hashtable<String, String>();
		 
		   
		    hashtable.put("A", "Amal");
		    hashtable.put("B", "virat");
		    hashtable.put("C", "sachin");
		    hashtable.put("D", "bala");
		    hashtable.put("E", "raj");
		 
		    System.out.println("Hashtable contains:");
		 
		   
		    Set<String> keys = hashtable.keySet();
		
		    Iterator<String> itr = keys.iterator();
		 
		    while (itr.hasNext()) { 
		      
		       str = itr.next();

		       System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
		    } 
		 }

}
