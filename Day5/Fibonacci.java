package work;


class  Fibo extends Thread {
	
	   private String threadName;
	   
	   Fibo( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
		   int n1=0,n2=1,n3,i,count=10;    
  		 System.out.print(n1+" "+n2);//printing 0 and 1    
	      try {
	    	  
	    		 
	    		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	    		 {    
	    		  n3=n1+n2;    
	    		  System.out.print(" "+n3); 
	    		  Thread.sleep(1000);
	    		  n1=n2;    
	    		  n2=n3;    
	    		 }    
	            
	         }
	      catch (InterruptedException e) {
	         
	      }

	   }
}	  

	public class Fibonacci {

	   public static void main(String args[]) {
		   Fibo  R1 = new Fibo("thread1" );
	     R1.start();
	     Fibo  R2 = new Fibo("thread2" );
	     R2.start();
	   
	      
	   } 
}