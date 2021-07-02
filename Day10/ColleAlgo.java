package Day10;

import java.util.* ;

public class ColleAlgo {
	
	
public static void main(String[] args) {
	
		
		LinkedList<Integer> ref=new LinkedList<Integer>();
		ref.add(1);
		ref.add(5);
		ref.add(10);
		ref.add(101);
		ref.add(10001);
		
		Comparator <Integer> rev=Collections.reverseOrder();
		Collections.sort(ref,rev);
		for(int i:ref){
			System.out.println("reverse element are="+i);
		}
		Collections.shuffle(ref);
		for(int i:ref){
			System.out.println("shuffled element are="+i);
		}
		System.out.println("the maximum element="+Collections.max(ref));
		System.out.println("the maximum element="+Collections.min(ref));
		

	}


}
