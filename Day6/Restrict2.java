package Generic;
class abc<T> {
	  // Wrong, no static variables of type T.
	  static T ob;
	//  ja v  a2 s  .  c  o  m
	  // Wrong, no static method can use T.
	  static T getob() {
	    return ob;
	  }

	  // Wrong, no static method can access object of type T.
	  static void showob() {
	    System.out.println(ob);
	  }
	}
public class Restrict2 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub

}


	

}

