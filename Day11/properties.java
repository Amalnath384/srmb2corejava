package Day11;
import java.util.*;  
import java.io.*;  
public class properties {

	 
	public static void main(String[] args) throws IOException{  
	  
		Properties p=new Properties();  
		p.put("amal","test");  
		p.put("aeun","dev");  
		try{
			FileOutputStream o=new FileOutputStream("p.dat");
			p.store(o,"Student Details");
		}catch(FileNotFoundException e){}
		  
		System.out.println("stored");  
		  
		}  
		}  
