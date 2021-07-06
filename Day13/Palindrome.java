package Day13;

import java.util.*;   

public class Palindrome {
	  
	 public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
		    
		        System.out.print("Enter string : ");
		   
		        String str = sc.nextLine();
		        StringBuffer st = new StringBuffer(str);
		   
		        st.reverse();
		   
		        if(str.equals(st.toString())){
		            System.out.println("String is palindrome");
		        } else {
		            System.out.println("String is not palindrome");
		        }
		        }
		   }


