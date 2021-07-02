package Day10;

import java.util.TreeMap;

public class PhoneDairy {

	public static void main(String[] args) {
		
		TreeMap<String,String> ts=new TreeMap<String,String>();
		ts.put("Amal", "98745612332");
		ts.put("Arun", "98745612331");
		ts.put("Balaji", "98745612333");
		
		System.out.println("Phone Number: "+ts.get("Amal"));
		;
		

	}

}
