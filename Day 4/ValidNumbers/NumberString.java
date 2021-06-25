package work;


public class NumberString {

	public static void main(String args[] ) {
	
	
		
	int  count=0;
	for(int i=0;i<args.length;i++) {
		System.out.println("arguments="+args[i]);		
		if(args[i].matches("[0-9]+")) {
			count++;
		}
	}
	System.out.println("Valid Numbers:"+count);
		
	}

}


