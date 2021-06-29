package Generic;
import java.util.*;

public class QueueEx {
  
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
  
        
       
        pq.add("amal");
        pq.add("virat");
        pq.add("Kholi");
        
  
        System.out.println("Initial Queue " + pq);
  
        pq.poll();
  
        System.out.println("After Remove " + pq);
  
      
  
        System.out.println("Final Queue " + pq);
    }
}


