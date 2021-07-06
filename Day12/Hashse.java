package Day12;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import input.Read;

class det{
	private String name;
	private int age;
	det(String name,int age){
		
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return("Name: "+name+" "+"Age: "+age);
	}
}

public class Hashse {
	
		public static void main(String [] args)
		{
			Hashtable<Integer,det> ref = new Hashtable<Integer,det>();
			
		    ref.put(1,new det("amal",10));
		    ref.put(2,new det("arun",15));
		    ref.put(3,new det("ajay",20));
		    
		    Set<Integer> keys = ref.keySet();
			Iterator a = keys.iterator();
			
		
				System.out.println(ref);
			
			
			
			
		}
	}
