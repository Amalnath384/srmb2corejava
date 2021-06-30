package Day8;
import java.util.*;

public class Tree {
	
	 public static int sumOfArray(Integer[] a, int n)
	    {
	        if (n == 0)
	            return a[n];
	        else
	            return a[n] + sumOfArray(a, n - 1);
	    }

	public static void main(String[] args) {
		 TreeSet<Integer> ts = new TreeSet<>();
	        int sum=0,sum1=0;
	        // Elements are added using add() method
	        ts.add(10);
	        ts.add(20);
	        ts.add(30);
	        ts.add(40);
	        ts.add(50);
	        ts.add(60);
	        Integer a[] = new Integer[ts.size()];
		    ts.toArray(a);
	        for (Integer value:ts){
	            sum+=value;
	        }
	        System.out.println("Sum: "+sum);
	        
	                
	        Iterator<Integer> iterator = ts.iterator();
	       
	        while (iterator.hasNext())
	        sum1=sum1+iterator.next();
	            System.out.println(sum1);
	            	            
	        		 
		    int sum2 = sumOfArray(a, a.length - 1);
		    
		    System.out.println("Sum of elements  : " + sum2);
		    
	}
}
		        
		 
		       
		 
		        
		        
	                             
	        

