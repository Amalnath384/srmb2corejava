package Day10;
import java.util.*;
class Accdet{
	private int acno;
	private int acbal;
	Accdet(int acno,int acbal){
		this.acno=acno;
		this.acbal=acbal;
	}
	public String tostring(){
		return("Account no: "+acno+" "+"Balnnce: "+acbal);
	}
}
public class Account {
	public static void main(String []args){
	
		TreeMap<String,Accdet> ts=new TreeMap<String,Accdet>();
		ts.put("Amal",new Accdet(0012,10000));
		ts.put("Arun",new Accdet(0013,20000));
		ts.put("Akash",new Accdet(0014,30000));
		
		Set<Map.Entry<String,Accdet>> s=ts.entrySet();
		
		for(Map.Entry<String,Accdet> ref:s){
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
	}
	}
