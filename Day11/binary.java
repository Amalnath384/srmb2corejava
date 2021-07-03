package Day11;
import java.util.*;
public class binary {
	  
	
	    public static void main(String args[]){  
	        int arr[] = {10,40,30,1,0};  
	        int key = 30; 
//	       Arrays.sort(arr);  
//	       System.out.println("Soretd array:"+Arrays.toString(arr));
	        int result = Arrays.binarySearch(arr,key);  
	        if (result < 0)  
	            System.out.println("Element is not found!");  
	        else  
	            System.out.println("Element is found at index: "+result);  
	    }  
	} 

