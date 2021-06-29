package Generic;
import java.util.*;
public class StackExample<T> {
	 T t;
	   
	    public void push(T t){
	   	 this.t=t;
	    }
	    public T get(){
			return t;
	    }
		

		public static void main(String[] args) {
			
			
			StackExample<Integer> ref=new StackExample<Integer>();
			ref.push(10);
			ref.push(20);
			int ival=ref.get();
			System.out.println(ival);
			
			
		
		}

	
}
