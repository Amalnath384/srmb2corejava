package Day11;

import java.util.Hashtable;

public class hash {
	public static void main(String args[]) {  
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
		     map.put(100,"Amal");    
		     map.put(102,"Ravi");   
		     map.put(101,"Vijay");    
		     map.put(103,"Rahul");   
		     
		     System.out.println("Before remove: "+ map);      
		       map.remove(102);  
		       System.out.println("After remove: "+ map);  
		       
		       map.putIfAbsent(104,"virat");  
		       System.out.println("Updated Map: "+map);  
		      
		       map.putIfAbsent(101,"Vijay");  
		       System.out.println("Updated Map: "+map);  
		   }      
}
