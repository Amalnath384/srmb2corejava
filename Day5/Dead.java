package work;

public class Dead {  
	  public static void main(String[] args) {  
	    final String str1 = "amal";  
	    final String str2 = "virat";  
	    // t1 tries to lock resource1 then resource2  
	    Thread t1 = new Thread() {  
	      public void run() {  
	          synchronized (str1) {  
	           System.out.println("Thread 1: locked resource 1 "+str1);  
	          }
	           try { Thread.sleep(100);} catch (Exception e) {}  
	          
	           synchronized (str2) {  
	            System.out.println("Thread 1: locked resource 2   "+str2);  
	           }  
	         }  
	       
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() {  
	      public void run() {  
	        synchronized (str2) {  
	          System.out.println("Thread 2: locked resource 2  "+str2);  
	        }
	          try { Thread.sleep(100);} catch (Exception e) {}  
	  
	          synchronized (str1) {  
	            System.out.println("Thread 2: locked resource 1  "+str1);  
	          }  
	        }  
	    };
	  }
	    }
	    