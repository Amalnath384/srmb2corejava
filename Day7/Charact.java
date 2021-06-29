package input;

import java.io.*;


public class Charact {

	public static void main(String[] args) {
		try
        {
            FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\case.txt");
            BufferedReader br = new BufferedReader(fr);

    
    int words=1;
    int vowels = 0;
    String s="";
    
    
   
    while((s = br.readLine()) != null){
    	 
    	char ar[]=s.toCharArray();
    for (int i=0 ; i<ar.length; i++){
        
        if(ar[i] == 'a'|| ar[i] == 'e'|| ar[i] == 'i' ||ar[i] == 'o' ||ar[i] == 'u'||
        		ar[i] == 'A'|| ar[i] == 'E'|| ar[i] == 'I' ||ar[i] == 'O' ||ar[i] == 'U'){
           vowels ++;
        }
           else if(ar[i]==' ') {
        	   words++;	     
        }
    }
    
    System.out.println("Number of Characters: "+ar.length);
    System.out.println("Number of Vowels: "+vowels);
    System.out.println("Number of words: "+words);
    } 
   
    br.close();
    }catch(Exception e)
    {
        e.printStackTrace();
    }
 

	}

}
