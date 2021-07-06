package Day12;
import java.util.*;
public class Arraylis {
	
	
	
	public static void main(String args[]){
	
	     ArrayList<String> list = new ArrayList<String>();
	     list.add("amal");
	     list.add("virat");
	     list.add("hi");
	     list.add("aaaaa");
	            
	    
	     
	     Iterator<String> it = list.iterator();
	     while(it.hasNext()) {
	      if(it.next().length()%2==0){
	    	  it.remove();
	      }
	     }
	     System.out.println(list);
	    
	    }
	
	
}
