package Day10;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class details{
	private String eno;
	private String name;
	private String desi;
	
	details(String eno,String name,String desi){
		this.eno=eno;
		this.name=name;
		this.desi=desi;
	}
	public String toString(){
		return("Employee no: "+eno+" "+"Employee name: "+name+" "+"Designation: "+desi);
	}
	
}
public class Employee {

	public static void main(String[] args) {
		TreeMap<Integer,details> ts=new TreeMap<Integer,details>();
		
		ts.put(1,new details("Amal","A123","Dev"));
		ts.put(2,new details("Arun","A121","tes"));
		ts.put(3,new details("Bala","A122","Man"));
		
		
		
		
			System.out.println(ts.get(1));
		
		
	}
	}
