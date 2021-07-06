package Day12;
import java.io.FileWriter;
import java.util.*;
public class Property {
 
	public static void main(String[] args)throws Exception{  
	  
	Properties p=new Properties();  
	
	p.put("1", "amal");
	p.put("2", "ajay");
//	p.put(3, "bala");
//	p.put(4, "vicky");
	
	Set s=p.keySet();
	for(Object n:s){
		System.out.println("key: "+n+"value :"+p.getProperty((String)n));
	}
	
	  
	}

}  