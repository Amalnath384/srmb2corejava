package work;

public class ThreadJoinIsaliv extends Thread {
    public void run()
    {
        System.out.println("virat ");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("kohli");
    }
    public static void main(String[] args) throws InterruptedException
    {
    	ThreadJoinIsaliv c1 = new ThreadJoinIsaliv ();
    	ThreadJoinIsaliv  c2 = new ThreadJoinIsaliv ();
    	 
    	
    	c1.start();
    	 if(c1.isAlive()) {
          	System.out.println("Thread 1 is running");
          }
       
        c1.join();
           
       c2.start();
       if(c2.isAlive()) {
       	System.out.println("Thread 2 is running");
       }
             c2.join();
        
        System.out.println("Winner");
       
        }
       
    }

